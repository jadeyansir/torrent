package com.torrent.zuel.recruitment.enums;

/**
 * 工作性质
 *
 * @author yan
 * @date 2021/12/17
 */
public enum JobType implements ITextValueEnum {
    FULL_TIME(1, "全职"),
    PART_TIME(2, "兼职"),
    INTERNSHIPS(3, "实习");

    private final int value;
    private final String text;

    JobType(int value, String text) {
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
