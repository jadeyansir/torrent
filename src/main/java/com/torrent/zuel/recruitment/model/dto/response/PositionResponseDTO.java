package com.torrent.zuel.recruitment.model.dto.response;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

public class PositionResponseDTO {

    @ApiModelProperty("公司编码")
    private Long comUniCode;
    @ApiModelProperty("公司名称")
    private String comChiName;
    @ApiModelProperty("公司简称")
    private String comChiShortName;
    @ApiModelProperty("岗位描述")
    private String jobName;
    @ApiModelProperty("工作单位")
    private String jobWorkPlace;
    @ApiModelProperty("岗位类型")
    private String jobType;
    @ApiModelProperty("岗位要求年限")
    private Integer jobWorkBeginYear;
    @ApiModelProperty("岗位要求年限")
    private Integer jobWorkEndYear;
    @ApiModelProperty("技能描述")
    private String skill_info;
    @ApiModelProperty("岗位数量")
    private Integer jobNumber;
    @ApiModelProperty("岗位最小薪水")
    private BigDecimal jobMinSalary;
    @ApiModelProperty("岗位最大薪水")
    private BigDecimal jobMaxSalary;
    @ApiModelProperty("岗位职责")
    private String jobDuty;
    @ApiModelProperty("岗位要求")
    private String jobRequired;
    @ApiModelProperty("岗位福利")
    private String jobWelfare;

    public Long getComUniCode() {
        return comUniCode;
    }

    public void setComUniCode(Long comUniCode) {
        this.comUniCode = comUniCode;
    }

    public void setComChiName(String comChiName) {
        this.comChiName = comChiName;
    }

    public String getComChiName() {
        return comChiName;
    }

    public void setComChiShortName(String comChiShortName) {
        this.comChiShortName = comChiShortName;
    }

    public String getComChiShortName() {
        return comChiShortName;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobWorkPlace() {
        return jobWorkPlace;
    }

    public void setJobWorkPlace(String jobWorkPlace) {
        this.jobWorkPlace = jobWorkPlace;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public Integer getJobWorkBeginYear() {
        return jobWorkBeginYear;
    }

    public void setJobWorkBeginYear(Integer jobWorkBeginYear) {
        this.jobWorkBeginYear = jobWorkBeginYear;
    }

    public Integer getJobWorkEndYear() {
        return jobWorkEndYear;
    }

    public void setJobWorkEndYear(Integer jobWorkEndYear) {
        this.jobWorkEndYear = jobWorkEndYear;
    }

    public void setSkill_info(String skill_info) {
        this.skill_info = skill_info;
    }

    public String getSkill_info() {
        return skill_info;
    }

    public Integer getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(Integer jobNumber) {
        this.jobNumber = jobNumber;
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

    public String getJobDuty() {
        return jobDuty;
    }

    public void setJobDuty(String jobDuty) {
        this.jobDuty = jobDuty;
    }

    public String getJobRequired() {
        return jobRequired;
    }

    public void setJobRequired(String jobRequired) {
        this.jobRequired = jobRequired;
    }

    public String getJobWelfare() {
        return jobWelfare;
    }

    public void setJobWelfare(String jobWelfare) {
        this.jobWelfare = jobWelfare;
    }

}