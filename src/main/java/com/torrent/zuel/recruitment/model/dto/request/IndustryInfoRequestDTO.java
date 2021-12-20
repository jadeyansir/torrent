package com.torrent.zuel.recruitment.model.dto.request;

import io.swagger.annotations.ApiModelProperty;

/**
 * IndustryInfo
 *
 * @author yan
 * @date 2021/12/11
 */
public class IndustryInfoRequestDTO {
    @ApiModelProperty("父类编码")
    private Integer industryCode;
    @ApiModelProperty("行业名称")
    private String industryName;
    @ApiModelProperty("行业编码")
    private Integer industryCategoryCode;
    @ApiModelProperty("行业名称")
    private String industryCategoryName;

    public void setIndustryCode(Integer industryCode) {
        this.industryCode = industryCode;
    }

    public Integer getIndustryCode() {
        return industryCode;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName;
    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryCategoryCode(Integer industryCategoryCode) {
        this.industryCategoryCode = industryCategoryCode;
    }

    public Integer getIndustryCategoryCode() {
        return industryCategoryCode;
    }

    public void setIndustryCategoryName(String industryCategoryName) {
        this.industryCategoryName = industryCategoryName;
    }

    public String getIndustryCategoryName() {
        return industryCategoryName;
    }
}
