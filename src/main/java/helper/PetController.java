package helper;

import data.PetEndpoints;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import petResponse.RequestPetModel;

import static data.PetEndpoints.PET;
import static data.PetEndpoints.URL;
import static helper.RequestHelper.createPetDto;
import static io.restassured.RestAssured.given;

public  class PetController {
    private RequestSpecification requestSpecification;
    private ResponseSpecification responseSpecification;
    public RequestPetModel pet;
    private String name;
    private long petId;
    
   public PetController(RequestPetModel pet) {
        
        requestSpecification = new RequestSpecBuilder()
                                       .setBaseUri(PetEndpoints.ADD_PET_URL)
                                       .setContentType(ContentType.JSON)
                                       .log(LogDetail.ALL).build();
        responseSpecification = new ResponseSpecBuilder()
                                        .expectStatusCode(200)
                                        .build();
    }
    
    
    public RequestPetModel addNewPet(String name, long petId) {
        return given(requestSpecification)
                       .body(createPetDto(name, petId))
                       .when()
                       .post()
                       .then()
                       .statusCode(200)
                       .and()
                       .extract()
                       .as(RequestPetModel.class);
    }
    
    public Response deletePet(long petId) {
        return RestAssured.given()
                       .when()
                       .delete(URL + PET + "/" + petId)
                       .then()
                       .statusCode(200)
                       .assertThat()
                       .extract().response();
    }
}
