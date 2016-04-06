package com.goribun.common.utils.document.excel.workbook;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

/**
 * Created by wangxuesong on 16/3/11.
 */
public class WorkbookFactory {

    private WorkbookFactory() {

    }

    public static WorkbookContext createWorkbook(WorkbookType workbookType) {
        Workbook workbook;

        switch (workbookType) {
            case HSSF:
                workbook = new HSSFWorkbook();
                break;
            case XSSF:
                workbook = new XSSFWorkbook();
                break;
            case SXSSF:
                workbook = new SXSSFWorkbook();
                break;
            default:
                workbook = new HSSFWorkbook();
        }

        return new WorkbookContext(workbook);
    }

}
