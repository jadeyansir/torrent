package com.torrent.zuel.recruitment.model.dto;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;
import java.sql.Timestamp;

public class StudentInfoDTO {
    @ApiModelProperty("主键")
    private Long id;
    @ApiModelProperty("学号")
    private Long stuUniCode;
    @ApiModelProperty("学生姓名")
    private String stuName;
    @ApiModelProperty("学生性别")
    private String stuSex;
    @ApiModelProperty("民族")
    private String stuNation;
    @ApiModelProperty("出生日期")
    private Date stuBirthDate;
    @ApiModelProperty("籍贯")
    private String stuOriginPlace;
    @ApiModelProperty("政治面貌")
    private String stuPolity;
    @ApiModelProperty("学校编码")
    private Long collegeUniCode;
    @ApiModelProperty("学校名称")
    private String collegeChiName;
    @ApiModelProperty("所在院系")
    private String stuAcademy;
    @ApiModelProperty("专业")
    private String stuMajor;
    @ApiModelProperty("所在年级")
    private Integer stuGrade;
    @ApiModelProperty("培养层次")
    private String stuTrainingLevel;
    @ApiModelProperty("学生类型")
    private String stuType;
    @ApiModelProperty("预计毕业时间")
    private Date stuGraduationDate;
    @ApiModelProperty("联系方式")
    private String stuTel;
    @ApiModelProperty("联系邮箱")
    private String stuEmail;
    @ApiModelProperty("工作单位")
    private String stuWorkUnit;
    @ApiModelProperty("单位地址")
    private String stuWorkAddress;
    @ApiModelProperty("单位电话")
    private String stuWorkTel;
    @ApiModelProperty("家庭住址")
    private String stuHomeAddress;
    @ApiModelProperty("家庭电话")
    private String stuHomeTel;
    @ApiModelProperty("审核状态(1:通过,2:待审核,3:不通过)")
    private Integer approvalStatus;
    @ApiModelProperty("是否删除:0表示没有删除,1表示删除")
    private Integer deleted;
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