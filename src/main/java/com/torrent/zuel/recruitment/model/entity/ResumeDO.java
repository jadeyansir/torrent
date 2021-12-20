package com.torrent.zuel.recruitment.model.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Table(name = "resume")
public class ResumeDO {
    /**
     * 主键
     */
    @Id
    @Column
    private Long id;
    /**
     * 学号
     */
    @Column
    private Long stuUniCode;
    /**
     * 岗位描述
     */
    @Column
    private String jobName;
    /**
     * 行业编码
     */
    @Column
    private Integer industryCode;
    /**
     * 行业名称
     */
    @Column
    private String industryName;
    /**
     * 工作性质
     */
    @Column
    private Integer jobType;
    /**
     * 期望岗位地点
     */
    @Column
    private String jobAddress;
    /**
     * 岗位期望最小薪水
     */
    @Column
    private BigDecimal jobMinSalary;
    /**
     * 岗位期望最大薪水
     */
    @Column
    private BigDecimal jobMaxSalary;
    /**
     * 求职状态(1:在校-找工作中,2:离校-找工作中,3:在校-看看机会,4:在校-暂不找工作)
     */
    @Column
    private Integer jobSearchStatus;
    /**
     * 是否删除:0表示没有删除,1表示删除
     */
    @Column
    private Integer deleted;
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