package com.torrent.zuel.recruitment.enums;

/**
 * 删除枚举
 *
 * @author yan
 * @Date 2020/11/29
 */
public enum DeletedEnum implements ITextValueEnum {

    NOT_DELETE(0, "未删除"),
    DELETE(1, "已删除");

    private final int value;
    private final String text;

    DeletedEnum(int value, String text) {
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
