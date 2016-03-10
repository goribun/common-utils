package com.goribun.common.utils.document.excel.workbook;

import com.goribun.common.utils.document.excel.sheet.SheetContext;
import org.apache.poi.ss.usermodel.Workbook;

/**
 * Created by wangxuesong on 16/3/11.
 */
public class WorkbookContext {

    private final Workbook workbook;

    WorkbookContext(Workbook workbook) {
        this.workbook = workbook;
    }


    public SheetContext createSheet(String sheetName) {
        return new SheetContext();
    }
}
