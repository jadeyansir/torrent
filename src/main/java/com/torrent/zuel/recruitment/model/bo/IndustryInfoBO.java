package com.torrent.zuel.recruitment.model.bo;

/**
 * 行业申万一级信息BO
 *
 * @author yan
 * @date 2021/11/27
 */
public class IndustryInfoBO {
    /**
     * 行业名称
     */
    private String induName;
    /**
     * 行业唯一编码
     */
    private Long induUniCode;
    /**
     * 行业父类code
     */
    private Long parentCode;

    public String getInduName() {
        return induName;
    }

    public void setInduName(String induName) {
        this.induName = induName;
    }

    public Long getInduUniCode() {
        return induUniCode;
    }

    public void setInduUniCode(Long induUniCode) {
        this.induUniCode = induUniCode;
    }

    public Long getParentCode() {
        return parentCode;
    }

    public void setParentCode(Long parentCode) {
        this.parentCode = parentCode;
    }
}
