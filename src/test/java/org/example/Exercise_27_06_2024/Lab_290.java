package org.example.Exercise_27_06_2024;

import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class Lab_290 {

    // payload using map
    // post request - payload - string

    //{
    //            "firstname" : "Jim",
    //    //                "lastname" : "Brown",
    //                "totalprice" : 111,
    //                "depositpaid" : true,
    //                "bookingdates" : {
    //            "checkin" : "2018-01-01",
    //                    "checkout" : "2019-01-01"
    //        },
    //            "additionalneeds" : "Breakfast"
    //        }

    @Test
    public void testPostreq(){
       // Map<String,Objects>  jsonBodyusingMap = new HashMap<>();
        //  "lastname" : "Brown", "firstname" : "Jim" - random order
        Map<String,Object>  jsonBodyusingMap = new LinkedHashMap<>();
        Faker faker = new Faker();
        String firstname = faker.name().firstName();
        String lastname = faker.name().lastName();

        jsonBodyusingMap.put("firstname", firstname);
        jsonBodyusingMap.put("Lastname", lastname);
        jsonBodyusingMap.put("totalprice",faker.random().nextInt(1000));
        jsonBodyusingMap.put("depositpaid",faker.random().nextBoolean());

        Map<String,Object> bookingdatesMap = new LinkedHashMap<>();
        bookingdatesMap.put("checkin"," 2018-01-01");
        bookingdatesMap.put("checkout"," 2018-01-05");

        jsonBodyusingMap.put("bookingdates",bookingdatesMap);
        jsonBodyusingMap.put("additionalneeds ","Breakfast");

        System.out.println(jsonBodyusingMap);

        RequestSpecification r = RestAssured
                .given();
        Response response;
        ValidatableResponse validatableResponse;

        String BASE_URL = "https://restful-booker.herokuapp.com";
        String BASE_PATH = "/booking";
        r.baseUri(BASE_URL);
        r.basePath(BASE_PATH);
        r.contentType(ContentType.JSON).log().all();
        r.body(jsonBodyusingMap);

        response = r.when().log().all().post();
       String resposnsestring = response.asString();
        // System.out.println(resposnsestring);


        validatableResponse = response.then();
        validatableResponse.statusCode(200);
    }



    }


