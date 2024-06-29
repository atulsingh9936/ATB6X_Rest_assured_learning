package org.example.ex_22_06_2024.crud.Patch;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class Lab_274 {

    RequestSpecification r = RestAssured.given();
    Response response;
    ValidatableResponse Vr;
    String token="ed71723a70b9eb7";
    String bookingID = "3048";


    String BASE_URL = "https://restful-booker.herokuapp.com";
    String BASE_PATH = "/booking";



    @Test
    public void testpatchrequestNonBDD(){

        String base_path_updated = BASE_PATH+"/"+bookingID;
        System.out.println(base_path_updated);

        String payload  ="{\n" +
                "    \"firstname\" : \"atul\"\n" +

                "}";

           r.baseUri(BASE_URL);
           r.basePath(base_path_updated);
           r.contentType(ContentType.JSON);
           r.cookie("token", token);
           r.body(payload).log().all();

           response = r.when().log().all().patch();

           Vr = response.then().log().all();
           Vr.statusCode(200);
           Vr.body("firstname", Matchers.equalTo("atul"));







    }

}
