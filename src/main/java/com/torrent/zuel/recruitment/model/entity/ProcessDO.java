package com.torrent.zuel.recruitment.model.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;

@Table(name = "process")
public class ProcessDO {
    /**
     * 主键
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
     * 岗位id
     */
    @Column
    private Long jobId;
    /**
     * 岗位描述
     */
    @Column
    private String jobName;
    /**
     * 公司编码
     */
    @Column
    private Long comUniCode;
    /**
     * 公司简称
     */
    @Column
    private String comChiShortName;
    /**
     * 投递时间
     */
    @Column
    private Date deliverDate;
    /**
     * 投递进度(1:已投递,2:待面试,3:已面试,4:已录取,5:未录取)
     */
    @Column
    private Integer processStatus;
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
     * 修改人
     */
    @Column
    private Long updateBy;
    /**
     * 修改时间
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

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobName() {
        return jobName;
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

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public Date getDeliverDate() {
        return deliverDate == null ? null : new Date(deliverDate.getTime());
    }

    public void setDeliverDate(Date deliverDate) {
        this.deliverDate = deliverDate == null ? null : new Date(deliverDate.getTime());
    }

    public Integer getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(Integer processStatus) {
        this.processStatus = processStatus;
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