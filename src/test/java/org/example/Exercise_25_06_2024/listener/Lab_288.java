package org.example.Exercise_25_06_2024.listener;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Custom_Listener.class)
public class Lab_288 {


    @Test(groups = "sanity")
    public void test1(){
        System.out.println("test1");
        Assert.assertTrue(false);
    }
    @Test(groups = "sanity")
    public void test2(){
        System.out.println("test2");
        Assert.assertTrue(true);
    }

   @AfterSuite
    public void emailtoQALead(){
        // send the mail
       System.out.println("After suite executing ......\n");
        System.out.println("sending Email\n");
    }
}
