package org.example.ex_22_06_2024.crud.Post;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab_272 {
    RequestSpecification r = RestAssured.given();
    Response response;
    ValidatableResponse  validatableResponse;
    @Description("TC#1-  verify that create booking is working with valid payload")
    @Test
    public void testnonbddstylePOSTpositive(){

        String BASE_URL = "https://restful-booker.herokuapp.com";
        String BASE_PATH = "/booking";
        String payload = "{\n" +
                "    \"firstname\" : \"new user\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2024-07-17\",\n" +
                "        \"checkout\" : \"2024-09-19\"\n" +
                "    },\n" +
                "   \"additionalneeds\" : \"Breakfast\"\n" +
                "}";



               r.baseUri(BASE_URL);
               r.basePath(BASE_PATH);
               r.contentType(ContentType.JSON).log().all();
               r.body(payload);

             response = r.when().log().all().post();
             String resposnsestring = response.asString();
             System.out.println(resposnsestring);


        validatableResponse = response.then();
        validatableResponse.statusCode(200);
    }

    @Description("TC#1-  verify that create booking is not working with 500 error")

    @Test
    public void testnonbddstylePOSTNegative(){

        String BASE_URL = "https://restful-booker.herokuapp.com";
        String BASE_PATH = "/booking";
        String payload = "";



        r.baseUri(BASE_URL);
        r.basePath(BASE_PATH);
        r.contentType(ContentType.JSON).log().all();
        r.body(payload);

        response = r.when().log().all().post();
        String resposnsestring = response.asString();
        System.out.println(resposnsestring);



        validatableResponse = response.then();
        validatableResponse.statusCode(500);
    }


    }

