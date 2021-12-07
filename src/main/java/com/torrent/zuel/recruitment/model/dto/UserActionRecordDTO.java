package com.torrent.zuel.recruitment.model.dto;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;
import java.sql.Timestamp;

public class UserActionRecordDTO {
    @ApiModelProperty("主键id")
    private Long id;
    @ApiModelProperty("用户id")
    private Long userId;
    @ApiModelProperty("用户手机号")
    private Long userTel;
    @ApiModelProperty("名称")
    private String name;
    @ApiModelProperty("用户代理OS")
    private String userAgent;
    @ApiModelProperty("设备类型(1 PC 2 移动版)")
    private Integer deviceType;
    @ApiModelProperty("埋点唯一编码")
    private String userActionCode;
    @ApiModelProperty("点击日期")
    private Date clickDate;
    @ApiModelProperty("点击次数")
    private Long clickCount;
    @ApiModelProperty("创建时间")
    private Timestamp createTime;
    @ApiModelProperty("创建人")
    private Long createBy;
    @ApiModelProperty("更新时间")
    private Timestamp updateTime;
    @ApiModelProperty("更新人")
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