package com.torrent.zuel.recruitment.model.dto;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;
import java.sql.Timestamp;

public class DeliverDTO {
    @ApiModelProperty("主键")
    private Long id;
    @ApiModelProperty("学号")
    private Long stuUniCode;
    @ApiModelProperty("岗位id")
    private Long jobId;
    @ApiModelProperty("岗位描述")
    private String jobName;
    @ApiModelProperty("公司编码")
    private Long comUniCode;
    @ApiModelProperty("公司简称")
    private String comChiShortName;
    @ApiModelProperty("投递时间")
    private Date deliverDate;
    @ApiModelProperty("投递进度(1:已收藏,2:已投递,3:待面试,4:已面试,5:已录取,6:未录取,7:被拒绝)")
    private Integer deliverStatus;
    @ApiModelProperty("岗位是否过期(0表示岗位未过期,1表示未过期)")
    private Integer deleted;
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

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Long getComUniCode() {
        return comUniCode;
    }

    public void setComUniCode(Long comUniCode) {
        this.comUniCode = comUniCode;
    }

    public String getComChiShortName() {
        return comChiShortName;
    }

    public void setComChiShortName(String comChiShortName) {
        this.comChiShortName = comChiShortName;
    }

    public Date getDeliverDate() {
        return deliverDate == null ? null : new Date(deliverDate.getTime());
    }

    public void setDeliverDate(Date deliverDate) {
        this.deliverDate = deliverDate == null ? null : new Date(deliverDate.getTime());
    }

    public Integer getDeliverStatus() {
        return deliverStatus;
    }

    public void setDeliverStatus(Integer deliverStatus) {
        this.deliverStatus = deliverStatus;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public Timestamp getUpdateTime() {
        return updateTime == null ? null : new Timestamp(updateTime.getTime());
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime == null ? null : new Timestamp(updateTime.getTime());
    }

}