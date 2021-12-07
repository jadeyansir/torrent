package com.torrent.zuel.recruitment.model.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Table(name = "user_action_record_detail")
public class UserActionRecordDetailDO {
    /**
     * 主键id
     */
    @Id
    @Column
    private Integer id;
    /**
     * 用户行为表id
     */
    @Column
    private Long userActionId;
    /**
     * 点击数据唯一标识字段业务类型 参考DataIdentifierTypeEnum
     */
    @Column
    private Integer dataIdentifierType;
    /**
     * 具体点击的数据的唯一标识
     */
    @Column
    private String dataIdentifier;
    /**
     * 点击次数
     */
    @Column
    private Integer clickCount;
    /**
     * 创建时间
     */
    @Column
    private Timestamp createTime;
    /**
     * 更新时间
     */
    @Column
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