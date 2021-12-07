package com.torrent.zuel.recruitment.model.dto;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;
import java.sql.Timestamp;

public class ContractDTO {
    @ApiModelProperty("主键")
    private Long id;
    @ApiModelProperty("学号")
    private Long stuUniCode;
    @ApiModelProperty("学生姓名")
    private String stuName;
    @ApiModelProperty("公司简称")
    private String comChiShortName;
    @ApiModelProperty("签约时间")
    private Date contractDate;
    @ApiModelProperty("签约状态(1:待签约,2:已签约,3:已拒绝)")
    private Integer contractStatus;
    @ApiModelProperty("合同图片oss链接")
    private String contractPicLink;
    @ApiModelProperty("合同图片key值")
    private String contractPicKey;
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

    public String getComChiShortName() {
        return comChiShortName;
    }

    public void setComChiShortName(String comChiShortName) {
        this.comChiShortName = comChiShortName;
    }

    public Date getContractDate() {
        return contractDate == null ? null : new Date(contractDate.getTime());
    }

    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate == null ? null : new Date(contractDate.getTime());
    }

    public Integer getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(Integer contractStatus) {
        this.contractStatus = contractStatus;
    }

    public String getContractPicLink() {
        return contractPicLink;
    }

    public void setContractPicLink(String contractPicLink) {
        this.contractPicLink = contractPicLink;
    }

    public String getContractPicKey() {
        return contractPicKey;
    }

    public void setContractPicKey(String contractPicKey) {
        this.contractPicKey = contractPicKey;
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