package helper;

import petResponse.RequestPetModel;

import java.util.Collection;
import java.util.Collections;

public class RequestHelper {
    
    public static RequestPetModel createPetDto (String name, long id){
        RequestPetModel pet = new RequestPetModel();
        pet.setName(name);
        pet.setId(id);
        return pet;
    }
}
