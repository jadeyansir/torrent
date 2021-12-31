package com.torrent.zuel.recruitment.enums;

/**
 * 审核状态
 *
 * @author yan
 * @date 2021/12/31
 */
public enum ApprovalStatusEnum implements ITextValueEnum {


    PASSED(1, "通过审核"),
    PENDING(2, "待审核"),
    NO_PASS(3, "未通过");

    private final int value;
    private final String text;

    ApprovalStatusEnum(int value, String text) {
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
