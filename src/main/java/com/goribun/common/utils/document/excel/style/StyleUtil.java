package com.goribun.common.utils.document.excel.style;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangxuesong on 16/3/15.
 */
public class StyleUtil {

    public static AdditiveStyle combine(List<AdditiveStyle> styles) {
        checkNotNull(styles, "styles to combine cannot be null");
        checkArgument(styles.size() > 0, "cannot combine an empty list of styles");

        if (styles.size() == 1) {
            return styles.get(0);
        }

        List<AdditiveStyle> parts = new ArrayList<AdditiveStyle>();
        for (AdditiveStyle style : styles) {
            // can't use polymorphism in this case since we want to keep AdditiveStyle an interface so
            // that it can be implemented by user enums
            if (style instanceof CompositeStyle) {
                parts.addAll(((CompositeStyle) style).getStyles());
            } else {
                parts.add(style);
            }
        }
        return new CompositeStyle(parts);
    }

    /**
     * Combine an array of additive styles into one. Styles with greater indexes may partially override
     * styles with lesser indexes.
     * @param styles not-null list that cannot contain null styles
     * @return a style that has the features of passed styles
     */
    public static AdditiveStyle combine(AdditiveStyle... styles) {
        return Styles.combine(ImmutableList.copyOf(styles));
    }
}
