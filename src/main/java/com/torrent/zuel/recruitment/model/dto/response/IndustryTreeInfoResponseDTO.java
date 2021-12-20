package com.torrent.zuel.recruitment.model.dto.response;

import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 行业树形结构DTO
 *
 * @author yan
 * @date 2021/11/27
 **/
public class IndustryTreeInfoResponseDTO {

    @ApiModelProperty("行业唯一编码")
    private Integer industryCode;
    @ApiModelProperty("行业名称")
    private String industryName;
    @ApiModelProperty("子类行业")
    private List<IndustryTreeInfoResponseDTO> childInfoList;

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

    public List<IndustryTreeInfoResponseDTO> getChildInfoList() {
        return Objects.isNull(this.childInfoList) ? null : new ArrayList<>(this.childInfoList);
    }

    public void setChildInfoList(List<IndustryTreeInfoResponseDTO> childInfoList) {
        this.childInfoList = Objects.isNull(childInfoList) ? null : new ArrayList<>(childInfoList);
    }
}
