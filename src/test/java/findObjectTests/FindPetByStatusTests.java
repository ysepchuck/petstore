package findObjectTests;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import testBase.TestBase;

import static data.PetEndpoints.*;
import static io.restassured.RestAssured.given;

public class FindPetByStatusTests extends TestBase {
    
    
    
    
    
    @Test
    public void findPetByStatusTest() {
        
        given()
                .contentType(ContentType.JSON)
                .when()
                .get(ADD_PET_URL + FIND_BY_STATUS + STATUS_SOLD)
                .then()
                .statusCode(200).extract().response().prettyPrint();
    }
    
    @Test
    public void findPetByStatusPendingTest() {
        given()
                .contentType(ContentType.JSON)
                .when()
                .get(URL + PET + FIND_BY_STATUS + STATUS_PENDING)
                .then()
                .statusCode(200).extract().response().prettyPrint();
    }
    
}
