package Tests;

import org.testng.annotations.Test;

public class test {


    @Test
    public void testing() {
        double itemTotal = 15.99;
        double tax = 1.28;

        double ItemTotalPlusTax = itemTotal + tax;

        double total = 17.27;

        if (ItemTotalPlusTax == total) {
            System.out.println("Tests has passed");
            // click finish button
        } else {
            System.out.println("Tests has Failed");
            // click cancel button
        }
    }
}
