package functionalPeststoreTests;

import helper.PetController;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;
import petResponse.RequestPetModel;
import testBase.TestBase;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class FunctionalPetTests extends TestBase {
    long getPetId;
    int id = 1;
    RequestPetModel newPet = new RequestPetModel();
    PetController petController = new PetController(newPet);
    
    @Test(priority = 1)
    public void shouldCreatedPetTest() {
        
        petController.addNewPet(petName, petId);
        RequestPetModel resultPet = petController.addNewPet(petName, petId);
        getPetId = resultPet.getId();
        assertThat(resultPet.getId(), equalTo(petId));
    }
    
    @Test(priority = 2)
    public void shouldDeletePetTest() {
         petController.deletePet(1);
         
        
    }
    
    
    @Test(priority = 3)
    public void petShouldBeDeleted(){
    
        SoftAssertions assertions = new SoftAssertions();
        petController.searchPet(id).prettyPrint();
        assertions.assertThat(petController.addNewPet(petName,2).getId());
        assertions.assertAll();
    
    
    
    
    }
}
