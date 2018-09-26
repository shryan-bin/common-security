package com.ryan.authentication.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author ryan.shen
 */
@Entity
@Table(name = "t_pub_permission")
public class Permission extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "permission_id")
    private Long permissionId;

    @Column(name = "permission_code")
    private String permissionCode;

    @Column(name = "parent_permission_code")
    private String parentPermissionCode;

    @Column(name = "description")
    private String permissionDescription;

    @Column(name = "status")
    private Integer status;

    @Column(name = "api_path")
    private String apiPath;

    @Column(name = "permission_type")
    private Long permissionType;

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionCode() {
        return permissionCode;
    }

    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode;
    }

    public String getParentPermissionCode() {
        return parentPermissionCode;
    }

    public void setParentPermissionCode(String parentPermissionCode) {
        this.parentPermissionCode = parentPermissionCode;
    }

    public String getPermissionDescription() {
        return permissionDescription;
    }

    public void setPermissionDescription(String permissionDescription) {
        this.permissionDescription = permissionDescription;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getApiPath() {
        return apiPath;
    }

    public void setApiPath(String apiPath) {
        this.apiPath = apiPath;
    }

    public Long getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(Long permissionType) {
        this.permissionType = permissionType;
    }
}
