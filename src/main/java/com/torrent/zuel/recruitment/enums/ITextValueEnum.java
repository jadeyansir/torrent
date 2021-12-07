package com.torrent.zuel.recruitment.enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 文本信息接口
 *
 * @author yan
 */
public interface ITextValueEnum {
    /**
     * 获取所有大于0的枚举值
     *
     * @param iTextValueEnumClass 枚举类型
     * @param values              枚举值
     * @param <T>                 返回类型
     * @return 返回所有大于0的枚举值
     */
    static <T extends ITextValueEnum> ITextValueEnum[] getEnums(Class<T> iTextValueEnumClass, int values) {
        return Arrays.stream(iTextValueEnumClass.getEnumConstants())
                .filter(x -> (values & x.getValue()) > 0).toArray(ITextValueEnum[]::new);
    }

    /**
     * 获取所有枚举值
     *
     * @param iTextValueEnumClass 枚举类型
     * @param <T>                 返回类型
     * @return 返回所有枚举值
     */
    static <T extends ITextValueEnum> T[] getAllEnums(Class<T> iTextValueEnumClass) {
        return iTextValueEnumClass.getEnumConstants();
    }

    /**
     * 获取所有大于0的枚举值
     *
     * @param iTextValueEnumClass 枚举类型
     * @param values              枚举值
     * @param <T>                 返回类型
     * @return 返回所有大于0的枚举值
     */
    static <T extends ITextValueEnum> List<T> listEnums(Class<T> iTextValueEnumClass, int values) {
        return Arrays.stream(iTextValueEnumClass.getEnumConstants())
                .filter(x -> (values & x.getValue()) > 0).collect(Collectors.toList());
    }

    /**
     * 获取所有枚举值
     *
     * @param iTextValueEnumClass 枚举类型
     * @param <T>                 返回类型
     * @return 返回所有枚举值
     */
    static <T extends ITextValueEnum> List<T> listAllEnums(Class<T> iTextValueEnumClass) {
        return Arrays.asList(iTextValueEnumClass.getEnumConstants());
    }

    /**
     * 获取枚举文本
     *
     * @return 获取枚举文本信息
     */
    String getText();

    /**
     * 获取枚举值
     *
     * @return 获取枚举值
     */
    int getValue();

    /// region 获取枚举类型

    /**
     * 获取对应的枚举值
     *
     * @param clazz 类型
     * @param value 值
     * @param <T>   枚举类型
     * @return 对应的枚举
     */
    static <T extends ITextValueEnum> T getEnum(Class<T> clazz, int value) {
        T[] enumArray = clazz.getEnumConstants();
        for (T t : enumArray) {
            int enumValue = t.getValue();
            if (Integer.valueOf(value).equals(enumValue)) {
                return t;
            }
        }

        throw new IllegalArgumentException(
                "No enum constant " + clazz.getCanonicalName() + " found by value: " + value);
    }

}
