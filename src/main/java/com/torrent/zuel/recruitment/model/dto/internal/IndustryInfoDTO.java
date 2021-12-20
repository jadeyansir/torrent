package com.torrent.zuel.recruitment.model.dto.internal;

import io.swagger.annotations.ApiModelProperty;

/**
 * 行业
 *
 * @author yan
 * @date 2021/11/27
 */
public class IndustryInfoDTO {

    @ApiModelProperty("行业唯一编码")
    private Integer industryCategoryCode;
    @ApiModelProperty("行业名称")
    private String industryCategoryName;

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
}

