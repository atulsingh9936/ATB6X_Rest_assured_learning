package org.example.ex_22_06_2024.crud.full;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class Lab_277 {

    String token;
    Integer bookingID;
    RequestSpecification requestSpecification = RestAssured.given();
    ValidatableResponse validatableResponse;
    Response response;


    @BeforeTest

    public  void  getAToken(){

        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("auth");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(payload);

        response = requestSpecification.post();
        validatableResponse = response.then();
        validatableResponse.statusCode(200);


        // extract the token from this
        token = response.then().log().all().extract().path("token");
        Assert.assertNotNull(token);
    }

    @BeforeTest
    public void  getBookingID(){

        String Payload = "{\n" +
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


        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(Payload);


        response = requestSpecification.when().post();

        ValidatableResponse validatableResponse = response.then();
        String responseString = response.asString();
        System.out.println(responseString);


        validatableResponse.statusCode(200);

        bookingID  = response.then().log().all().extract().path("bookingid");
        String firstname = response.then().log().all().extract().path("booking.firstname");
        System.out.println(firstname);
        System.out.println(bookingID);
        Assert.assertNotNull(bookingID);

    }



    @Test
    public void testputrequestpositive(){
        // token and bookingid
        System.out.println("Test case - put request");
        String payload = "{\n" +
                "    \"firstname\" : \"Atul\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 118777,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast,lunch\"\n" +
                "}";

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("booking/"+bookingID);
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token", token);

        // put request


        requestSpecification.body(payload).log().all();
        response = requestSpecification.when().put();


        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);







        String fullresponseJSONString = response.asString();
        System.out.println(fullresponseJSONString);

        // Verify all the keys and value pairs in the response
        // firstname, lastname, deposit, total, checkin

     // 3 ways you can verify the response


        //1. RA- matchers
       validatableResponse.body("firstname", Matchers.equalTo("Atul"));
        validatableResponse.body("lastname", Matchers.equalTo("Brown"));




        // 2. TestNG Asserts - Assert.assertequals (firstnameresponse,"pramod");


        String firstname  = response.then().log().all().extract().path("firstname");
        Assert.assertEquals(firstname,"Atul");

        // 3 Testng assertion with json path lib
        JsonPath jsonpath = new JsonPath(fullresponseJSONString);
        String firstnameJSONpatchextracted = jsonpath.getString("firstname");
        String lastnameJSONpatchextracted = jsonpath.getString("lastname");
        Integer totalpriceJSONpatchextracted = jsonpath.getInt("totalprice");
        String checkin =   jsonpath.getString("bookingdates.checkin");

        Assert.assertEquals(firstname,"Atul");
        Assert.assertEquals(lastnameJSONpatchextracted,"Brown");
        Assert.assertEquals(totalpriceJSONpatchextracted,118777);
        Assert.assertEquals(checkin,"2018-01-01");



        // JSON Array Response
//        String checkin = jsonPath.getString("[0][\"bookingdates\"][\"checkin\"]");
//        System.out.println(checkin);


        //4. AssertJ matching
          assertThat(firstnameJSONpatchextracted)
                  .isEqualTo("Atul")
                  .isNotBlank().isNotEmpty();

            assertThat(totalpriceJSONpatchextracted).isPositive().isNotZero().isNotNegative();




    }

}
