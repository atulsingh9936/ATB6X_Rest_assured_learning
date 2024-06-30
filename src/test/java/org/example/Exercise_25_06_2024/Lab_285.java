package org.example.Exercise_25_06_2024;

import com.github.javafaker.Faker;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab_285 {
    // data driven testing - TestNG
    // mix the data driven with Apache POI
    // data driven testing - Running a single test case with multiple inputs
    // Login test

    @DataProvider
    public Object[][] getdata(){


      //  Faker faker = new Faker();
//
//        String name = faker.name().fullName(); // Miss Samanta Schmidt
//        String password = faker.internet().password(); // Emory
//        String lastName = faker.name().lastName(); // Barton
//
//        String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449
        return new Object[][]{
                new Object[]{"admin","password"},
                new Object[]{"admin","password123"},
        };
    }


    @DataProvider
    public Object[][] getdatafromExcel(){
        // apache POI code
        // read a Excel file which contains the data and give to the getdata function
        return null;
    }

    @Test(dataProvider = "getdata")

    public void testauthgettoken(String username,String password){
        System.out.println(username);
        System.out.println(password);

        // Rest assured logic
        //Rest given, when, then -> 200 ok or response



    }
}
