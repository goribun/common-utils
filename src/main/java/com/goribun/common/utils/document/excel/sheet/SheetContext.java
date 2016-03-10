package com.goribun.common.utils.document.excel.sheet;

import com.goribun.common.utils.document.excel.row.RowContext;
import com.goribun.common.utils.document.excel.workbook.WorkbookContext;
import org.apache.poi.ss.usermodel.Sheet;

/**
 * Created by wangxuesong on 16/3/11.
 */
public class SheetContext {

    private final WorkbookContext workbookContext;
    private final Sheet sheet;
    private RowContext currentRow;
    private int index=-1;

    SheetContext(WorkbookContext workbookContext, Sheet sheet) {
        this.workbookContext = workbookContext;
        this.sheet = sheet;
    }


    public RowContext nextRow() {
        ++index;
        currentRow = null;
        return getCurrentRow();
    }

    public RowContext getCurrentRow(){
        if (index==-1){
            return null;
        }
        if (currentRow == null) {
            currentRow = new RowContext(Rows.getOrCreate(sheet, rowNo), this, workbookContext, defaultRowIndent);
        }

    }


}
