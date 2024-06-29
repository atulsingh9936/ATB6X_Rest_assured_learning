package org.example.ex_22_06_2024.crud.full;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lab_276 {

    @BeforeTest

    public  void  getToken(){
        System.out.println("1");
    }

    @BeforeTest
    public void  getBookingID(){
        System.out.println("2");
    }

    @Test
    public void t3(){
        // token and bookingid
        System.out.println("3");
    }



}
