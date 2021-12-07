package com.torrent.zuel.recruitment.model.dto;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;

public class IndustryDTO {
    @ApiModelProperty("主键")
    private Long id;
    @ApiModelProperty("行业编码")
    private Long industryUniCode;
    @ApiModelProperty("行业信息")
    private String industryInfo;
    @ApiModelProperty("创建人")
    private Long createBy;
    @ApiModelProperty("创建时间")
    private Timestamp createTime;
    @ApiModelProperty("修改人")
    private Long updateBy;
    @ApiModelProperty("修改时间")
    private Timestamp updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIndustryUniCode() {
        return industryUniCode;
    }

    public void setIndustryUniCode(Long industryUniCode) {
        this.industryUniCode = industryUniCode;
    }

    public String getIndustryInfo() {
        return industryInfo;
    }

    public void setIndustryInfo(String industryInfo) {
        this.industryInfo = industryInfo;
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

}