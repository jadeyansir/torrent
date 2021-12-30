package com.torrent.zuel.recruitment.enums;

/**
 * 语言
 *
 * @author yan
 * @date 2021/12/22
 */
public enum LanguageEnum {
    HAN_YU(1, "汉语"),
    YING_YU(2, "英语");

    private int value;
    private String text;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    LanguageEnum(int value, String text) {
        this.value = value;
        this.text = text;
    }
}
