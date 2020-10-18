package com.amran.dynamic.multitenant.mastertenant.repository;

import com.amran.dynamic.multitenant.mastertenant.entity.MasterTenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Mohamed DIOP
 */
@Repository
public interface MasterTenantRepository extends JpaRepository<MasterTenant, String> {
    MasterTenant findByTenantClientId(String clientId);
}
