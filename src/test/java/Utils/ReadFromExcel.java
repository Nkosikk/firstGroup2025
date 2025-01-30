package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromExcel {

    private static String testDataDir = System.getProperty("user.dir") + "/src/test/java/TestData/data.xlsx";

    FileInputStream fis = new FileInputStream(testDataDir);

    XSSFWorkbook workbook = new XSSFWorkbook(fis); //actual excel file

    public ReadFromExcel() throws IOException {
    }

    XSSFSheet sheet = workbook.getSheet("login details");
    XSSFSheet sheet2 = workbook.getSheet("User Info");

    //data from sheet1
    public String username = sheet.getRow(1).getCell(0).getStringCellValue(); //index starts from zero
    public String password = sheet.getRow(1).getCell(1).getStringCellValue();

    //Data from sheet2
    public String firstname = sheet2.getRow(1).getCell(0).getStringCellValue();
    public String lastname = sheet2.getRow(1).getCell(1).getStringCellValue();
    public String code = sheet2.getRow(1).getCell(2).getStringCellValue();




}
