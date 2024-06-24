package org.example.testng;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class lab_265 {

    @Description("tc #1")
    @Test
    public void testcase(){

        // Assertion -> verifying the expected result with actual result
        // 200 =200
        // two types of assertion
        // soft assertion

        SoftAssert s = new SoftAssert();
        s.assertEquals("pramod","Pramod", "Not equals");
        s.assertEquals("amit","Pramod", "Not equals");
        System.out.println("end of the program");
        System.out.println("end of 2 program");
        s.assertAll();

        // Hard assertion

//        Assert.assertEquals("pramod","Pramod");
//        System.out.println("end of the program");





    }
}
