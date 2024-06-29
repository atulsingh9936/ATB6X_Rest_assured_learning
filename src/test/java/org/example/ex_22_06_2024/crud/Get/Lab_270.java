package org.example.ex_22_06_2024.crud.Get;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab_270 {
    @Test

    public void getrequestpositive(){
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/200").log().all();
        r.when().get();
        r.then().log().all().statusCode(200);
        // body, headers, response data
    }


@Test
    public void getrequestnegative(){
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/-1").log().all();
        r.when().get();
        r.then().log().all().statusCode(404);
        // body, headers, response data
    }


}
