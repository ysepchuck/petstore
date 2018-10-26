package data;

public class PetEndpoints {
    
    public static final String PET_BASE_URL = "https://petstore.swagger.io/v2";
    public static final String ADD_PET_URL = PET_BASE_URL + "/pet";
    public static final String UPDATE_PET_URL = ADD_PET_URL + "/" ;
    public static final String DELETE_PET_URL = ADD_PET_URL + "/" + "{id}";
    public static final String URL = "https://petstore.swagger.io/v2";
    public static final String FIND_BY_STATUS = "/findByStatus";
    public static final String PET = "/pet";
    public static final String STATUS_SOLD = "?status=sold";
    public static final String STATUS_AVAILABLE = "?status=available";
    public static final String STATUS_PENDING = "?status=pending";
    public static final String STORE_INVENTORY = "/store/inventory";
    public static final String STORE_ORDER = "/store/order/";
    public static final String USER = "/user";
    public static final String USER_CREATE_WITH_ARRAY = "/user/createWithArray";
    public static final String UPDATE_PET_JASON = "{\n" +
                                                        "  \"id\": 0,\n" +
                                                        "  \"category\": \"dinosaurs\" {\n" +
                                                        "    \"id\": 0,\n" +
                                                        "    \"name\": \"string\"\n" +
                                                        "  },\n" +
                                                        "  \"name\": \"doggie\",\n" +
                                                        "  \"photoUrls\": [\n" +
                                                        "    \"string\"\n" +
                                                        "  ],\n" +
                                                        "  \"tags\": [\n" +
                                                        "    {\n" +
                                                        "      \"id\": 0,\n" +
                                                        "      \"name\": \"string\"\n" +
                                                        "    }\n" +
                                                        "  ],\n" +
                                                        "  \"status\": \"available\"\n" +
                                                        "}";
    public static final String CREATED_PET_JASON = "{\n" +
                                     "  \"id\": 0,\n" +
                                     "  \"category\": {\n" +
                                     "    \"id\": 0,\n" +
                                     "    \"name\": \"Dinosaur\"\n" +
                                     "  },\n" +
                                     "  \"name\": \"Masha\",\n" +
                                     "  \"photoUrls\": [\n" +
                                     "    \"string\"\n" +
                                     "  ],\n" +
                                     "  \"tags\": [\n" +
                                     "    {\n" +
                                     "      \"id\": 0,\n" +
                                     "      \"name\": \"TiRex\"\n" +
                                     "    }\n" +
                                     "  ],\n" +
                                     "  \"status\": \"available\"\n" +
                                     "}";
    
    public PetEndpoints() {
    }
}
