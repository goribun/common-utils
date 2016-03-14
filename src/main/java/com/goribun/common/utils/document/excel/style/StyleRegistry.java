package com.goribun.common.utils.document.excel.style;

import org.apache.poi.ss.usermodel.CellStyle;

/**
 * Created by wangxuesong on 16/3/14.
 */
public interface StyleRegistry {

    CellStyle registerStyle(Style style);

}
