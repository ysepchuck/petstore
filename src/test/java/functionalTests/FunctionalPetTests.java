package functionalTests;

import helper.PetController;
import org.testng.annotations.Test;
import petResponse.RequestPetModel;
import testBase.TestBase;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class FunctionalPetTests extends TestBase {
    long getPetId;
    RequestPetModel newPet = new RequestPetModel();
    PetController petController = new PetController(newPet);
    
    @Test
    public void shouldCreatedPetTest() {
        
        petController.addNewPet(petName, petId);
        RequestPetModel resultPet = petController.addNewPet(petName, petId);
        getPetId = resultPet.getId();
        assertThat(resultPet.getId(), equalTo(petId));
    }
    
    @Test
    public void shouldDeletePetTest() {
         petController.deletePet(1);
         
        System.out.println();
    }
    
    
    @Test
    public void petShouldBeDeleted(){
        int id = 1;
        petController.deletePet(id);
        
        
        
    }
}
