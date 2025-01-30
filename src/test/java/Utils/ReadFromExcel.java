package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromExcel {
    private static String TestDataDir = System.getProperty("user.dir") + "/src/test/java/TestData/DataSauceDemo.xlsx";
    XSSFSheet sheet;
    String username;
    String password;

    public ReadFromExcel() throws IOException {


        FileInputStream fis = new FileInputStream(TestDataDir);

        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        sheet = workbook.getSheet("Login Details");
        username = sheet.getRow(1).getCell(0).getStringCellValue();
        password = sheet.getRow(1).getCell(1).getStringCellValue();

    }

    @Test
    public void test() {
        System.out.println(TestDataDir);
   //     System.out.println(password);
    }
}
