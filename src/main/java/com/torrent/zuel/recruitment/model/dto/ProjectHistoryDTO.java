package com.torrent.zuel.recruitment.model.dto;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;
import java.sql.Timestamp;

public class ProjectHistoryDTO {
    @ApiModelProperty("主键id")
    private Long id;
    @ApiModelProperty("学号")
    private Long stuUniCode;
    @ApiModelProperty("公司编码")
    private Long comUniCode;
    @ApiModelProperty("公司名称")
    private String comChiName;
    @ApiModelProperty("公司简称")
    private String comChiShortName;
    @ApiModelProperty("项目名称")
    private String projectName;
    @ApiModelProperty("项目开始时间")
    private Date projectBeginTime;
    @ApiModelProperty("项目结束时间")
    private Date projectEndTime;
    @ApiModelProperty("项目描述")
    private String projectDetail;
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

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Date getProjectBeginTime() {
        return projectBeginTime == null ? null : new Date(projectBeginTime.getTime());
    }

    public void setProjectBeginTime(Date projectBeginTime) {
        this.projectBeginTime = projectBeginTime == null ? null : new Date(projectBeginTime.getTime());
    }

    public Date getProjectEndTime() {
        return projectEndTime == null ? null : new Date(projectEndTime.getTime());
    }

    public void setProjectEndTime(Date projectEndTime) {
        this.projectEndTime = projectEndTime == null ? null : new Date(projectEndTime.getTime());
    }

    public String getProjectDetail() {
        return projectDetail;
    }

    public void setProjectDetail(String projectDetail) {
        this.projectDetail = projectDetail;
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