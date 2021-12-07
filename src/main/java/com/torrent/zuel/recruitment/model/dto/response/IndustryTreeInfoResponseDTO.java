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
    private Long induUniCode;
    @ApiModelProperty("行业名称")
    private String induName;
    @ApiModelProperty("子类行业")
    private List<IndustryTreeInfoResponseDTO> childInfoList;

    public Long getInduUniCode() {
        return induUniCode;
    }

    public void setInduUniCode(Long induUniCode) {
        this.induUniCode = induUniCode;
    }

    public String getInduName() {
        return induName;
    }

    public void setInduName(String induName) {
        this.induName = induName;
    }

    public List<IndustryTreeInfoResponseDTO> getChildInfoList() {
        return Objects.isNull(this.childInfoList) ? null : new ArrayList<>(this.childInfoList);
    }

    public void setChildInfoList(List<IndustryTreeInfoResponseDTO> childInfoList) {
        this.childInfoList = Objects.isNull(childInfoList) ? null : new ArrayList<>(childInfoList);
    }
}
