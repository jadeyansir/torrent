package com.torrent.zuel.recruitment.enums;

/**
 * 删除枚举
 *
 * @author yan
 * @Date 2020/11/29
 */
public enum PoliticsEnum implements ITextValueEnum {

    COMMUNIST_PARTY(1, "中共党员"),
    PRE_COMMUNIST_PARTY(2, "中共预备党员"),
    YOUNG_COMMUNIST_PARTY(3, "共青团员"),
    OTHER_PARTY(4, "其他党派"),
    NO_PARTY(5, "无党派人士"),
    CROWD(6, "群众");

    private final int value;
    private final String text;

    PoliticsEnum(int value, String text) {
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
