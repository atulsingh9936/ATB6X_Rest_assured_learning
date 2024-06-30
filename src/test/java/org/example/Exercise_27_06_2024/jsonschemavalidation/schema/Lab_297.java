package org.example.Exercise_27_06_2024.jsonschemavalidation.schema;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.testng.annotations.Test;

import java.io.File;

public class Lab_297 {

    @Test

    public void Jsvalidation(){
        RestAssured.given()
                .baseUri("https://jsonplaceholder.typicode.com/posts/2")
                .when().get().then().assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(new File("src/test/resources/Schema.json")));
    }
}
