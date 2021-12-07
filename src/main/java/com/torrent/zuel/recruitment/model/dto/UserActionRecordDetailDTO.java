package com.torrent.zuel.recruitment.model.dto;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;

public class UserActionRecordDetailDTO {
    @ApiModelProperty("主键id")
    private Integer id;
    @ApiModelProperty("用户行为表id")
    private Long userActionId;
    @ApiModelProperty("点击数据唯一标识字段业务类型 参考DataIdentifierTypeEnum")
    private Integer dataIdentifierType;
    @ApiModelProperty("具体点击的数据的唯一标识")
    private String dataIdentifier;
    @ApiModelProperty("点击次数")
    private Integer clickCount;
    @ApiModelProperty("创建时间")
    private Timestamp createTime;
    @ApiModelProperty("更新时间")
    private Timestamp updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getUserActionId() {
        return userActionId;
    }

    public void setUserActionId(Long userActionId) {
        this.userActionId = userActionId;
    }

    public Integer getDataIdentifierType() {
        return dataIdentifierType;
    }

    public void setDataIdentifierType(Integer dataIdentifierType) {
        this.dataIdentifierType = dataIdentifierType;
    }

    public String getDataIdentifier() {
        return dataIdentifier;
    }

    public void setDataIdentifier(String dataIdentifier) {
        this.dataIdentifier = dataIdentifier;
    }

    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    public Timestamp getCreateTime() {
        return createTime == null ? null : new Timestamp(createTime.getTime());
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime == null ? null : new Timestamp(createTime.getTime());
    }

    public Timestamp getUpdateTime() {
        return updateTime == null ? null : new Timestamp(updateTime.getTime());
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime == null ? null : new Timestamp(updateTime.getTime());
    }

}