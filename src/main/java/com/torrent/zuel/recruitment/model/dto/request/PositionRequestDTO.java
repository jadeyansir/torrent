package com.torrent.zuel.recruitment.model.dto.request;

import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
    @ApiModelProperty("岗位薪水")
    private List<Integer> jobSalary;
    @ApiModelProperty("学历(1:博士;2:硕士;3:学士;4:专科;5:高中及以下)")
    private List<Integer> educationLevel;
    @ApiModelProperty("岗位年限")
    private List<Integer> jobWorkYear;
    @ApiModelProperty("岗位类型")
    private List<Integer> jobType;
    @ApiModelProperty("公司类型")
    private List<Integer> comType;
    @ApiModelProperty("公司规模")
    private List<Integer> comSize;
    @ApiModelProperty("行业")
    private Integer jobIndustry;
    @ApiModelProperty("岗位地点")
    private List<Integer> jobAddress;
    @ApiModelProperty("展示方式")
    private Integer displayType;
    @ApiModelProperty("搜索岗位")
    private String searchJob;

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

    public void setJobSalary(List<Integer> jobSalary) {
        this.jobSalary = Objects.isNull(jobSalary) ? new ArrayList<>() : new ArrayList<>(jobSalary);
    }

    public List<Integer> getJobSalary() {
        return Objects.isNull(jobSalary) ? new ArrayList<>() : new ArrayList<>(jobSalary);
    }

    public void setEducationLevel(List<Integer> educationLevel) {
        this.educationLevel = Objects.isNull(educationLevel) ? new ArrayList<>() : new ArrayList<>(educationLevel);
    }

    public List<Integer> getEducationLevel() {
        return Objects.isNull(educationLevel) ? new ArrayList<>() : new ArrayList<>(educationLevel);
    }

    public void setJobWorkYear(List<Integer> jobWorkYear) {
        this.jobWorkYear = Objects.isNull(jobWorkYear) ? new ArrayList<>() : new ArrayList<>(jobWorkYear);
    }

    public List<Integer> getJobWorkYear() {
        return Objects.isNull(jobWorkYear) ? new ArrayList<>() : new ArrayList<>(jobWorkYear);
    }

    public void setJobType(List<Integer> jobType) {
        this.jobType = Objects.isNull(jobType) ? new ArrayList<>() : new ArrayList<>(jobType);
    }

    public List<Integer> getJobType() {
        return Objects.isNull(jobType) ? new ArrayList<>() : new ArrayList<>(jobType);
    }

    public void setComType(List<Integer> comType) {
        this.comType = Objects.isNull(comType) ? new ArrayList<>() : new ArrayList<>(comType);
    }

    public List<Integer> getComType() {
        return Objects.isNull(comType) ? new ArrayList<>() : new ArrayList<>(comType);
    }

    public void setComSize(List<Integer> comSize) {
        this.comSize = Objects.isNull(comSize) ? new ArrayList<>() : new ArrayList<>(comSize);
    }

    public List<Integer> getComSize() {
        return Objects.isNull(comSize) ? new ArrayList<>() : new ArrayList<>(comSize);
    }

    public void setJobIndustry(Integer jobIndustry) {
        this.jobIndustry = jobIndustry;
    }

    public Integer getJobIndustry() {
        return jobIndustry;
    }

    public void setJobAddress(List<Integer> jobAddress) {
        this.jobAddress = Objects.isNull(jobAddress) ? new ArrayList<>() : new ArrayList<>(jobAddress);
    }

    public List<Integer> getJobAddress() {
        return Objects.isNull(jobAddress) ? new ArrayList<>() : new ArrayList<>(jobAddress);
    }

    public void setDisplayType(Integer displayType) {
        this.displayType = displayType;
    }

    public Integer getDisplayType() {
        return displayType;
    }

    public void setSearchJob(String searchJob) {
        this.searchJob = searchJob;
    }

    public String getSearchJob() {
        return searchJob;
    }
}
