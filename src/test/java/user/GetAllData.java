package user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetAllData {
        protected static String url = "https://jsonplaceholder.typicode.com/posts";

        @Step("I set GET endpoints1")
        public String setApiEndpoint() {

            return url ;
        }

        @Step("I send GET HTTP request")
        public void sendGetHttpRequest() {
            SerenityRest.given()
                    .when()
                    .get(setApiEndpoint());
        }

        @Step("I receive valid HTTP response code 200")
        public void validateHttpResponseCode200() {

            restAssuredThat(response -> response.statusCode(200));
        }

//        @Step("I receive valid data for detail user")
//        public void validateDataDetailUser() {
//            restAssuredThat(response -> response.body(".'id'", equalTo(1)));
//            restAssuredThat(response -> response.body(".'title'", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")));
//        }

        @Step("I set GET Wrong EndPoint")
        public String setApiEndpoint2() {

            return url + "JiddanHaha" ;
        }

        @Step("I send GET HTTP request2")
        public void setWrongHttpGet() {
            SerenityRest.given()
                    .when()
                    .get(setApiEndpoint2());
        }

        @Step("I receive valid HTTP response code 404")
        public void validateHttpResponseCode404() {

            restAssuredThat(response -> response.statusCode(404));
        }

//        @Step("I receive Error Data Get")
//        public void validateErrorDataGet(){
//            restAssuredThat(response -> response.body("''.'id'", equalTo(1)));
//            restAssuredThat(response -> response.body("''.'title'", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")));
//        }

    }

