package org.example.Exercise_25_06_2024;

import org.testng.annotations.Test;

public class Lab_283 {
    @Test(groups = { "init" },priority = 1)
    public void getToken() {
        System.out.println("serverStartedOk");
    }

    @Test(groups = { "init" },priority = 2)
    public void getBookingID() {
        System.out.println("initEnvironment");
    }

    @Test(dependsOnGroups = { "init.*" })
    public void testPutReq() {
        System.out.println("Now I will run");
    }
}
