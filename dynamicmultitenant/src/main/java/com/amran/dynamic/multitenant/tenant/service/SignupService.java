package com.amran.dynamic.multitenant.tenant.service;

import com.amran.dynamic.multitenant.mastertenant.entity.User;

/**
 * @author  Mohamed DIOP
 */
public interface SignupService {
    public String saveUser(User user);
}
