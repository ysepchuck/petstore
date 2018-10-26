package testBase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import rest.PetApiClient;

public class TestBase {
    
    protected PetApiClient petApiClient;
    
    
    public String petName = "Snow";
    public long petId = 1;
    
    @BeforeClass
    public void setUp() {
        petApiClient = new PetApiClient();
    }
    
    @AfterClass
    public void tearDown() {
    
    }
}
