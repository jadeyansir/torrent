package com.torrent.zuel.recruitment.model.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Table(name = "industry_info")
public class IndustryInfoDO {
    /**
     * 主键id
     */
    @Id
    @Column
    private Long id;
    /**
     * 行业编码
     */
    @Column
    private Integer industryCode;
    /**
     * 行业名称
     */
    @Column
    private String industryName;
    /**
     * 行业分类编码
     */
    @Column
    private Integer industryCategoryCode;
    /**
     * 行业名称
     */
    @Column
    private String industryCategoryName;
    /**
     * 行业级别: 1： 一级行业; 2: 二级行业
     */
    @Column
    private Integer industryLevel;
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

    public Integer getIndustryCode() {
        return industryCode;
    }

    public void setIndustryCode(Integer industryCode) {
        this.industryCode = industryCode;
    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName;
    }

    public Integer getIndustryCategoryCode() {
        return industryCategoryCode;
    }

    public void setIndustryCategoryCode(Integer industryCategoryCode) {
        this.industryCategoryCode = industryCategoryCode;
    }

    public String getIndustryCategoryName() {
        return industryCategoryName;
    }

    public void setIndustryCategoryName(String industryCategoryName) {
        this.industryCategoryName = industryCategoryName;
    }

    public Integer getIndustryLevel() {
        return industryLevel;
    }

    public void setIndustryLevel(Integer industryLevel) {
        this.industryLevel = industryLevel;
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