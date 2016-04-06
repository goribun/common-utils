package com.goribun.common.utils.document.excel.row;

import com.goribun.common.utils.document.excel.sheet.SheetContext;
import com.goribun.common.utils.document.excel.style.StyleConfiguration;
import com.goribun.common.utils.document.excel.workbook.WorkbookContext;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;

import java.util.Date;

/**
 * Created by wangxuesong on 16/3/11.
 */
public class RowContext extends DelegateRowContext {

    private static final int ROW_HEIGHT_AUTOMATIC = -1;
    private final Row row;
    private int index;
    private short rowHeight;
    private int step;
    private StyleConfiguration styleConfiguration;


    public RowContext(Row row, SheetContext sheet, WorkbookContext workbookContext) {
        super(sheet);
        this.row = row;
        this.index = 0;
        this.step = 1;
        this.rowHeight = ROW_HEIGHT_AUTOMATIC;
        styleConfiguration = new StyleConfiguration(workbookContext.toNativeWorkbook());
    }


    public RowContext text(String text) {
        return writeText(text, styleConfiguration.getTextStyle());
    }


    public RowContext textSkipIfNull(String text) {
        if (StringUtils.isBlank(text)) {

        }
        return writeText(text, styleConfiguration.getTextStyle());
    }


    public RowContext text(String text, CellStyle style) {
        return writeText(text, style);

    }


    public RowContext textSkipIfNull(String text, CellStyle style) {
        return writeText(text, style);

    }


    public RowContext number(Number number) {
        return writeNumber(number, styleConfiguration.getNumberStyle());
    }


    public RowContext numberSkipIfNull(Number number) {
        if (number == null) {
            skipOneCell();
        }
        return writeNumber(number, styleConfiguration.getNumberStyle());
    }


    public RowContext number(Number number, CellStyle style) {
        return writeNumber(number, style);
    }

    public RowContext numberSkipIfNull(Number number, CellStyle style) {
        if (number == null) {
            skipOneCell();
        }
        return writeNumber(number, style);
    }

    public RowContext date(Date date) {
        return writeDate(date, styleConfiguration.getDateStyle());
    }

    public RowContext dateSkipIfNull(Date date) {
        if (date == null) {
            skipOneCell();
        }
        return writeDate(date, styleConfiguration.getDateStyle());
    }

    public RowContext date(Date date, CellStyle style) {
        return writeDate(date, style);
    }

    public RowContext dateSkipIfNull(Date date, CellStyle style) {
        if (date == null) {
            skipOneCell();
        }
        return writeDate(date, style);
    }

    public RowContext header(String header) {
        return writeText(header, styleConfiguration.getHeaderStyle());
    }

    public RowContext headerSkipIfNull(String header) {
        if (StringUtils.isBlank(header)) {
            skipOneCell();
        }
        return writeText(header, styleConfiguration.getHeaderStyle());
    }

    public RowContext header(String header, CellStyle style) {
        return writeText(header, style);
    }

    public RowContext headerSkipIfNull(String header, CellStyle style) {
        if (StringUtils.isBlank(header)) {
            skipOneCell();
        }
        return writeText(header, style);
    }

    public RowContext setColumnWidth(int width) {
        sheet.setColumnWidth(index - 1, width);
        return this;
    }


    /**
     * 跳过一个cell
     *
     * @return
     */
    public RowContext skipOneCell() {
        return skipCells(1);
    }

    /**
     * 跳过n个cell
     *
     * @param offset
     * @return
     */
    public RowContext skipCells(int offset) {
        index += offset;
        return this;
    }


    /**
     * 写text
     *
     * @param text
     * @param style
     * @return
     */
    private RowContext writeText(String text, CellStyle style) {
        createCell(1, style).setCellValue(text);
        return this;

    }


    /**
     * 写number
     *
     * @param number
     * @param style
     * @return
     */
    private RowContext writeNumber(Number number, CellStyle style) {
        createCell(1, style).setCellValue(number.doubleValue());
        return this;
    }

    /**
     * 写date
     *
     * @param date
     * @param style
     * @return
     */
    private RowContext writeDate(Date date, CellStyle style) {
        createCell(1, style).setCellValue(date);
        return this;
    }

    /**
     * 创建cell
     *
     * @param rowHeightMultiplier
     * @param style
     * @return
     */
    private Cell createCell(int rowHeightMultiplier, CellStyle style) {
        assignRowHeight(rowHeightMultiplier);
        Cell cell = row.createCell(index);
        cell.setCellStyle(style);
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
