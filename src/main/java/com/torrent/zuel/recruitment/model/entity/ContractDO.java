package com.torrent.zuel.recruitment.model.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;

@Table(name = "contract")
public class ContractDO {
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
     * 学生姓名
     */
    @Column
    private String stuName;
    /**
     * 公司简称
     */
    @Column
    private String comChiShortName;
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
     * 签约时间
     */
    @Column
    private Date contractDate;
    /**
     * 签约状态(1:待签约,2:已签约,3:已拒绝)
     */
    @Column
    private Integer contractStatus;
    /**
     * 合同图片oss链接
     */
    @Column
    private String contractPicLink;
    /**
     * 合同图片key值
     */
    @Column
    private String contractPicKey;
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