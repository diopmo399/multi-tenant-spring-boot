package com.amran.dynamic.multitenant.mastertenant.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author Mohamed DIOP
 */
@Entity
@Table(name = "tbl_tenant_master")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MasterTenant implements Serializable {

    @Id
    @Column(name = "tenant_client_id")
    private String tenantClientId;

    @Size(max = 50)
    @Column(name = "db_name",nullable = false)
    private String dbName;

    @Size(max = 200)
    @Column(name = "url",nullable = false)
    private String url;

    @Size(max = 50)
    @Column(name = "user_name",nullable = false)
    private String userName;
    @Size(max = 100)
    @Column(name = "password",nullable = false)
    private String password;
    @Size(max = 100)
    @Column(name = "driver_class",nullable = false)
    private String driverClass;
    @Size(max = 10)
    @Column(name = "status",nullable = false)
    private String status;


    public String getTenantClientId() {
        return tenantClientId;
    }

    public MasterTenant setTenantClientId(String tenantClientId) {
        this.tenantClientId = tenantClientId;
        return this;
    }

    public String getDbName() {
        return dbName;
    }

    public MasterTenant setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public MasterTenant setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public MasterTenant setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public MasterTenant setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getDriverClass() {
        return driverClass;
    }

    public MasterTenant setDriverClass(String driverClass) {
        this.driverClass = driverClass;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public MasterTenant setStatus(String status) {
        this.status = status;
        return this;
    }
}
