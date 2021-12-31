package com.torrent.zuel.recruitment.model.dto.response;

import io.swagger.annotations.ApiModelProperty;

/**
 * 学校信息
 *
 * @author yan
 * @date 2021/12/31
 */
public class CollegeInfoResponseDTO {
    @ApiModelProperty("学校编码")
    private Long collegeUniCode;
    @ApiModelProperty("学校名称")
    private String collegeChiName;
    @ApiModelProperty("学校简称")
    private String collegeChiShortName;
    @ApiModelProperty("学校英文名称")
    private String collegeEngName;

    public void setCollegeUniCode(Long collegeUniCode) {
        this.collegeUniCode = collegeUniCode;
    }

    public Long getCollegeUniCode() {
        return collegeUniCode;
    }

    public void setCollegeChiName(String collegeChiName) {
        this.collegeChiName = collegeChiName;
    }

    public String getCollegeChiName() {
        return collegeChiName;
    }

    public void setCollegeChiShortName(String collegeChiShortName) {
        this.collegeChiShortName = collegeChiShortName;
    }

    public String getCollegeChiShortName() {
        return collegeChiShortName;
    }

    public void setCollegeEngName(String collegeEngName) {
        this.collegeEngName = collegeEngName;
    }

    public String getCollegeEngName() {
        return collegeEngName;
    }
}
