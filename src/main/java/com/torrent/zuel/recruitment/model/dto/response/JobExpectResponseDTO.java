package com.torrent.zuel.recruitment.model.dto.response;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

public class JobExpectResponseDTO {

    @ApiModelProperty("id")
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

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
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

}