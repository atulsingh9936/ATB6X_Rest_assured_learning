package org.example.Exercise_25_06_2024;

import org.testng.annotations.Test;

public class Lab_282 {

    @Test
    public void gettoken(){
        System.out.println("I will run first");
    }

    @Test
    public void getBookingID(){
        System.out.println("I will run first");
    }

    @Test(dependsOnMethods = {"gettoken","getBookingID"})
    public void testputrequest(){
        System.out.println("testput");
    }


    @Test(dependsOnMethods = {"gettoken","getBookingID"})
    public void testdeleterequest(){
        System.out.println("testdelete");
    }


}
