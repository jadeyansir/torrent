package com.torrent.zuel.recruitment.enums;

/**
 * 删除枚举
 *
 * @author yan
 * @Date 2020/11/29
 */
public enum SexEnum implements ITextValueEnum {

    MAN(1, "男"),
    WOMAN(2, "女");

    private final int value;
    private final String text;

    SexEnum(int value, String text) {
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
