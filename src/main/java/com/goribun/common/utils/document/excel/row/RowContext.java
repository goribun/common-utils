package com.goribun.common.utils.document.excel.row;

import com.goribun.common.utils.document.excel.sheet.SheetContext;
import com.goribun.common.utils.document.excel.style.Style;
import com.goribun.common.utils.document.excel.style.StyleRegistry;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

/**
 * Created by wangxuesong on 16/3/11.
 */
public class RowContext extends  AbstractDelegatingRowContext{

    private static final int ROW_HEIGHT_AUTOMATIC = -1;
    private final Row row;
    private int index;
    private short rowHeight;
    private final int indent;
    private int step;
    private  StyleRegistry styleRegistry;

    public RowContext(Row row, SheetContext sheet, StyleRegistry styleRegistry, int indent) {
        super(sheet);
        this.row = row;
        this.styleRegistry = styleRegistry;
        this.index = indent;
        this.indent = indent;
        this.step = 1;
        this.rowHeight = ROW_HEIGHT_AUTOMATIC;
    }

    public RowContext text(String text) {
        return writeText(text, getTextStyle());
    }


    private RowContext writeText(String text, Style style) {
        createCell(1, style).setCellValue(text);
        return this;

    }

    private Cell createCell(int rowHeightMultiplier, Style style) {
        assignRowHeight(rowHeightMultiplier);
        Cell cell = row.createCell(index);
        cell.setCellStyle(styleRegistry.registerStyle(style));

        index += step;
        step = 1;

        return cell;
    }


    private void assignRowHeight(int rowHeightMultiplier) {
        if (rowHeightMultiplier > 1 && rowHeight == ROW_HEIGHT_AUTOMATIC) {
            row.setHeightInPoints(row.getHeightInPoints() * rowHeightMultiplier);
        } else {
            row.setHeight(rowHeight);
        }
    }
}
