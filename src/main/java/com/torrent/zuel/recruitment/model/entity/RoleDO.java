package com.torrent.zuel.recruitment.model.entity;

import java.sql.*;
import javax.persistence.*;

@Table(name = "role")
public class RoleDO {
    /**
     * 主建
     */
    @Id
    @Column
    private Long id;
    /**
     * 角色名称
     */
    @Column
    private String roleName;
    /**
     * 角色描述
     */
    @Column
    private String roleDesc;
    /**
     * 创建人
     */
    @Column
    private Long createBy;
    /**
     * 创建时间
     */
    @Column
    private Timestamp createTime;
    /**
     * 修改人
     */
    @Column
    private Long updateBy;
    /**
     * 修改时间
     */
    @Column
    private Timestamp updateTime;
    /**
     * 最后更新人的账号
     */
    @Column
    private String lastUpdateAccount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Timestamp getCreateTime() {
        return createTime == null ? null : new Timestamp(createTime.getTime());
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime == null ? null : new Timestamp(createTime.getTime());
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public Timestamp getUpdateTime() {
        return updateTime == null ? null : new Timestamp(updateTime.getTime());
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime == null ? null : new Timestamp(updateTime.getTime());
    }

    public String getLastUpdateAccount() {
        return lastUpdateAccount;
    }

    public void setLastUpdateAccount(String lastUpdateAccount) {
        this.lastUpdateAccount = lastUpdateAccount;
    }

}