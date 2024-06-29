package org.example.ex_22_06_2024.crud.Get.Non_BDD_style;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab_270 {
   RequestSpecification rs = RestAssured.given();

   @Test
    public void getrequestNonBddstyle(){
      rs.baseUri("https://api.zippopotam.us");
      rs.basePath("IN/560037");
      rs.when().log().all().get();
      rs.then().log().all().statusCode(200);
   }

   @Test
   public void getrequestNonBddstyle2(){
      rs.baseUri("https://api.zippopotam.us");
      rs.basePath("IN/560037");
      rs.when().log().all().get();
      rs.then().log().all().statusCode(200);
   }


}
