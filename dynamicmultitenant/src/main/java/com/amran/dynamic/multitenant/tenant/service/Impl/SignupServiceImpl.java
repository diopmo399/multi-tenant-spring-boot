package com.amran.dynamic.multitenant.tenant.service.Impl;

import com.amran.dynamic.multitenant.mastertenant.entity.MasterTenant;
import com.amran.dynamic.multitenant.mastertenant.entity.User;
import com.amran.dynamic.multitenant.mastertenant.repository.MasterTenantRepository;
import com.amran.dynamic.multitenant.mastertenant.repository.UserRepository;
import com.amran.dynamic.multitenant.tenant.service.SignupService;
import com.amran.dynamic.multitenant.util.InitializeDB;
import com.amran.dynamic.multitenant.util.TenantDB;
import com.amran.dynamic.multitenant.util.VARIABLES_UTILS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SignupServiceImpl implements SignupService, TenantDB, InitializeDB {

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    UserRepository userRepository;
    @Autowired
    MasterTenantRepository masterTenantRepository;


    @Override
    public String saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        creatNewTenant(user.getDomain());
        initializeDB(user.getDomain());
        userRepository.save(user);
        MasterTenant tenant = MasterTenant.builder()
                .dbName(user.getDomain() + "_db")
                .tenantClientId(user.getDomain())
                .driverClass(VARIABLES_UTILS.DRIVERS_CLASS)
                .url(VARIABLES_UTILS.URL_MYSQL_INITIALE + user.getDomain() + "_db" + VARIABLES_UTILS.URL_MYSQL_FIN)
                .userName(VARIABLES_UTILS.USERS_NAME)
                .password(VARIABLES_UTILS.PASSWORD)
                .status(VARIABLES_UTILS.STATUS_ACTIVE)
                .build();
        masterTenantRepository.save(tenant);
        return null;
    }

}
