package user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetDataById {
    protected static String url = "https://jsonplaceholder.typicode.com/posts/1";

    @Step("I set GET by ID endpoints")
    public String setApiEndpointGetbyID1() {
        return url ;
    }

    @Step("I send GET by ID HTTP request")
    public void sendGetByIDHttpRequest() {
        SerenityRest.given()
                .when()
                .get(setApiEndpointGetbyID1());
    }

    @Step("I receive GET by ID valid HTTP response code 200")
    public void validateHttpResponseCode200byID() {

        restAssuredThat(response -> response.statusCode(200));
    }

//    @Step("I receive valid data for detail user by ID")
//    public void validateDataDetailUserbyID() {
//        restAssuredThat(response -> response.body("''.'id'", equalTo(1)));
//        restAssuredThat(response -> response.body("''.'title'", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")));
//    }

    @Step("I set Wrong Get By Id EndPoint")
    public String setApiEndpointbyID2() {

        return url + "JiddanHaha" ;
    }

    @Step("I send GET BY ID HTTP request2")
    public void setWrongHttpGetbyId() {
        SerenityRest.given()
                .when()
                .get(setApiEndpointbyID2());
    }

    @Step("I receive GET BY ID valid HTTP response code 404")
    public void validateHttpResponseCode404byID() {

        restAssuredThat(response -> response.statusCode(404));
    }

//    @Step("I receive Error Data from Get By ID")
//    public void validateErrorDataGetbyID(){
//        restAssuredThat(response -> response.body("''", equalTo("")));
//    }

}
