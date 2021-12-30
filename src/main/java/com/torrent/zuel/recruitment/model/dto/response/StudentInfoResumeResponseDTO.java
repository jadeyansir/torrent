package com.torrent.zuel.recruitment.model.dto.response;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class StudentInfoResumeResponseDTO {
    @ApiModelProperty("学号")
    private Long stuUniCode;
    @ApiModelProperty("学生姓名")
    private String stuName;
    @ApiModelProperty("学生性别")
    private String stuSex;
    @ApiModelProperty("出生日期")
    private Date stuBirthDate;
    @ApiModelProperty("政治面貌")
    private String stuPolity;
    @ApiModelProperty("预计毕业时间")
    private Date stuGraduationDate;
    @ApiModelProperty("联系方式")
    private String stuTel;
    @ApiModelProperty("联系邮箱")
    private String stuEmail;
    @ApiModelProperty("家庭住址")
    private String stuHomeAddress;

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

    public Date getStuBirthDate() {
        return stuBirthDate == null ? null : new Date(stuBirthDate.getTime());
    }

    public void setStuBirthDate(Date stuBirthDate) {
        this.stuBirthDate = stuBirthDate == null ? null : new Date(stuBirthDate.getTime());
    }

    public String getStuPolity() {
        return stuPolity;
    }

    public void setStuPolity(String stuPolity) {
        this.stuPolity = stuPolity;
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

    public String getStuHomeAddress() {
        return stuHomeAddress;
    }

    public void setStuHomeAddress(String stuHomeAddress) {
        this.stuHomeAddress = stuHomeAddress;
    }


}