package org.example.ex_22_06_2024.crud.Put;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class Lab_273 {

    RequestSpecification r = RestAssured.given();
    Response response;
    ValidatableResponse Vr;
    String token="ef699fb973156ed";
    String bookingID = "1953";


    String BASE_URL = "https://restful-booker.herokuapp.com";
    String BASE_PATH = "/booking";



    @Test
    public void testputrequestNonBDD(){

        String base_path_updated = BASE_PATH+"/"+bookingID;
        System.out.println(base_path_updated);

        String payload  ="{\n" +
                "    \"firstname\" : \"dew\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 118777,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast,lunch\"\n" +
                "}";

           r.baseUri(BASE_URL);
           r.basePath(base_path_updated);
           r.contentType(ContentType.JSON);
           r.cookie("token", token);
           r.body(payload).log().all();

           response = r.when().log().all().put();

           Vr = response.then().log().all();
           Vr.statusCode(200);
           Vr.body("firstname", Matchers.equalTo("dew"));
           Vr.body("lastname", Matchers.equalTo("Brown"));






    }

}
