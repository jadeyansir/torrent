package com.torrent.zuel.recruitment.model.entity;

import java.sql.*;
import javax.persistence.*;

@Table(name = "student_officer")
public class StudentOfficerDO {
    /**
     * 主键id
     */
    @Id
    @Column
    private Long id;
    /**
     * 学号
     */
    @Column
    private Long stuUniCode;
    /**
     * 干部名称
     */
    @Column
    private String officerName;
    /**
     * 任职开始时间
     */
    @Column
    private Date serveBeginTime;
    /**
     * 任职结束时间
     */
    @Column
    private Date serveEndTime;
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