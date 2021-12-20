package com.torrent.zuel.recruitment.model.entity;

import java.sql.*;
import javax.persistence.*;

@Table(name = "language_skills")
public class LanguageSkillsDO {
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
     * 语种
     */
    @Column
    private String languageType;
    /**
     * 听说能力
     */
    @Column
    private String listenSpeakSkills;
    /**
     * 读写能力
     */
    @Column
    private String readWriteSkills;
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

    public String getLanguageType() {
        return languageType;
    }

    public void setLanguageType(String languageType) {
        this.languageType = languageType;
    }

    public String getListenSpeakSkills() {
        return listenSpeakSkills;
    }

    public void setListenSpeakSkills(String listenSpeakSkills) {
        this.listenSpeakSkills = listenSpeakSkills;
    }

    public String getReadWriteSkills() {
        return readWriteSkills;
    }

    public void setReadWriteSkills(String readWriteSkills) {
        this.readWriteSkills = readWriteSkills;
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