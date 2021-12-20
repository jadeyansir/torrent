package com.torrent.zuel.recruitment.model.dto;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;
import java.sql.Timestamp;

public class StudentOfficerDTO {
    @ApiModelProperty("主键id")
    private Long id;
    @ApiModelProperty("学号")
    private Long stuUniCode;
    @ApiModelProperty("干部名称")
    private String officerName;
    @ApiModelProperty("任职开始时间")
    private Date serveBeginTime;
    @ApiModelProperty("任职结束时间")
    private Date serveEndTime;
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

    public String getOfficerName() {
        return officerName;
    }

    public void setOfficerName(String officerName) {
        this.officerName = officerName;
    }

    public Date getServeBeginTime() {
        return serveBeginTime == null ? null : new Date(serveBeginTime.getTime());
    }

    public void setServeBeginTime(Date serveBeginTime) {
        this.serveBeginTime = serveBeginTime == null ? null : new Date(serveBeginTime.getTime());
    }

    public Date getServeEndTime() {
        return serveEndTime == null ? null : new Date(serveEndTime.getTime());
    }

    public void setServeEndTime(Date serveEndTime) {
        this.serveEndTime = serveEndTime == null ? null : new Date(serveEndTime.getTime());
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