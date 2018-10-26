package createtUserTests;

import petResponse.ResponsePet;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import testBase.TestBase;

import static data.PetEndpoints.URL;
import static data.PetEndpoints.USER;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

public class    CreatedUsersTest extends TestBase {
    ResponsePet response = new ResponsePet();
    
    public String assertType = "unknown";
    @Test
    public void shouldCreatedUserTest() {
        response.setId(5);
        given()
                .contentType(ContentType.JSON)
                .when()
                .body(response)
                .post(URL + USER)
                .then()
                .assertThat()
                .statusCode(200)
                .and()
                .body(is(notNullValue()))
                .extract().response().prettyPrint();
    }
}
