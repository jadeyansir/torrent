package com.torrent.zuel.recruitment.model.dto.response;

import io.swagger.annotations.ApiModelProperty;

/**
 * 公司信息
 *
 * @author yan
 * @date 2021/12/17
 */

public class ComInfoResponseDTO {
    @ApiModelProperty("公司统一编码")
    private Long comUniCode;
    @ApiModelProperty("公司名称")
    private String comChiName;
    @ApiModelProperty("公司简称")
    private String comChiShortName;

    public void setComUniCode(Long comUniCode) {
        this.comUniCode = comUniCode;
    }

    public Long getComUniCode() {
        return comUniCode;
    }

    public void setComChiName(String comChiName) {
        this.comChiName = comChiName;
    }

    public String getComChiName() {
        return comChiName;
    }

    public void setComChiShortName(String comChiShortName) {
        this.comChiShortName = comChiShortName;
    }

    public String getComChiShortName() {
        return comChiShortName;
    }
}
