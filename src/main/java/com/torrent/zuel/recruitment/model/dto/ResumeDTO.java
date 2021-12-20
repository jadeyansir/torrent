package com.torrent.zuel.recruitment.model.dto;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class ResumeDTO {
    @ApiModelProperty("主键")
    private Long id;
    @ApiModelProperty("学号")
    private Long stuUniCode;
    @ApiModelProperty("岗位描述")
    private String jobName;
    @ApiModelProperty("行业编码")
    private Integer industryCode;
    @ApiModelProperty("行业名称")
    private String industryName;
    @ApiModelProperty("工作性质")
    private Integer jobType;
    @ApiModelProperty("期望岗位地点")
    private String jobAddress;
    @ApiModelProperty("岗位期望最小薪水")
    private BigDecimal jobMinSalary;
    @ApiModelProperty("岗位期望最大薪水")
    private BigDecimal jobMaxSalary;
    @ApiModelProperty("求职状态(1:在校-找工作中,2:离校-找工作中,3:在校-看看机会,4:在校-暂不找工作)")
    private Integer jobSearchStatus;
    @ApiModelProperty("是否删除:0表示没有删除,1表示删除")
    private Integer deleted;
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

    public Long getStuUniCode() {
        return stuUniCode;
    }

    public void setStuUniCode(Long stuUniCode) {
        this.stuUniCode = stuUniCode;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Integer getIndustryCode() {
        return industryCode;
    }

    public void setIndustryCode(Integer industryCode) {
        this.industryCode = industryCode;
    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName;
    }

    public Integer getJobType() {
        return jobType;
    }

    public void setJobType(Integer jobType) {
        this.jobType = jobType;
    }

    public String getJobAddress() {
        return jobAddress;
    }

    public void setJobAddress(String jobAddress) {
        this.jobAddress = jobAddress;
    }

    public BigDecimal getJobMinSalary() {
        return jobMinSalary;
    }

    public void setJobMinSalary(BigDecimal jobMinSalary) {
        this.jobMinSalary = jobMinSalary;
    }

    public BigDecimal getJobMaxSalary() {
        return jobMaxSalary;
    }

    public void setJobMaxSalary(BigDecimal jobMaxSalary) {
        this.jobMaxSalary = jobMaxSalary;
    }

    public Integer getJobSearchStatus() {
        return jobSearchStatus;
    }

    public void setJobSearchStatus(Integer jobSearchStatus) {
        this.jobSearchStatus = jobSearchStatus;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
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