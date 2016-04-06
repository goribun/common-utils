package com.goribun.common.utils.document.excel.row;

import com.goribun.common.utils.document.excel.sheet.SheetContext;

/**
 * Created by wangxuesong on 16/3/14.
 */
public abstract class DelegateRowContext {

    final SheetContext sheet;

    DelegateRowContext(SheetContext sheet) {
        this.sheet = sheet;
    }


    /**
     * 下一行
     *
     * @return
     */
    public RowContext nextRow() {
        return sheet.nextRow();
    }

    /**
     * 跳过行
     *
     * @return
     */
    public SheetContext skipRow() {
        return sheet.skipOneRow();
    }


    /**
     * 跳过N行
     *
     * @param offset
     * @return
     */
    public SheetContext skipRows(int offset) {
        return sheet.skipRows(offset);
    }

}
