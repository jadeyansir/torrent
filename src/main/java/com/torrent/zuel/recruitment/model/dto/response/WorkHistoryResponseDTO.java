package com.torrent.zuel.recruitment.model.dto.response;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class WorkHistoryResponseDTO {
    @ApiModelProperty("主键id")
    private Long id;
    @ApiModelProperty("学号")
    private Long stuUniCode;
    @ApiModelProperty("公司编码")
    private Long comUniCode;
    @ApiModelProperty("公司名称")
    private String comChiName;
    @ApiModelProperty("行业编码")
    private Integer industryCode;
    @ApiModelProperty("行业名称")
    private String industryName;
    @ApiModelProperty("月薪")
    private Integer monthlySalary;
    @ApiModelProperty("工作开始时间")
    private Date jobWorkBeginTime;
    @ApiModelProperty("工作结束时间")
    private Date jobWorkEndTime;
    @ApiModelProperty("职位描述")
    private String jobDetail;

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

    public Long getComUniCode() {
        return comUniCode;
    }

    public void setComUniCode(Long comUniCode) {
        this.comUniCode = comUniCode;
    }

    public String getComChiName() {
        return comChiName;
    }

    public void setComChiName(String comChiName) {
        this.comChiName = comChiName;
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

    public Integer getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(Integer monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public Date getJobWorkBeginTime() {
        return jobWorkBeginTime == null ? null : new Date(jobWorkBeginTime.getTime());
    }

    public void setJobWorkBeginTime(Date jobWorkBeginTime) {
        this.jobWorkBeginTime = jobWorkBeginTime == null ? null : new Date(jobWorkBeginTime.getTime());
    }

    public Date getJobWorkEndTime() {
        return jobWorkEndTime == null ? null : new Date(jobWorkEndTime.getTime());
    }

    public void setJobWorkEndTime(Date jobWorkEndTime) {
        this.jobWorkEndTime = jobWorkEndTime == null ? null : new Date(jobWorkEndTime.getTime());
    }

    public String getJobDetail() {
        return jobDetail;
    }

    public void setJobDetail(String jobDetail) {
        this.jobDetail = jobDetail;
    }
    
}