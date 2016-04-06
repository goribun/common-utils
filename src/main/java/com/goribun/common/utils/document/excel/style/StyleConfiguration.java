package com.goribun.common.utils.document.excel.style;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Workbook;

/**
 * Created by wangxuesong on 16/4/6.
 */

public class StyleConfiguration {

    private final Workbook workbook;

    public StyleConfiguration(Workbook workbook) {
        this.workbook = workbook;
    }

    /**
     * header样式
     *
     * @return
     */
    public CellStyle getHeaderStyle() {
        CellStyle headerStyle = workbook.createCellStyle();

        // 设置单元格的背景颜色为淡蓝色
        headerStyle.setFillForegroundColor(HSSFColor.PALE_BLUE.index);
        headerStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
        // 设置单元格居中对齐
        headerStyle.setAlignment(CellStyle.ALIGN_CENTER);
        // 设置单元格垂直居中对齐
        headerStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
        // 创建单元格内容显示不下时自动换行
        headerStyle.setWrapText(true);
        // 设置单元格字体样式
        Font font = workbook.createFont();
        // 设置字体加粗
        font.setBoldweight(Font.BOLDWEIGHT_BOLD);
        font.setFontName("宋体");
        font.setFontHeight((short) 200);
        headerStyle.setFont(font);
        // 设置单元格边框为细线条
        setBorder(headerStyle);

        return headerStyle;
    }

    /**
     * 文本样式
     *
     * @return
     */
    public CellStyle getTextStyle() {
        CellStyle textStyle = workbook.createCellStyle();

        // 设置单元格居中对齐
        textStyle.setAlignment(CellStyle.ALIGN_CENTER);
        // 设置单元格垂直居中对齐
        textStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
        // 创建单元格内容显示不下时自动换行
        textStyle.setWrapText(true);
        // 设置单元格字体样式
        Font font = workbook.createFont();
        // 设置字体加粗
        font.setBoldweight(Font.BOLDWEIGHT_BOLD);
        font.setFontName("宋体");
        font.setFontHeight((short) 200);
        textStyle.setFont(font);
        // 设置单元格边框为细线条
        setBorder(textStyle);

        return textStyle;
    }


    public CellStyle getNumberStyle() {
        CellStyle numberStyle = workbook.createCellStyle();
        // 设置单元格居中对齐
        numberStyle.setAlignment(CellStyle.ALIGN_CENTER);
        // 设置单元格垂直居中对齐
        numberStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
        // 创建单元格内容显示不下时自动换行
        numberStyle.setWrapText(true);
        // 设置单元格字体样式
        Font font = workbook.createFont();
        // 设置字体加粗
        font.setBoldweight(Font.BOLDWEIGHT_BOLD);
        font.setFontName("宋体");
        font.setFontHeight((short) 200);
        numberStyle.setFont(font);
        // 设置单元格边框为细线条
        setBorder(numberStyle);

        return numberStyle;
    }


    public CellStyle getDateStyle() {
        CellStyle dateStyle = workbook.createCellStyle();
        // 设置单元格居中对齐
        dateStyle.setAlignment(CellStyle.ALIGN_CENTER);
        // 设置单元格垂直居中对齐
        dateStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
        DataFormat format = workbook.createDataFormat();
        dateStyle.setDataFormat(format.getFormat("yyyy-MM-dd HH:mm"));
        // 创建单元格内容显示不下时自动换行
        dateStyle.setWrapText(true);
        // 设置单元格字体样式
        Font font = workbook.createFont();
        // 设置字体加粗
        font.setBoldweight(Font.BOLDWEIGHT_BOLD);
        font.setFontName("宋体");
        font.setFontHeight((short) 200);
        dateStyle.setFont(font);
        setBorder(dateStyle);
        return dateStyle;
    }

    private void setBorder(CellStyle style) {
        // 设置单元格边框为细线条
        style.setBorderLeft(CellStyle.BORDER_THIN);
        style.setBorderBottom(CellStyle.BORDER_THIN);
        style.setBorderRight(CellStyle.BORDER_THIN);
        style.setBorderTop(CellStyle.BORDER_THIN);
    }
}


