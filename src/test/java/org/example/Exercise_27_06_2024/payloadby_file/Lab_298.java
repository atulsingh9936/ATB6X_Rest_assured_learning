package org.example.Exercise_27_06_2024.payloadby_file;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.io.File;

public class Lab_298 {

    @Test

    public void  testpostrequest(){
        RequestSpecification r = RestAssured.given();
        Response response;
        ValidatableResponse validatableResponse;


        String BASE_URL = "https://restful-booker.herokuapp.com";
            String BASE_PATH = "/booking";

            File file = new File("src/test/resources/Postrequest.json");

            r.baseUri(BASE_URL);
            r.basePath(BASE_PATH);
            r.contentType(ContentType.JSON).log().all();
            r.body(file);

            response = r.when().log().all().post();
            String resposnsestring = response.asString();
            System.out.println(resposnsestring);


            validatableResponse = response.then();
            validatableResponse.statusCode(200);
        }

    }

