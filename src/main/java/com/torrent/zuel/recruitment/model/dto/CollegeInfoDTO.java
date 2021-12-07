package com.torrent.zuel.recruitment.model.dto;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;

public class CollegeInfoDTO {
    @ApiModelProperty("主键")
    private Long id;
    @ApiModelProperty("学校编码")
    private Long collegeUniCode;
    @ApiModelProperty("学校名称")
    private String collegeChiName;
    @ApiModelProperty("学校简称")
    private String collegeChiShortName;
    @ApiModelProperty("学校英文名称")
    private String collegeEngName;
    @ApiModelProperty("学校成立日期")
    private String collegeEstDate;
    @ApiModelProperty("用户手机号")
    private String collegeTel;
    @ApiModelProperty("学校地址")
    private String collegeAddress;
    @ApiModelProperty("学校特色")
    private String collegeFeatures;
    @ApiModelProperty("学校网址")
    private String collegeWeb;
    @ApiModelProperty("学校图片oss链接")
    private String collegePicLink;
    @ApiModelProperty("学校图片key值")
    private String collegePicKey;
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

    public String getCollegeChiShortName() {
        return collegeChiShortName;
    }

    public void setCollegeChiShortName(String collegeChiShortName) {
        this.collegeChiShortName = collegeChiShortName;
    }

    public String getCollegeEngName() {
        return collegeEngName;
    }

    public void setCollegeEngName(String collegeEngName) {
        this.collegeEngName = collegeEngName;
    }

    public String getCollegeEstDate() {
        return collegeEstDate;
    }

    public void setCollegeEstDate(String collegeEstDate) {
        this.collegeEstDate = collegeEstDate;
    }

    public String getCollegeTel() {
        return collegeTel;
    }

    public void setCollegeTel(String collegeTel) {
        this.collegeTel = collegeTel;
    }

    public String getCollegeAddress() {
        return collegeAddress;
    }

    public void setCollegeAddress(String collegeAddress) {
        this.collegeAddress = collegeAddress;
    }

    public String getCollegeFeatures() {
        return collegeFeatures;
    }

    public void setCollegeFeatures(String collegeFeatures) {
        this.collegeFeatures = collegeFeatures;
    }

    public String getCollegeWeb() {
        return collegeWeb;
    }

    public void setCollegeWeb(String collegeWeb) {
        this.collegeWeb = collegeWeb;
    }

    public String getCollegePicLink() {
        return collegePicLink;
    }

    public void setCollegePicLink(String collegePicLink) {
        this.collegePicLink = collegePicLink;
    }

    public String getCollegePicKey() {
        return collegePicKey;
    }

    public void setCollegePicKey(String collegePicKey) {
        this.collegePicKey = collegePicKey;
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