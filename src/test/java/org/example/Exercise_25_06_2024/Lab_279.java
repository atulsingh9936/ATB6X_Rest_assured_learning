package org.example.Exercise_25_06_2024;

import org.testng.annotations.Test;

public class Lab_279 {


    @Test(priority = 1)

    public void testMethodB(){
        System.out.println("Test Method B");
    }

    @Test(priority = 1)

    public void testMethodA(){
        System.out.println("Test Method A");
    }

    @Test(priority = 1)

    public void testMethodC(){
        System.out.println("Test Method C");
    }
}
