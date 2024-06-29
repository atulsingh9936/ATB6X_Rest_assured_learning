package org.example.ex_22_06_2024.crud.Delete;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class Lab_275 {

    RequestSpecification r = RestAssured.given();
    Response response;
    ValidatableResponse Vr;
    String token="6ee9da3bca5f82a";
    String bookingID = "661";


    String BASE_URL = "https://restful-booker.herokuapp.com";
    String BASE_PATH = "/booking";



    @Test
    public void testdeleterequestNonBDD(){

        String base_path_updated = BASE_PATH+"/"+bookingID;
        System.out.println(base_path_updated);



           r.baseUri(BASE_URL);
           r.basePath(base_path_updated);
           r.contentType(ContentType.JSON);
           r.cookie("token", token);


           response = r.when().log().all().delete();

           Vr = response.then().log().all();
           Vr.statusCode(201);








    }

}
