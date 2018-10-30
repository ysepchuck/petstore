package createdPetTests;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import pet.PetResponse;
import petResponse.Category;
import testBase.TestBase;

import static data.PetEndpoints.*;
import static helper.RequestHelper.createPetDto;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Is.is;


public class CreatedPetTests extends TestBase {
    public static String name = "Name";
    public static String nameTwo = "Masha";
    
    Category category = new Category();
    
    
    @Test
    public void shouldCreatedPetWithNameTest() {
        PetResponse petResponse = petApiClient.createdPet(createPetDto(name, 1))
                                          .then()
                                          .statusCode(200)
                                          .assertThat()
                                          .extract().response().as(PetResponse.class);
        
        assertThat("ID was not generated nad it's NULL", petResponse.getId(), is(notNullValue()));
        assertThat("Ids are not equal", petResponse.getName(), equalTo(name));
        petResponse.toString();
        System.out.println(petResponse);
        
        
        
    }
    
    
    @Test
    public void shouldCreatedPetTest() {
        
        category.setName("Dinosaurs");
        
        given()
                .contentType(ContentType.JSON)
                .when()
                .body(createPetDto(nameTwo, 2))
                .post(URL + PET)
                .then()
                .statusCode(200)
                .and()
                .assertThat()
                .body(containsString(nameTwo))
                .extract().response().prettyPrint();
    }
    
    @Test
    public void shouldUpdatePetTest() {
        given()
                .when()
                .contentType(ContentType.JSON)
                .body("[\n" +
                              "\"pedId\": \"1\"" +
                              "      \"name\": \"string\"\n" +
                              "  \"status\": \"life\"\n" +
                              "]")
                .post(ADD_PET_URL + "/9143431158144725398")
                .then()
                .assertThat()
                .statusCode(200)
                .and()
                .body(is(notNullValue()))
                .extract().response().prettyPrint();
    }
    
    
}
