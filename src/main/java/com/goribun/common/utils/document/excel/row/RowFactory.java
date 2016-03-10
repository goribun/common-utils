package com.goribun.common.utils.document.excel.row;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

/**
 * Created by wangxuesong on 16/3/11.
 */
public class RowFactory {

    public getOrCreate(Sheet sheet, int index){
        if(sheet ==null){
            throw new NullPointerException("sheet is null !");
        }
        Row row = sheet.getRow(index);
    }
}
