package org.example.ex_ra01;

import io.restassured.RestAssured;

public class Lab_260 {
    public static void main(String[] args) {
        // Rest assured hello world program
       // RestAssured.basic().authenticate().

//        given -> url,header,auth, payload
//                when -> get, post
//                        then ->response which we can verify

        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("ping")
                .when().get()
                .then().statusCode(200);
    }
}
