package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromExcel {

    private static String testDataDir = System.getProperty("user.dir") + "/src/test/java/TestData/data.xlsx";

    FileInputStream fis = new FileInputStream(testDataDir);
    XSSFWorkbook workbook = new XSSFWorkbook(fis);

    public ReadFromExcel() throws IOException {
    }

    XSSFSheet sheet = workbook.getSheet("login Details");
    XSSFSheet sheet2 = workbook.getSheet("User Information");

    public String username = sheet.getRow(1).getCell(0).getStringCellValue();
    public String password = sheet.getRow(1).getCell(1).getStringCellValue();
    public String FirstName = sheet2.getRow(1).getCell(0).getStringCellValue();
    public String LastName = sheet2.getRow(1).getCell(1).getStringCellValue();
    public String postalcode = sheet2.getRow(1).getCell(2).getRawValue();

}

