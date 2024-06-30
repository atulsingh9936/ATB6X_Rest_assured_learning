package org.example.Exercise_25_06_2024;

import org.testng.annotations.Test;

public class Lab_278 {

  // TestNG priority in java


  @Test(priority = 2)

  public void testMethodOne(){
      System.out.println("Test Method one");
  }

  @Test(priority = 1)

  public void testMethodtwo(){
        System.out.println("Test Method two");
    }
    @Test(priority = 0)
    public void testMethodzero(){
        System.out.println("Test Method one");
    }

    @Test(priority = -1)
    public void testMethodNegativeOne() {
        System.out.println("Test Method Negative One");
    }



}
