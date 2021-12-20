package com.torrent.zuel.recruitment.model.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;

@Table(name = "student_info")
public class StudentInfoDO {
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
     * 学生姓名
     */
    @Column
    private String stuName;
    /**
     * 学生性别
     */
    @Column
    private String stuSex;
    /**
     * 民族
     */
    @Column
    private String stuNation;
    /**
     * 出生日期
     */
    @Column
    private Date stuBirthDate;
    /**
     * 籍贯
     */
    @Column
    private String stuOriginPlace;
    /**
     * 政治面貌
     */
    @Column
    private String stuPolity;
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
     * 所在院系
     */
    @Column
    private String stuAcademy;
    /**
     * 专业
     */
    @Column
    private String stuMajor;
    /**
     * 所在年级
     */
    @Column
    private Integer stuGrade;
    /**
     * 培养层次
     */
    @Column
    private String stuTrainingLevel;
    /**
     * 学生类型
     */
    @Column
    private String stuType;
    /**
     * 预计毕业时间
     */
    @Column
    private Date stuGraduationDate;
    /**
     * 联系方式
     */
    @Column
    private String stuTel;
    /**
     * 联系邮箱
     */
    @Column
    private String stuEmail;
    /**
     * 工作单位
     */
    @Column
    private String stuWorkUnit;
    /**
     * 单位地址
     */
    @Column
    private String stuWorkAddress;
    /**
     * 单位电话
     */
    @Column
    private String stuWorkTel;
    /**
     * 家庭住址
     */
    @Column
    private String stuHomeAddress;
    /**
     * 家庭电话
     */
    @Column
    private String stuHomeTel;
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

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public String getStuNation() {
        return stuNation;
    }

    public void setStuNation(String stuNation) {
        this.stuNation = stuNation;
    }

    public Date getStuBirthDate() {
        return stuBirthDate == null ? null : new Date(stuBirthDate.getTime());
    }

    public void setStuBirthDate(Date stuBirthDate) {
        this.stuBirthDate = stuBirthDate == null ? null : new Date(stuBirthDate.getTime());
    }

    public String getStuOriginPlace() {
        return stuOriginPlace;
    }

    public void setStuOriginPlace(String stuOriginPlace) {
        this.stuOriginPlace = stuOriginPlace;
    }

    public String getStuPolity() {
        return stuPolity;
    }

    public void setStuPolity(String stuPolity) {
        this.stuPolity = stuPolity;
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

    public String getStuAcademy() {
        return stuAcademy;
    }

    public void setStuAcademy(String stuAcademy) {
        this.stuAcademy = stuAcademy;
    }

    public String getStuMajor() {
        return stuMajor;
    }

    public void setStuMajor(String stuMajor) {
        this.stuMajor = stuMajor;
    }

    public Integer getStuGrade() {
        return stuGrade;
    }

    public void setStuGrade(Integer stuGrade) {
        this.stuGrade = stuGrade;
    }

    public String getStuTrainingLevel() {
        return stuTrainingLevel;
    }

    public void setStuTrainingLevel(String stuTrainingLevel) {
        this.stuTrainingLevel = stuTrainingLevel;
    }

    public String getStuType() {
        return stuType;
    }

    public void setStuType(String stuType) {
        this.stuType = stuType;
    }

    public Date getStuGraduationDate() {
        return stuGraduationDate == null ? null : new Date(stuGraduationDate.getTime());
    }

    public void setStuGraduationDate(Date stuGraduationDate) {
        this.stuGraduationDate = stuGraduationDate == null ? null : new Date(stuGraduationDate.getTime());
    }

    public String getStuTel() {
        return stuTel;
    }

    public void setStuTel(String stuTel) {
        this.stuTel = stuTel;
    }

    public String getStuEmail() {
        return stuEmail;
    }

    public void setStuEmail(String stuEmail) {
        this.stuEmail = stuEmail;
    }

    public String getStuWorkUnit() {
        return stuWorkUnit;
    }

    public void setStuWorkUnit(String stuWorkUnit) {
        this.stuWorkUnit = stuWorkUnit;
    }

    public String getStuWorkAddress() {
        return stuWorkAddress;
    }

    public void setStuWorkAddress(String stuWorkAddress) {
        this.stuWorkAddress = stuWorkAddress;
    }

    public String getStuWorkTel() {
        return stuWorkTel;
    }

    public void setStuWorkTel(String stuWorkTel) {
        this.stuWorkTel = stuWorkTel;
    }

    public String getStuHomeAddress() {
        return stuHomeAddress;
    }

    public void setStuHomeAddress(String stuHomeAddress) {
        this.stuHomeAddress = stuHomeAddress;
    }

    public String getStuHomeTel() {
        return stuHomeTel;
    }

    public void setStuHomeTel(String stuHomeTel) {
        this.stuHomeTel = stuHomeTel;
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