package com.goribun.common.utils.document.excel.workbook;

/**
 * 工作簿类型枚举<br/>
 * HSSF针对2007以前及版本<br/>
 * XSSF针对2007以后版本<br/>
 * SXSSF是对XSSF的扩展,针对大量数据
 * <p>
 * Created by wangxuesong on 16/3/10.
 */
public enum WorkbookType {

    HSSF, XSSF, SXSSF;
}
