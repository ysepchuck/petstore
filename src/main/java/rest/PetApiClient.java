package rest;

import data.PetEndpoints;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import petResponse.RequestPetModel;

import static data.PetEndpoints.ADD_PET_URL;

public class PetApiClient {
    
    
    RestClientSpecification api = new RestClientSpecification();
    
    public Response craetedPet(RequestPetModel pet){
       return RestAssured.given(api.specification(ADD_PET_URL))
                      .body(pet)
                      .post(ADD_PET_URL);
    }
    
    public Response deletePet(String petId){
        return api.specification(String.format(PetEndpoints.DELETE_PET_URL, petId)).delete();
    }
    
    
}
