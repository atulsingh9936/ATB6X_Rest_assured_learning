package org.example.testng;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class Lab_262 {
    @Description("Test case1 - verify get request 1")
     @Test(enabled = false)
    public void getrequest() {
         System.out.println("TC");
     }
    @Description("Test case2 - verify get request 2")
     @Test
     public void getrequest2() {
         System.out.println("TC2");
     }

    @Description("Test case3 - verify get request 3")
     @Test
     public void getrequest3(){
         System.out.println("TC3");
    }
}
