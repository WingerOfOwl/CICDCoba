package user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostNewData {

    protected String url = "https://jsonplaceholder.typicode.com/posts";

    @Step("I set POST endpoints")
    public String setPostApiEndpoint(){
        return url;
    }

    @Step("I send POST HTTP request1")
    public void sendPostHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("id", 1);
        requestBody.put("title", "Mamang Laut");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());
    }

    @Step("I receive valid HTTP response code 201")
    public void receiveHttpResponseCode201(){
        restAssuredThat(response -> response.statusCode(201));
    }

//    @Step("I receive valid data for new user")
//    public void validateDatanewUser(){
//        restAssuredThat(response -> response.body("'id'", equalTo(101)));
//        restAssuredThat(response -> response.body("'title'", equalTo("Mamang Laut")));
//    }

    @Step("I set POST Wrong EndPoint")
    public String setWrongEndpoint(){
        return url + "MamangLaut";
    }

    @Step("I send POST HTTP request2")
    public void sendPostHttpRequest2(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("id", 1);
        requestBody.put("title", "Mamang Laut");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setWrongEndpoint());
    }

    @Step("I receive Post valid HTTP response code 404")
    public void receivePostHttpResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }

//    @Step("I receive Wrong data")
//    public void validateWrongDataPost(){
//        restAssuredThat(response -> response.body("'{}'", equalTo(null)));
//
//    }
}
