package com.ryan.authentication.domain;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by ryan.shen on 9/27/2018
 */
@MappedSuperclass
public class BaseEntity implements Serializable {

    @Column(name = "create_by")
    private Long createdBy;

    @Column(name = "create_timr")
    private Date createTime;

    @Column(name = "update_by")
    private Long updatedBy;

    @Column(name = "update_time")
    private Date updateTime;

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @PrePersist
    public void prePresist() {
        this.createTime = new Date();
        this.updateTime = new Date();
    }

    @PreUpdate
    public void preUpdate(){
        this.updateTime = new Date();
    }
}
