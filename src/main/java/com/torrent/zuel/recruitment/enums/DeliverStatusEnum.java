package com.torrent.zuel.recruitment.enums;


/**
 * 状态枚举
 *
 * @author dingfeiyang
 */
public enum DeliverStatusEnum implements ITextValueEnum {
    /**
     * 已收藏
     */
    MARK(1, "已收藏"),
    /**
     * 已投递
     */
    DELIVERED(2, "已投递"),
    /**
     * 待面试
     */
    PENDING_INTERVIEW(3, "待面试"),
    /**
     * 已面试
     */
    INTERVIEWED(4, "已面试"),
    /**
     * 已录取
     */
    ACCEPTED(5, "已录取"),
    /**
     * 未录取
     */
    NOT_ACCEPTED(6, "未录取"),
    /**
     * 被拒绝
     */
    REJECTED(7, "被拒绝");
    private final int value;
    private final String text;

    DeliverStatusEnum(int value, String text) {
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
