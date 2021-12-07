package com.torrent.zuel.recruitment.model.entity;

import java.sql.*;
import javax.persistence.*;

@Table(name = "user_action_record")
public class UserActionRecordDO {
    /**
     * 主键id
     */
    @Id
    @Column
    private Long id;
    /**
     * 用户id
     */
    @Column
    private Long userId;
    /**
     * 用户手机号
     */
    @Column
    private Long userTel;
    /**
     * 名称
     */
    @Column
    private String name;
    /**
     * 用户代理OS
     */
    @Column
    private String userAgent;
    /**
     * 设备类型(1 PC 2 移动版)
     */
    @Column
    private Integer deviceType;
    /**
     * 埋点唯一编码
     */
    @Column
    private String userActionCode;
    /**
     * 点击日期
     */
    @Column
    private Date clickDate;
    /**
     * 点击次数
     */
    @Column
    private Long clickCount;
    /**
     * 创建时间
     */
    @Column
    private Timestamp createTime;
    /**
     * 创建人
     */
    @Column
    private Long createBy;
    /**
     * 更新时间
     */
    @Column
    private Timestamp updateTime;
    /**
     * 更新人
     */
    @Column
    private Long updateBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserTel() {
        return userTel;
    }

    public void setUserTel(Long userTel) {
        this.userTel = userTel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public Integer getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    public String getUserActionCode() {
        return userActionCode;
    }

    public void setUserActionCode(String userActionCode) {
        this.userActionCode = userActionCode;
    }

    public Date getClickDate() {
        return clickDate == null ? null : new Date(clickDate.getTime());
    }

    public void setClickDate(Date clickDate) {
        this.clickDate = clickDate == null ? null : new Date(clickDate.getTime());
    }

    public Long getClickCount() {
        return clickCount;
    }

    public void setClickCount(Long clickCount) {
        this.clickCount = clickCount;
    }

    public Timestamp getCreateTime() {
        return createTime == null ? null : new Timestamp(createTime.getTime());
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime == null ? null : new Timestamp(createTime.getTime());
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Timestamp getUpdateTime() {
        return updateTime == null ? null : new Timestamp(updateTime.getTime());
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime == null ? null : new Timestamp(updateTime.getTime());
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

}