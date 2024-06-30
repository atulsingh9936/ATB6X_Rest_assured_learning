package org.example.Exercise_27_06_2024.gson.serialization;

import com.google.gson.Gson;
import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Lab_294 {


    RequestSpecification r = RestAssured.given();
    Response response;
    ValidatableResponse validatableResponse;
    @Description("TC#1-  verify that create booking is working with valid payload")
    @Test
    public void testnonbddstylePOSTpositive(){

        String BASE_URL = "https://restful-booker.herokuapp.com";
        String BASE_PATH = "/booking";


        //[
        //"{\n" +
        //                    "    \"firstname\" : \"" + firstName + "\",\n" +
        //                    "    \"lastname\" : \"Brown\",\n" +
        //                    "    \"totalprice\" : 111,\n" +
        //                    "    \"depositpaid\" : true,\n" +
        //                    "    \"bookingdates\" : {\n" +
        //                    "        \"checkin\" : \"2018-01-01\",\n" +
        //                    "        \"checkout\" : \"2019-01-01\"\n" +
        //                    "    },\n" +
        //                    "    \"additionalneeds\" : \"Breakfast\"\n" +
        //                    "}";
        //

        //"{\n" +
        //                    "    \"firstname\" : \"" + firstName + "\",\n" +
        //                    "    \"lastname\" : \"Brown\",\n" +
        //                    "    \"totalprice\" : 111,\n" +
        //                    "    \"depositpaid\" : true,\n" +
        //                    "    \"bookingdates\" : {\n" +
        //                    "        \"checkin\" : \"2018-01-01\",\n" +
        //                    "        \"checkout\" : \"2019-01-01\"\n" +
        //                    "    },\n" +
        //                    "    \"additionalneeds\" : \"Breakfast\"\n" +
        //                    "}";
        //]


        Booking booking = new Booking();
        booking.setFirstname("atul");
        booking.setLastname("singh");
        booking.setTotalprice(1144);
        booking.setDepositpaid(true);

        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("2024-02-01");
        bookingdates.setCheckout("2024-02-05");
        booking.setBookingdates(bookingdates);
        booking.setAdditionalneeds("Breakfast");




//        Booking booking1 = new Booking();
//        booking1.setFirstname("brown");
//        booking1.setLastname("singh");
//        booking1.setTotalprice(-1);
//        booking1.setDepositpaid(true);
//
//        Bookingdates bookingdates1 = new Bookingdates();
//        bookingdates1.setCheckin("2024-02-01");
//        bookingdates1.setCheckout("2024-02-05");
//        booking1.setBookingdates(bookingdates);
//        booking1.setAdditionalneeds("Breakfast");
//
//        System.out.println(booking.toString());
//
//
//        ArrayList payload = new ArrayList();
//        payload.add(booking);
//        payload.add(booking1);
//        System.out.println(payload);



        // Serialization -> java object(pojo class of booking) - JSONString
        Gson gson  = new Gson();
        String jsonStringpayload =gson.toJson(booking);
        System.out.println(jsonStringpayload);




//        r.baseUri(BASE_URL);
//        r.basePath(BASE_PATH);
//        r.contentType(ContentType.JSON).log().all();
//        r.body(booking);
//
//        response = r.when().log().all().post();
//        String resposnsestring = response.asString();
//        System.out.println(resposnsestring);
//
//
//        validatableResponse = response.then();
//        validatableResponse.statusCode(200);
    }




}
