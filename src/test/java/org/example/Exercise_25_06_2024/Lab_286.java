package org.example.Exercise_25_06_2024;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class Lab_286 {
    @Test

    public void testDemo(){
        // random user name or password

        Faker faker  = new Faker();
        String username = faker.name().username();
        String phonenumber = faker.phoneNumber().phoneNumber();
        System.out.println(username);
        System.out.println(phonenumber);
    }
}
