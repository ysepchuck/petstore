package putRequestTests;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import testBase.TestBase;

import static data.PetEndpoints.URL;
import static data.PetEndpoints.PET;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;

public class PutRequestTests extends TestBase {
    @Test
    public void shouldUpdatePetAnExistingTest() {
    
        given()
                .when()
                .contentType(ContentType.JSON)
                .body("{\n" +
                              "  \"id\": 0,\n" +
                              "  \"category\": {\n" +
                              "    \"id\": 0,\n" +
                              "    \"name\": \"dinosaurs\"\n" +
                              "  },\n" +
                              "  \"name\": \"doggie\",\n" +
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
                .put(URL + PET)
                .then()
                .assertThat()
                .statusCode(200)
                .and()
                .body("name", equalTo("doggie"))
                .extract().response().prettyPrint();
    
    }
    
}
