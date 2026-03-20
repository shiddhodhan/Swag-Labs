package common_utilities;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class Utility {

    public static String ReadDataFromExcel(int rowIndex, int columnIndex) throws IOException {

FileInputStream file = new FileInputStream("D:\\ExcelSheet_apachepoi\\Swag.xlsx");

        Sheet MySheet = WorkbookFactory.create(file).getSheet("Sheet1");
        String value = MySheet.getRow(rowIndex).getCell(columnIndex).getStringCellValue();
        return value;

        

    }
}
