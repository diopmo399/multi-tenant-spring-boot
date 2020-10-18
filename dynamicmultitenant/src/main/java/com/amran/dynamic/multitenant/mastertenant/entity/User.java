package com.amran.dynamic.multitenant.mastertenant.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author Mohamed DIOP
 */
@Entity
@Table(name = "tbl_user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;

    @Size(max = 100)
    @Column(name = "full_name",nullable = false)
    private String fullName;
    @Size(max = 50)
    @Column(name = "user_name",nullable = false,unique = true)
    private String userName;
    @Size(max = 50)
    @Column(name = "domain",nullable = false,unique = true)
    private String domain;
    @Size(max = 100)
    @Column(name = "password",nullable = false)
    private String password;
    @Size(max = 10)
    @Column(name = "status",nullable = false)
    private String status;

    public User() {
    }

    public User(@Size(max = 100) String fullName, @Size(max = 50) String userName, @Size(max = 50) String domain, @Size(max = 100) String password, @Size(max = 10) String status) {
        this.fullName = fullName;
        this.userName = userName;
        this.domain = domain;
        this.password = password;
        this.status = status;
    }

    public Integer getUserId() {
        return userId;
    }

    public User setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public User setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getDomain() {
        return domain;
    }

    public User setDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public User setStatus(String status) {
        this.status = status;
        return this;
    }
}
