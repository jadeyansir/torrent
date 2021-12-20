package com.torrent.zuel.recruitment.model.dto.request;

import io.swagger.annotations.ApiModelProperty;

public class PublicDictRequestDTO {
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
    @ApiModelProperty("参数说明")
    private String parameterDesc;

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

    public void setValid(Integer valid) {
        this.valid = valid;
    }

    public Integer getValid() {
        return valid;
    }

    public String getParameterDesc() {
        return parameterDesc;
    }

    public void setParameterDesc(String parameterDesc) {
        this.parameterDesc = parameterDesc;
    }

}