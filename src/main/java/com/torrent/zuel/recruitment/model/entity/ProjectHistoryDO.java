package com.torrent.zuel.recruitment.model.entity;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Table(name = "project_history")
public class ProjectHistoryDO {
    /**
     * 主键id
     */
    @Id
    @Column
    @ApiModelProperty("主键id")
    private Long id;
    /**
     * 学号
     */
    @Column
    @ApiModelProperty("学号")
    private Long stuUniCode;
    @Column
    private Long zdlDoTest;



    /**
     * 公司编码
     */
    @Column
    private Long comUniCode;
    /**
     * 公司名称
     */
    @Column
    private String comChiName;
    /**
     * 公司简称
     */
    @Column
    private String comChiShortName;
    /**
     * 项目名称
     */
    @Column
    private String projectName;
    /**
     * 项目开始时间
     */
    @Column
    private Date projectBeginTime;
    /**
     * 项目结束时间
     */
    @Column
    private Date projectEndTime;
    /**
     * 职位描述
     */
    @Column
    private String projectDetail;
    /**
     * 是否删除：0： 未删除。 1： 已删除
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
     * 更新人
     */
    @Column
    private Long updateBy;
    /**
     * 更新时间
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

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = Objects.isNull(updateTime) ? null : new Timestamp(updateTime.getTime());
    }

    public Timestamp getUpdateTime() {
        return Objects.isNull(updateTime) ? null : new Timestamp(updateTime.getTime());
    }
}