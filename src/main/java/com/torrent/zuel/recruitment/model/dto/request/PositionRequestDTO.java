package com.torrent.zuel.recruitment.model.dto.request;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * 岗位请求DTO
 *
 * @author yan
 * @date 2021/11/27
 */
public class PositionRequestDTO {

    @ApiModelProperty(value = "开始页数", required = true)
    private Integer pageNum;
    @ApiModelProperty(value = "每页大小", required = true)
    private Integer pageSize;
    @ApiModelProperty("岗位最小薪水")
    private BigDecimal jobMinSalary;
    @ApiModelProperty("岗位最大薪水")
    private BigDecimal jobMaxSalary;
    @ApiModelProperty("学历(1:博士;2:硕士;3:学士;4:专科;5:高中及以下)")
    private Integer educationLevel;
    @ApiModelProperty("岗位要求年限")
    private Integer jobWorkBeginYear;
    @ApiModelProperty("岗位要求年限")
    private Integer jobWorkEndYear;
    @ApiModelProperty("岗位类型")
    private String jobType;

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setJobMinSalary(BigDecimal jobMinSalary) {
        this.jobMinSalary = jobMinSalary;
    }

    public BigDecimal getJobMinSalary() {
        return jobMinSalary;
    }

    public void setJobMaxSalary(BigDecimal jobMaxSalary) {
        this.jobMaxSalary = jobMaxSalary;
    }

    public BigDecimal getJobMaxSalary() {
        return jobMaxSalary;
    }

    public void setEducationLevel(Integer educationLevel) {
        this.educationLevel = educationLevel;
    }

    public Integer getEducationLevel() {
        return educationLevel;
    }

    public void setJobWorkBeginYear(Integer jobWorkBeginYear) {
        this.jobWorkBeginYear = jobWorkBeginYear;
    }

    public Integer getJobWorkBeginYear() {
        return jobWorkBeginYear;
    }

    public void setJobWorkEndYear(Integer jobWorkEndYear) {
        this.jobWorkEndYear = jobWorkEndYear;
    }

    public Integer getJobWorkEndYear() {
        return jobWorkEndYear;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getJobType() {
        return jobType;
    }
}
