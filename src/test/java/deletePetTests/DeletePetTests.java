package deletePetTests;

import org.testng.annotations.Test;
import testBase.TestBase;

import static data.PetEndpoints.URL;
import static data.PetEndpoints.PET;
import static io.restassured.RestAssured.given;

public class DeletePetTests extends TestBase {
    public static String petId = "1";
    @Test
    public void shouldDeletePetTest() {
        given()
                .when()
                .delete(URL + PET +"/" + petId)
                .then()
                .statusCode(200)
                .assertThat()
                .extract().response().prettyPrint();
        
       
        
    }
    
//    RequestSpecification
    
}
