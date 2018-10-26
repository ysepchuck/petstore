package updatePetTests;

import io.restassured.http.ContentType;

import static data.PetEndpoints.URL;
import static data.PetEndpoints.STORE_ORDER;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UpdateStoreTests {
    @Test
    public void shouldUpdateStoreByOrder() {
        given()
                .when()
                .body("{\n" +
                              "  \"id\": 5,\n" +
                              "  \"petId\": 2,\n" +
                              "  \"quantity\": 4554545,\n" +
                              "  \"shipDate\": \"2018-10-23T08:38:45.888Z\",\n" +
                              "  \"status\": \"placed\",\n" +
                              "  \"complete\": false\n" +
                              "}")
                .contentType(ContentType.JSON)
                .post(URL+ STORE_ORDER)
                .then()
                .assertThat()
                .statusCode(200)
                .and()
                .body("id", equalTo(5))
                .extract().response().prettyPrint();
    }
}
