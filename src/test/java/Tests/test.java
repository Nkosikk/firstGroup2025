package Tests;

import org.testng.annotations.Test;

public class test {


    @Test
    public void testing() {
        double itemTotal = 29.99;
        double tax = 2.40;

        double ItemTotalPlusTax = itemTotal + tax;

        double total = 32.39;

        if (ItemTotalPlusTax == total) {
            System.out.println("Tests has passed");
            // click finish button
        } else {
            System.out.println("Tests has Failed 1");
            // click cancel button
        }
    }
}
