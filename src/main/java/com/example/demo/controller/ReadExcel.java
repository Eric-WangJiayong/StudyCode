package com.example.demo.controller;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ReadExcel {

    public static void read(String path) throws Exception {
        //创建工作簿
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(new FileInputStream(path));
        //获取工作簿下sheet的个数
        int sheetNum = xssfWorkbook.getNumberOfSheets();
        System.out.println("该excel文件中总共有：" + sheetNum + "个sheet");
        //获取第二个sheet（新线场景汇总表）
        XSSFSheet sheet2 = xssfWorkbook.getSheetAt(1);
        //获取报送场景ID
        XSSFRow row = sheet2.getRow(2);
        XSSFCell colunm = row.getCell(1);
        System.out.println("报送场景编号为：" + colunm);
        //根据报送场景ID找到对应sheet
        String sheetName = String.valueOf(colunm);
        XSSFSheet sheetId = xssfWorkbook.getSheet(sheetName);
    }
}
