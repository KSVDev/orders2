package com.kozinets.orders2;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Component
public class ExcelFirst {
    public ExcelFirst(){};

    private static String filepath = "./src/Data/Order Omega ToJava.xlsx";
    public static XSSFWorkbook readWorkbook() {
        try {
            String result = "";
            InputStream in = null;
            XSSFWorkbook wb = null;
            try {
                in = new FileInputStream(filepath);
                wb = new XSSFWorkbook(in);
            } catch (IOException e) {
                e.printStackTrace();
            }finally{
                return wb;
            }
        }
        catch (Exception e) {
            System.out.println("catch");
            return null;
        }
    }

}
