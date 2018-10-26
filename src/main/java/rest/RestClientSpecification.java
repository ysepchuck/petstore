package rest;

import data.PetEndpoints;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RestClientSpecification {
    
    
    
    public RequestSpecification specification(String url){
        RequestSpecification requestSpecification = new RequestSpecBuilder()
                                                            .setBaseUri(url)
                                                            .setContentType(ContentType.JSON)
                                                            .log(LogDetail.ALL)
                                                            .build();
        
        return requestSpecification;
    }
}
