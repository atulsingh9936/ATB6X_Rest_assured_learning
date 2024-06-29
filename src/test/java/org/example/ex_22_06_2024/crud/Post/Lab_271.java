package org.example.ex_22_06_2024.crud.Post;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class Lab_271 {

    @Test
    public void testbddstylepostpositive(){

        // post request
        // url
        // body - payload - json
        //Header - content type
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

        RestAssured
                .given().baseUri(BASE_URL).basePath(BASE_PATH)
                .contentType(ContentType.JSON).log().all().body(payload)

                .when().log().all().post()

                .then().log().all().statusCode(200);
    }
}
