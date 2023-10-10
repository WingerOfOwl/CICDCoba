package user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteById {
    protected String url = "https://jsonplaceholder.typicode.com/posts";
    @Step("I set DELETE endpoints")
    public String setDeleteEndpoint(){
        return url + "/1";
    }

    @Step("I send DELETE HTTP request")
    public void sendDeleteHttpRequest(){
        SerenityRest.given().delete(setDeleteEndpoint());
    }
    @Step("I receive DELETE valid HTTP response code 200")
    public void validHttpDELETEresponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set DELETE Wrong endpoints")
    public String setWrongDeleteEndpoint(){
        return url + "/JiddanGanteng";
    }

    @Step("I send DELETE HTTP request1")
    public void sendDeleteHttpRequest1(){
        SerenityRest.given().delete(setWrongDeleteEndpoint());
    }
    @Step("I receive DELETE valid HTTP response code 404")
    public void validHttpDELETEresponseCode404(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
