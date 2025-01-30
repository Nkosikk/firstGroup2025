package Utils;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromExcel {

    private static String testDataDir = System.getProperty("user.dir") + "/src/test/java/TestData/data.xlsx";

   // public String username;
    //public String password;
    FileInputStream fis = new FileInputStream(testDataDir);
    XSSFWorkbook workbook = new XSSFWorkbook(fis);


    public ReadFromExcel() throws IOException {
    }

    XSSFSheet sheet = workbook.getSheet("login Details");

    public String username = sheet.getRow(1).getCell(0).getStringCellValue();
    public String password = sheet.getRow(1).getCell(1).getStringCellValue();

   /* for(int i = 1;i <=sheet.getLastRowNum();i++) {
        XSSFRow row = sheet.getRow(i);

        if (i == 1 && row != null) {
            username = sheet.getRow(i).getCell(0).getStringCellValue();
            password = sheet.getRow(i).getCell(1).getStringCellValue();

        } else {
            System.out.println("Username or password is null!");
        }
    }*/


    @Test
    public void test() {
        System.out.println(password);
    }

}
