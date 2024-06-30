package org.example.Exercise_25_06_2024;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab_280 {
    // Grouping of test cases
    // 100- 20 P0, 30 p1, 50 p3.
    // 40 - smoke, 60 sanity test cases
    @Issue("BUGS-123")
    @AllureId("TC#1")
    @Severity(SeverityLevel.NORMAL)
    @Description("Sanity test case")
     @Test(groups = {"Sanity"},priority = 1)
    public void SanityRun(){
        System.out.println("Sanity");
        System.out.println("QA");
    }
    @Description("reg test case")
    @Test(groups = {"Reg"},priority  =1)
    public void RegRun(){
        System.out.println("Reg");
    }

    @Description("smoke test case")
    @Test(groups = {"Smoke"},priority  =2)
    public void SmokeRun(){
        System.out.println("smoke");
        Assert.assertTrue(false);
    }
    @Description("QA test case")
    @Test (groups = {"QA"},priority = 3)
    public void QARun(){
        System.out.println("QA");
        Assert.assertTrue(false);
    }
    @Description("Production Test case")
    @Test (groups = {"Production"},priority =3)
    public void ProductionRun(){
        System.out.println("production");
        Assert.assertTrue(false);
    }
}
