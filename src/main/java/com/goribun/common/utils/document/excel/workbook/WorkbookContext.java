package com.goribun.common.utils.document.excel.workbook;

import com.goribun.common.utils.document.excel.sheet.SheetContext;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by wangxuesong on 16/3/11.
 */
public class WorkbookContext {

    private final Workbook workbook;

    WorkbookContext(Workbook workbook) {
        this.workbook = workbook;
    }

    public SheetContext createSheet(String sheetName) {
        return new SheetContext(this, workbook.createSheet(sheetName));
    }

    public byte[] toNativeBytes() {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            workbook.write(baos);
            return baos.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException("ToNativeBytes Failed ", e);
        }
    }

    public Workbook toNativeWorkbook() {
        return workbook;
    }
}
