package org.example.ex_22_06_2024.crud.Get.BDD_style;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Lab_269 {

    // given
    // Get request-https://api.zippopotam.us/IN/{pincode}
    // URL  :https://api.zippopotam.us
    // path - /in/{pincode}
    // header


    // when
    // get method
    // base url: https://api.zippopotam.us
    // base path : IN/560037
    // payload -> no
    // auth - basic, digest, jwt, bearer token, O auth 2.0 ? = no

    // then

    // verification
    // status code
    // response body
    // time, headers, cookies


    @Test
    public void getrequestBDDStyle(){

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("IN/560037")


                .when().log().all().get()


                .then()
                .log().all()
                .statusCode(200);


    }

    public void getrequestBDDStyle2(){

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("IN/560037")


                .when().log().all().get()


                .then()
                .log().all()
                .statusCode(200);


    }
}
