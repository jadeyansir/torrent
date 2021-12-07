package com.torrent.zuel.recruitment.enums;

/**
 * 行业级别枚举
 *
 * @author yan
 * @date 2021/11/27
 **/
public enum IndustryLevelEnum implements ITextValueEnum {

    LEVEL_ONE(1, "行业一级"),

    LEVEL_TWO(2, "行业二级"),
    ;

    private final int value;
    private final String text;

    IndustryLevelEnum(int value, String text) {
        this.value = value;
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public int getValue() {
        return value;
    }
}
