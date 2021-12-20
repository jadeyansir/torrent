package com.torrent.zuel.recruitment.model.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Table(name = "public_dict")
public class PublicDictDO {
    /**
     * 主键id
     */
    @Id
    @Column
    private Long id;
    /**
     * 参数系编码
     */
    @Column
    private Integer parameterSystemCode;
    /**
     * 参数系名称
     */
    @Column
    private String parameterSystemName;
    /**
     * 参数编码
     */
    @Column
    private Integer parameterCode;
    /**
     * 参数名称
     */
    @Column
    private String parameterName;
    /**
     * 是否有效(0：无效 1：有效)
     */
    @Column
    private Integer valid;
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
    /**
     * 参数说明
     */
    @Column
    private String parameterDesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getParameterSystemCode() {
        return parameterSystemCode;
    }

    public void setParameterSystemCode(Integer parameterSystemCode) {
        this.parameterSystemCode = parameterSystemCode;
    }

    public String getParameterSystemName() {
        return parameterSystemName;
    }

    public void setParameterSystemName(String parameterSystemName) {
        this.parameterSystemName = parameterSystemName;
    }

    public Integer getParameterCode() {
        return parameterCode;
    }

    public void setParameterCode(Integer parameterCode) {
        this.parameterCode = parameterCode;
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
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

    public String getParameterDesc() {
        return parameterDesc;
    }

    public void setParameterDesc(String parameterDesc) {
        this.parameterDesc = parameterDesc;
    }

}