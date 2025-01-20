package Utils;

import org.testng.annotations.Test;
import com.github.javafaker.Faker;

import javax.swing.*;

public class generateTestData {
    static Faker faker = new Faker();

    public static String firstName = faker.name().firstName();
    public static String lastName = faker.name().lastName();
    public static String postalCode = faker.address().zipCode();

    /*public static String firstName = faker.n;
    public static String Surname = faker.name().lastName();
    public static String zipcode = faker.address().zipCode();
    //    public static String zipcode = faker.address().zipCode();
    public static String number = faker.app().name();*/


    @Test
    public void test(){
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(postalCode);
    }



}
