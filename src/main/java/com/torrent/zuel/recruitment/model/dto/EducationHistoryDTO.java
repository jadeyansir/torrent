package com.torrent.zuel.recruitment.model.dto;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;
import java.sql.Timestamp;

public class EducationHistoryDTO {
    @ApiModelProperty("主键id")
    private Long id;
    @ApiModelProperty("学号")
    private Long stuUniCode;
    @ApiModelProperty("学校编码")
    private Long collegeUniCode;
    @ApiModelProperty("学校名称")
    private String collegeChiName;
    @ApiModelProperty("学历")
    private Integer educationLevel;
    @ApiModelProperty("所学专业")
    private String educationField;
    @ApiModelProperty("学历证书")
    private Integer academicCertificates;
    @ApiModelProperty("工作开始时间")
    private Date educationBeginTime;
    @ApiModelProperty("工作结束时间")
    private Date educationEndTime;
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

    public Long getCollegeUniCode() {
        return collegeUniCode;
    }

    public void setCollegeUniCode(Long collegeUniCode) {
        this.collegeUniCode = collegeUniCode;
    }

    public String getCollegeChiName() {
        return collegeChiName;
    }

    public void setCollegeChiName(String collegeChiName) {
        this.collegeChiName = collegeChiName;
    }

    public Integer getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(Integer educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getEducationField() {
        return educationField;
    }

    public void setEducationField(String educationField) {
        this.educationField = educationField;
    }

    public Integer getAcademicCertificates() {
        return academicCertificates;
    }

    public void setAcademicCertificates(Integer academicCertificates) {
        this.academicCertificates = academicCertificates;
    }

    public Date getEducationBeginTime() {
        return educationBeginTime == null ? null : new Date(educationBeginTime.getTime());
    }

    public void setEducationBeginTime(Date educationBeginTime) {
        this.educationBeginTime = educationBeginTime == null ? null : new Date(educationBeginTime.getTime());
    }

    public Date getEducationEndTime() {
        return educationEndTime == null ? null : new Date(educationEndTime.getTime());
    }

    public void setEducationEndTime(Date educationEndTime) {
        this.educationEndTime = educationEndTime == null ? null : new Date(educationEndTime.getTime());
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