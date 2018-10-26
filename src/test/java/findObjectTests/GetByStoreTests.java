package findObjectTests;

import org.testng.annotations.Test;
import testBase.TestBase;

import static data.PetEndpoints.URL;
import static data.PetEndpoints.STORE_INVENTORY;
import static data.PetEndpoints.STORE_ORDER;
import static io.restassured.RestAssured.given;

public class GetByStoreTests extends TestBase {
    
    @Test
    public void shouldFindByStore() {
        given()
                .when()
                .get(URL + STORE_INVENTORY)
                .then()
                .statusCode(200).extract().response().prettyPrint();
    }
    
    
  
    
    @Test
    public void shouldGetStoreByOrderId() {
        given()
                .when()
                .get(URL + STORE_ORDER + "0")
                .then()
                .statusCode(200).extract().response().prettyPrint();
    }
}
