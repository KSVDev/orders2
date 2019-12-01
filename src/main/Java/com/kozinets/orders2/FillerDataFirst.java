package com.kozinets.orders2;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.Iterator;

//@Component
public class FillerDataFirst {

    //@Autowired
    //private ExcelFirst getExcelFirst;

    public FillerDataFirst(){};

    /*
    public void fillProduct(){
        //NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();
        Product product = new Product.Builder();
    }
    */

    public static void iteration(){
        XSSFWorkbook xssfWorkbook = ExcelFirst.readWorkbook();
        XSSFSheet sheet= xssfWorkbook.getSheet("Лист1");
        Iterator rowIter = sheet.rowIterator();
        while (rowIter.hasNext()) {
            XSSFRow row = (XSSFRow) rowIter.next();
            XSSFCell cell = row.getCell(0);
            System.out.println(cell.getStringCellValue());
        }
    }
}
