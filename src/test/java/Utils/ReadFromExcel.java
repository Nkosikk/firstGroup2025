package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromExcel {

    private static String testDataDir = System.getProperty("user.dir") + "/src/test/java/TestData/data1.xlsx";

    FileInputStream fis = new FileInputStream(testDataDir);
    XSSFWorkbook workbook = new XSSFWorkbook(fis);

    public ReadFromExcel() throws IOException {
    }

    XSSFSheet sheet = workbook.getSheet("login Details");
    XSSFSheet sheet1 = workbook.getSheet("User Information");

    public String username = sheet.getRow(1).getCell(0).getStringCellValue();
    public String password = sheet.getRow(1).getCell(1).getStringCellValue();

    public String firstName = sheet1.getRow(1).getCell(0).getStringCellValue();
    public String lastName = sheet1.getRow(1).getCell(1).getStringCellValue();
    public String zipCode = String.valueOf((int) sheet1.getRow(1).getCell(2).getNumericCellValue());


}
