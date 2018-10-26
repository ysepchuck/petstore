package updatePetTests;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import testBase.TestBase;

import static data.PetEndpoints.URL;
import static data.PetEndpoints.PET;
import static io.restassured.RestAssured.given;

public class UpdatePetTests extends TestBase {
    
    @Test
    public void shouldUpdatePetTest() {
        given()
                .contentType(ContentType.JSON)
                .when()
                .body("{\n" +
                              "  \"id\": 565286146545451,\n" +
                              "  \"category\": {\n" +
                              "    \"id\": 0,\n" +
                              "    \"name\": \"Dinosaurs\"\n" +
                              "  },\n" +
                              "  \"name\": \"Dima\",\n" +
                              "  \"photoUrls\": [\n" +
                              "    \"string\"\n" +
                              "  ],\n" +
                              "  \"tags\": [\n" +
                              "    {\n" +
                              "      \"id\": 0,\n" +
                              "      \"name\": \"string\"\n" +
                              "    }\n" +
                              "  ],\n" +
                              "  \"status\": \"available\"\n" +
                              "}")
                .post(URL + PET)
                .then().statusCode(200).extract().response().prettyPrint();
    }
}
