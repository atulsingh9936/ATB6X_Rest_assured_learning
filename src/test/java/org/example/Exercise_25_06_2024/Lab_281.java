package org.example.Exercise_25_06_2024;

import org.testng.annotations.Test;

public class Lab_281 {

    @Test
    public void Serverstartedok(){
        System.out.println("I will run first");
    }

    @Test(dependsOnMethods = "Serverstartedok")
    public void method1(){
        System.out.println("method1");
    }
}
