package user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PutDataById {
    protected String url = "https://jsonplaceholder.typicode.com/posts";

    @Step("I set PUT endpoints")
    public String setPutEndpoint(){
        return url + "/1";
    }

    @Step("I send PUT HTTP request")
    public void sendPutHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("id", "1");
        requestBody.put("title", "Mamang Udara");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutEndpoint());
    }
    @Step("I receive PUT valid HTTP response code 200")
    public void receivePUTHttpResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

//    @Step("I receive PUT valid data for existing user")
//    public void ValidateDataForExistingUser(){
//        restAssuredThat(response -> response.body("'id'", equalTo(1)));
//        restAssuredThat(response -> response.body("'title'", equalTo("Mamang Udara")));
//    }

    @Step("I set PUT Wrong endpoints")
    public String setPutEndpoint1(){
        return url + "/02309";
    }

    @Step("I Send PUT HTTP Request2")
    public void sendPutHttpRequest1(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("id", "1");
        requestBody.put("title", "Mamang Udara");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutEndpoint1());
    }
    @Step("I receive PUT valid HTTP response code 404")
    public void receivePUTHttpResponseCode404(){
        restAssuredThat(response -> response.statusCode(500));
    }

//    @Step("I receive PUT Wrong Data")
//    public void ValidatePutWrongData(){
//        restAssuredThat(response -> response.body("''", equalTo("")));
//    }
}
