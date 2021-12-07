package com.torrent.zuel.recruitment.model.dto;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;

public class ComInfoDTO {
    @ApiModelProperty("主键")
    private Long id;
    @ApiModelProperty("公司统一编码")
    private Long comUniCode;
    @ApiModelProperty("公司名称")
    private String comChiName;
    @ApiModelProperty("公司简称")
    private String comChiShortName;
    @ApiModelProperty("公司英文名称")
    private String comEngName;
    @ApiModelProperty("公司注册地址")
    private String comRegAddress;
    @ApiModelProperty("公司经营范围")
    private String comMainBusiness;
    @ApiModelProperty("工商登记号_营业执照注册号")
    private String comRegCode;
    @ApiModelProperty("员工总数")
    private Integer comStaffSum;
    @ApiModelProperty("注册机关")
    private String comRegAgency;
    @ApiModelProperty("公司网址")
    private String comWeb;
    @ApiModelProperty("公司电话")
    private String comTel;
    @ApiModelProperty("公司简介")
    private String comPro;
    @ApiModelProperty("学校图片oss链接")
    private String comPicLink;
    @ApiModelProperty("学校图片key值")
    private String comPicKey;
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

    public String getComEngName() {
        return comEngName;
    }

    public void setComEngName(String comEngName) {
        this.comEngName = comEngName;
    }

    public String getComRegAddress() {
        return comRegAddress;
    }

    public void setComRegAddress(String comRegAddress) {
        this.comRegAddress = comRegAddress;
    }

    public String getComMainBusiness() {
        return comMainBusiness;
    }

    public void setComMainBusiness(String comMainBusiness) {
        this.comMainBusiness = comMainBusiness;
    }

    public String getComRegCode() {
        return comRegCode;
    }

    public void setComRegCode(String comRegCode) {
        this.comRegCode = comRegCode;
    }

    public Integer getComStaffSum() {
        return comStaffSum;
    }

    public void setComStaffSum(Integer comStaffSum) {
        this.comStaffSum = comStaffSum;
    }

    public String getComRegAgency() {
        return comRegAgency;
    }

    public void setComRegAgency(String comRegAgency) {
        this.comRegAgency = comRegAgency;
    }

    public String getComWeb() {
        return comWeb;
    }

    public void setComWeb(String comWeb) {
        this.comWeb = comWeb;
    }

    public String getComTel() {
        return comTel;
    }

    public void setComTel(String comTel) {
        this.comTel = comTel;
    }

    public String getComPro() {
        return comPro;
    }

    public void setComPro(String comPro) {
        this.comPro = comPro;
    }

    public String getComPicLink() {
        return comPicLink;
    }

    public void setComPicLink(String comPicLink) {
        this.comPicLink = comPicLink;
    }

    public String getComPicKey() {
        return comPicKey;
    }

    public void setComPicKey(String comPicKey) {
        this.comPicKey = comPicKey;
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