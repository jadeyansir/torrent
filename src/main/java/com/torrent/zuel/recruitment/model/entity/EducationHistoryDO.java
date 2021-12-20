package com.torrent.zuel.recruitment.model.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;

@Table(name = "education_history")
public class EducationHistoryDO {
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
     * 学校编码
     */
    @Column
    private Long collegeUniCode;
    /**
     * 学校名称
     */
    @Column
    private String collegeChiName;
    /**
     * 学历
     */
    @Column
    private Integer educationLevel;
    /**
     * 所学专业
     */
    @Column
    private String educationField;
    /**
     * 学历证书
     */
    @Column
    private Integer academicCertificates;
    /**
     * 工作开始时间
     */
    @Column
    private Date educationBeginTime;
    /**
     * 工作结束时间
     */
    @Column
    private Date educationEndTime;
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