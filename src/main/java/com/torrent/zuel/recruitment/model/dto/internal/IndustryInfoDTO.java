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
    private Long induUniCode;
    @ApiModelProperty("行业名称")
    private String induName;

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
}

