package org.example.testng;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Lab_261 {

    // 1000-> group these test case
    // smoke, sanity
    // before , after we can do something
    @Description("Test case1 (261) - verify get request 1")
    @Test

    public void  getrequest(){

        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("ping")
                .when().get()
                .then().statusCode(201);

    }
    @Description("Test case2 (261) - verify get request 1")
    @Test
    public void  getrequest2(){

        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("ping")
                .when().get()
                .then().statusCode(201);

    }


}
