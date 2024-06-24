package org.example.testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lab_267 {
    // integration scenario
    // crud operation
    // create booking -> id
    // Create auth -> token
    // put -> id, token
    //Delete -> id
    // get -> id -- verify it should not exist



    String token;
    Integer bookingID;


    public String getToken(){
        token= "123";
        return token;
    }

    @BeforeTest
    public void getTokenAndBookingID() {
        token = getToken();
        // POST Req -
        // POST code
        bookingID = 123;
    }

    @Test
    public void testPUTReq() {
        System.out.println(token);
        System.out.println(bookingID);
        // PUT Code
    }

    @Test
    public void testDeleteReq() {
        System.out.println(token);
        System.out.println(bookingID);
        // DELETE Code
    }

    @Test
    public void testGETReq() {
        System.out.println(token);
        System.out.println(bookingID);
        // GET Code
    }



}
