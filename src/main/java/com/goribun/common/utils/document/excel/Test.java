package com.goribun.common.utils.document.excel;

import com.goribun.common.utils.document.excel.sheet.SheetContext;
import com.goribun.common.utils.document.excel.workbook.WorkbookContext;
import com.goribun.common.utils.document.excel.workbook.WorkbookFactory;
import com.goribun.common.utils.document.excel.workbook.WorkbookType;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;


/**
 * Created by wangxuesong on 16/3/27.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        WorkbookContext workbookContext = WorkbookFactory.createWorkbook(WorkbookType.XSSF);

        SheetContext sheetContext = workbookContext.createSheet("test");
        sheetContext.nextRow().header("0.1").header("abc").header("xyz");
        sheetContext.nextRow().date(new Date()).setColumnWidth(8000).number(11).number(3.1415926).setColumnWidth(4000).nextRow().date(new Date());

        //确定写出文件的位置
        File file = new File("Testxx.xlsx");

        //建立输出字节流
        FileOutputStream fos = new FileOutputStream(file);

        //用FileOutputStream 的write方法写入字节数组
        fos.write(workbookContext.toNativeBytes());


    }
}
