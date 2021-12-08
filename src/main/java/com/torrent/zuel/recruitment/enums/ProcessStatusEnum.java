package com.torrent.zuel.recruitment.enums;


/**
 * 状态枚举
 *
 * @author dingfeiyang
 */
public enum ProcessStatusEnum implements ITextValueEnum {
    /**
     * 已投递
     */
    DELIVERED(1, "已投递"),
    /**
     * 待面试
     */
    PENDING_INTERVIEW(2, "待面试"),
    /**
     * 已面试
     */
    INTERVIEWED(3, "已面试"),
    /**
     * 已录取
     */
    ACCEPTED(4, "已录取"),
    /**
     * 未录取
     */
    NOT_ACCEPTED(5, "未录取"),
    /**
     * 被拒绝
     */
    REJECTED(6, "被拒绝");
    private final int value;
    private final String text;

    ProcessStatusEnum(int value, String text) {
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
