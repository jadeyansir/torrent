package com.torrent.zuel.recruitment.model.dto;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;
import java.sql.Timestamp;

public class WorkHistoryDTO {
    @ApiModelProperty("主键id")
    private Long id;
    @ApiModelProperty("学号")
    private Long stuUniCode;
    @ApiModelProperty("公司编码")
    private Long comUniCode;
    @ApiModelProperty("公司名称")
    private String comChiName;
    @ApiModelProperty("公司简称")
    private String comChiShortName;
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
    @ApiModelProperty("是否删除：0： 未删除。 1： 已删除")
    private Integer deleted;
    @ApiModelProperty("创建人")
    private Long createBy;
    @ApiModelProperty("创建时间")
    private Timestamp createTime;
    @ApiModelProperty("更新人")
    private Long updateBy;
    @ApiModelProperty("更新时间")
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