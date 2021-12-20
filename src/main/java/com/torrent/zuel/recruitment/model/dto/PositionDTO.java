package com.torrent.zuel.recruitment.model.dto;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class PositionDTO {
    @ApiModelProperty("主键")
    private Long id;
    @ApiModelProperty("公司编码")
    private Long comUniCode;
    @ApiModelProperty("岗位描述")
    private String jobName;
    @ApiModelProperty("工作单位")
    private String jobWorkPlace;
    @ApiModelProperty("岗位类型")
    private Integer jobType;
    @ApiModelProperty("岗位地点")
    private Integer jobAddress;
    @ApiModelProperty("学历(1:博士;2:硕士;3:学士;4:专科;5:高中及以下)")
    private Integer educationLevel;
    @ApiModelProperty("岗位要求年限")
    private Integer jobWorkBeginYear;
    @ApiModelProperty("岗位要求年限")
    private Integer jobWorkEndYear;
    @ApiModelProperty("岗位数量")
    private Integer jobNumber;
    @ApiModelProperty("岗位最小薪水")
    private BigDecimal jobMinSalary;
    @ApiModelProperty("岗位最大薪水")
    private BigDecimal jobMaxSalary;
    @ApiModelProperty("技能编码(以逗号隔开)")
    private String skillUniCode;
    @ApiModelProperty("岗位职责")
    private String jobDuty;
    @ApiModelProperty("岗位要求")
    private String jobRequired;
    @ApiModelProperty("岗位福利")
    private String jobWelfare;
    @ApiModelProperty("审核状态(1:通过,2:待审核,3:不通过)")
    private Integer approvalStatus;
    @ApiModelProperty("是否删除:0表示没有删除,1表示删除")
    private Integer deleted;
    @ApiModelProperty("公司类型")
    private Integer comType;
    @ApiModelProperty("公司规模")
    private Integer comSize;
    @ApiModelProperty("行业")
    private Integer jobIndustry;
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

    public Long getComUniCode() {
        return comUniCode;
    }

    public void setComUniCode(Long comUniCode) {
        this.comUniCode = comUniCode;
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

    public Integer getJobType() {
        return jobType;
    }

    public void setJobType(Integer jobType) {
        this.jobType = jobType;
    }

    public Integer getJobAddress() {
        return jobAddress;
    }

    public void setJobAddress(Integer jobAddress) {
        this.jobAddress = jobAddress;
    }

    public Integer getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(Integer educationLevel) {
        this.educationLevel = educationLevel;
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

    public String getSkillUniCode() {
        return skillUniCode;
    }

    public void setSkillUniCode(String skillUniCode) {
        this.skillUniCode = skillUniCode;
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

    public Integer getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(Integer approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Integer getComType() {
        return comType;
    }

    public void setComType(Integer comType) {
        this.comType = comType;
    }

    public Integer getComSize() {
        return comSize;
    }

    public void setComSize(Integer comSize) {
        this.comSize = comSize;
    }

    public void setJobIndustry(Integer jobIndustry) {
        this.jobIndustry = jobIndustry;
    }

    public Integer getJobIndustry() {
        return jobIndustry;
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