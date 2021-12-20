package com.torrent.zuel.recruitment.model.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Table(name = "position")
public class PositionDO {
    /**
     * 主键
     */
    @Id
    @Column
    private Long id;
    /**
     * 公司编码
     */
    @Column
    private Long comUniCode;
    /**
     * 岗位描述
     */
    @Column
    private String jobName;
    /**
     * 工作单位
     */
    @Column
    private String jobWorkPlace;
    /**
     * 岗位类型
     */
    @Column
    private Integer jobType;
    /**
     * 岗位地点
     */
    @Column
    private Integer jobAddress;
    /**
     * 学历(1:博士;2:硕士;3:学士;4:专科;5:高中及以下)
     */
    @Column
    private Integer educationLevel;
    /**
     * 岗位要求年限
     */
    @Column
    private Integer jobWorkBeginYear;
    /**
     * 岗位要求年限
     */
    @Column
    private Integer jobWorkEndYear;
    /**
     * 岗位数量
     */
    @Column
    private Integer jobNumber;
    /**
     * 岗位最小薪水
     */
    @Column
    private BigDecimal jobMinSalary;
    /**
     * 岗位最大薪水
     */
    @Column
    private BigDecimal jobMaxSalary;
    /**
     * 技能编码(以逗号隔开)
     */
    @Column
    private String skillUniCode;
    /**
     * 岗位职责
     */
    @Column
    private String jobDuty;
    /**
     * 岗位要求
     */
    @Column
    private String jobRequired;
    /**
     * 岗位福利
     */
    @Column
    private String jobWelfare;
    /**
     * 审核状态(1:通过,2:待审核,3:不通过)
     */
    @Column
    private Integer approvalStatus;
    /**
     * 是否删除:0表示没有删除,1表示删除
     */
    @Column
    private Integer deleted;
    /**
     * 公司类型
     */
    @Column
    private Integer comType;
    /**
     * 公司规模
     */
    @Column
    private Integer comSize;
    /**
     * 公司规模
     */
    @Column
    private Integer jobIndustry;
    /**
     * 创建人
     */
    @Column
    private Long createBy;
    /**
     * 创建时间
     */
    @Column
    private Timestamp createTime;
    /**
     * 修改人
     */
    @Column
    private Long updateBy;
    /**
     * 修改时间
     */
    @Column
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