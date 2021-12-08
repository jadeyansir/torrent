package com.torrent.zuel.recruitment.model.dto;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

public class ContractDTO {
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
    
}