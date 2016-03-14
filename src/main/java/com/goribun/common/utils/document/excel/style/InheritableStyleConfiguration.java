package com.goribun.common.utils.document.excel.style;

import org.apache.poi.ss.formula.functions.T;

/**
 * Created by wangxuesong on 16/3/15.
 */
public class InheritableStyleConfiguration {

    private Style textStyle;
    private Style numberStyle;
    private Style dateStyle;

    private Style totalStyle;
    private Style headerStyle;
    private Style percentageStyle;

    protected InheritableStyleConfiguration(StyleConfiguration parentConfig) {
        overwriteStyles(parentConfig);
    }

    private void overwriteStyles(StyleConfiguration parentConfig) {
        textStyle = parentConfig.getTextStyle();
        numberStyle = parentConfig.getNumberStyle();
        dateStyle = parentConfig.getDateStyle();
        totalStyle = parentConfig.getTotalStyle();
        headerStyle = parentConfig.getHeaderStyle();
        percentageStyle = parentConfig.getPercentageStyle();
    }

    public Style getHeaderStyle() {
        return headerStyle;
    }
    public T setHeaderStyle(Style style) {
        headerStyle = StylesInternal.combineOrOverride(headerStyle, style);
        return (T) this;
    }

    @Override
    public Style getPercentageStyle() {
        return percentageStyle;
    }

    @Override
    public T setPercentageStyle(Style style) {
        percentageStyle = StylesInternal.combineOrOverride(percentageStyle, style);
        return (T) this;
    }

    @Override
    public Style getTextStyle() {
        return textStyle;
    }

    @Override
    public T setTextStyle(Style style) {
        textStyle = StylesInternal.combineOrOverride(textStyle, style);
        return (T) this;
    }

    @Override
    public Style getNumberStyle() {
        return numberStyle;
    }

    @Override
    public T setNumberStyle(Style style) {
        numberStyle = StylesInternal.combineOrOverride(numberStyle, style);
        return (T) this;
    }

    @Override
    public Style getDateStyle() {
        return dateStyle;
    }

    @Override
    public T setDateStyle(Style style) {
        dateStyle = StylesInternal.combineOrOverride(dateStyle, style);
        return (T) this;
    }

    @Override
    public T setStyleConfiguration(StyleConfiguration styleConfiguration) {
        overwriteStyles(styleConfiguration);
        return (T) this;
    }

    @Override
    public StyleConfiguration getStyleConfiguration() {
        return this;
    }

}