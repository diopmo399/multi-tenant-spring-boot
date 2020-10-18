package com.amran.dynamic.multitenant.mastertenant.repository;

import com.amran.dynamic.multitenant.mastertenant.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Mohamed DIOP
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUserName(String userName);
}
