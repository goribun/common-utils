package com.goribun.common.utils.document.excel.row;

import com.goribun.common.utils.document.excel.sheet.SheetContext;

/**
 * Created by wangxuesong on 16/3/14.
 */
public abstract class AbstractDelegatingRowContext extends InheritableStyleConfiguration<RowContext> {

    final SheetContext sheet;

    AbstractDelegatingRowContext(SheetContext sheet) {
        super(sheet);
        this.sheet = sheet;
    }


    public RowContext nextRow() {
        return sheet.nextRow();
    }


    public RowContext currentRow() {
        throw new IllegalStateException("Operation makes no sense on RowContext instance. Nothing will change if you just remove this line from your code");
    }


    public RowContext nextConditionalRow(boolean condition) {
        return sheet.nextConditionalRow(condition);
    }


    public SheetContext skipRow() {
        return sheet.skipRow();
    }


    public SheetContext skipRows(int offset) {
        return sheet.skipRows(offset);
    }


    public SheetContext stepOneRowBack() {
        return sheet.stepOneRowBack();
    }
}
