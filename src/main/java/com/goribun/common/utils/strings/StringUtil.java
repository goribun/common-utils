package com.goribun.common.utils.strings;

/**
 * Created by WangXuesong on 2016/3/9.
 */
public class StringUtil {

    public static boolean isBlank(String str) {
        return (str == null || "".equals(str.trim()));
    }
}

