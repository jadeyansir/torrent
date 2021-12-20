package com.torrent.zuel.recruitment.model.entity;

import java.sql.*;
import javax.persistence.*;

@Table(name = "work_history")
public class WorkHistoryDO {
    /**
     * 主键id
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
     * 公司编码
     */
    @Column
    private Long comUniCode;
    /**
     * 公司名称
     */
    @Column
    private String comChiName;
    /**
     * 公司简称
     */
    @Column
    private String comChiShortName;
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
     * 月薪
     */
    @Column
    private Integer monthlySalary;
    /**
     * 工作开始时间
     */
    @Column
    private Date jobWorkBeginTime;
    /**
     * 工作结束时间
     */
    @Column
    private Date jobWorkEndTime;
    /**
     * 职位描述
     */
    @Column
    private String jobDetail;
    /**
     * 是否删除：0： 未删除。 1： 已删除
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
     * 更新人
     */
    @Column
    private Long updateBy;
    /**
     * 更新时间
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

    public String getComChiShortName() {
        return comChiShortName;
    }

    public void setComChiShortName(String comChiShortName) {
        this.comChiShortName = comChiShortName;
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