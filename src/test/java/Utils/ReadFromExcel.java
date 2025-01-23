package Utils;

import org.testng.annotations.Test;

public class ReadFromExcel {

    private static String testDataDir = System.getProperty("user.dir") + "/src/test/java/TestData/data.xlsx";


    @Test
    public void test(){
        System.out.println(testDataDir);
    }
}
