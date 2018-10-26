package findObjectTests;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import testBase.TestBase;

import static data.PetEndpoints.URL;
import static data.PetEndpoints.PET;
import static io.restassured.RestAssured.given;

public class GetPetByIdTests extends TestBase {
    
    @Test
    public void shouldGetPetBuId(){
        given()
                .contentType(ContentType.JSON)
                .when()
                .get(URL + PET +"/1")
                .then()
                .statusCode(200)
                .extract().response().prettyPrint();
    
    }
    
   
}
