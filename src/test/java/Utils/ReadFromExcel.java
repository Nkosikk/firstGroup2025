package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromExcel {
    private static String TestDataDir = System.getProperty("user.dir") + "/src/test/java/TestData/DataSauceDemo";

    public ReadFromExcel() throws IOException {


//    @Test
        //   public void test() {
        //      System.out.println(ReadFromExcel.TestDataDir);
        //  }

        FileInputStream fis = new FileInputStream(TestDataDir);

        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        XSSFSheet sheet = workbook.getSheet("Login Details");
        String username = sheet.getRow(1).getCell(0).getStringCellValue();

        @Test
        public void Test(){
            System.out.println(username);
         }
    }
}

