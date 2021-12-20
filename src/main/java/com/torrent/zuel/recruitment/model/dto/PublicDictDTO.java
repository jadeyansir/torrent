package com.torrent.zuel.recruitment.model.dto;

import java.sql.*;
import io.swagger.annotations.*;

public class PublicDictDTO {
    @ApiModelProperty("主键id")
    private Long id;
    @ApiModelProperty("参数系编码")
    private Integer parameterSystemCode;
    @ApiModelProperty("参数系名称")
    private String parameterSystemName;
    @ApiModelProperty("参数编码")
    private Integer parameterCode;
    @ApiModelProperty("参数名称")
    private String parameterName;
    @ApiModelProperty("是否有效(0：无效 1：有效)")
    private Integer valid;
    @ApiModelProperty("创建时间")
    private Timestamp createTime;
    @ApiModelProperty("更新时间")
    private Timestamp updateTime;
    @ApiModelProperty("参数说明")
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