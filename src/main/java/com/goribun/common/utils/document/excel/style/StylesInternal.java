package com.goribun.common.utils.document.excel.style;

/**
 * Created by wangxuesong on 16/3/15.
 */
public class StylesInternal {

    public static Style combineOrOverride(Style style1, Style style2) {

        if(style1==null||style2==null){
            throw new NullPointerException(String.valueOf("style cannot be null"));
        }

        if (!(style1 instanceof AdditiveStyle) || !(style2 instanceof AdditiveStyle)) {
            return style2;
        }
        return Styles.combine(ImmutableList.of((AdditiveStyle) style1, (AdditiveStyle) style2));
    }
}
