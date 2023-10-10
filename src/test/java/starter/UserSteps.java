package starter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import user.*;

public class UserSteps {
    @Steps
    GetAllData get;
    @Steps
    PostNewData post;
    @Steps
    GetDataById GBI;
    @Steps
    PutDataById put;
    @Steps
    DeleteById delete;
    @Given("I set GET endpoints1")
    public void setGetApiEndpoint(){
        get.setApiEndpoint();
    }
    @When("I send GET HTTP request")
    public void sendGetHttpRequest(){
        get.sendGetHttpRequest();
    }

    @Then("I receive valid HTTP response code 200")
    public void receiveValidHttpResponseCode(){
        get.validateHttpResponseCode200();
    }

//    @And("I receive valid data for detail user")
//    public void receiveValidGetData(){
//        get.validateDataDetailUser();
//    }

    @Given("I set GET Wrong EndPoint")
    public void setApiEndpoint2(){
        get.setApiEndpoint2();
    }
    @When("I send GET HTTP request2")
    public void setWrongHttpGet(){
        get.setWrongHttpGet();
    }

    @Then("I receive valid HTTP response code 404")
    public void validateHttpResponseCode404(){
        get.validateHttpResponseCode404();
    }

//    @And("I receive Error Data Get")
//    public void validateErrorDataGet(){
//        get.validateErrorDataGet();
//    }

    @Given("I set POST endpoints")
    public void setPostApiEndpoint(){
        post.setPostApiEndpoint();
    }
    @When("I send POST HTTP request1")
    public void sendPostHttpRequest(){
        post.sendPostHttpRequest();
    }
    @Then("I receive valid HTTP response code 201")
    public void receiveHttpResponseCode201(){
        post.receiveHttpResponseCode201();
    }

//    @And("I receive valid data for new user")
//    public void validateDatanewUser(){
//        post.validateDatanewUser();
//    }

    @Given("I set POST Wrong EndPoint")
    public void setWrongEndpoint(){
        post.setWrongEndpoint();
    }
    @When("I send POST HTTP request2")
    public void sendPostHttpRequest2(){
        post.sendPostHttpRequest2();
    }
    @Then("I receive Post valid HTTP response code 404")
    public void receivePostHttpResponseCode404(){
        post.receivePostHttpResponseCode404();
    }

//    @And("I receive Wrong data")
//    public void validateWrongDataPost(){
//        post.validateWrongDataPost();
//    }

    @Given("I set GET by ID endpoints")
    public void setApiEndpointGetbyID1(){
        GBI.setApiEndpointGetbyID1();
    }
    @When("I send GET by ID HTTP request")
    public void sendGetByIDHttpRequest(){
        GBI.sendGetByIDHttpRequest();
    }
    @Then("I receive GET by ID valid HTTP response code 200")
    public void validateHttpResponseCode200byID(){
        GBI.validateHttpResponseCode200byID();
    }

//    @And("I receive valid data for detail user by ID")
//    public void validateDataDetailUserbyID(){
//        GBI.validateDataDetailUserbyID();
//    }

    @Given("I set Wrong Get By Id EndPoint")
    public void setApiEndpointbyID2(){
        GBI.setApiEndpointbyID2();
    }
    @When("I send GET BY ID HTTP request2")
    public void setWrongHttpGetbyId(){
        GBI.setWrongHttpGetbyId();
    }
    @Then("I receive GET BY ID valid HTTP response code 404")
    public void validateHttpResponseCode404byID(){
        GBI.validateHttpResponseCode404byID();
    }

//    @And("I receive Error Data from Get By ID")
//    public void validateErrorDataGetbyID(){
//        GBI.validateErrorDataGetbyID();
//    }

    @Given("I set PUT endpoints")
    public void setPutEndpoint(){
        put.setPutEndpoint();
    }
    @When("I send PUT HTTP request")
    public void sendPutHttpRequest(){
        put.sendPutHttpRequest();
    }
    @Then("I receive PUT valid HTTP response code 200")
    public void receivePUTHttpResponseCode200(){
        put.receivePUTHttpResponseCode200();
    }

//    @And("I receive PUT valid data for existing user")
//    public void ValidateDataForExistingUser(){
//        put.ValidateDataForExistingUser();
//    }

    @Given("I set PUT Wrong endpoints")
    public void setPutEndpoint1(){
        put.setPutEndpoint1();
    }
    @When("I Send PUT HTTP Request2")
    public void sendPutHttpRequest1(){
        put.sendPutHttpRequest1();
    }
    @Then("I receive PUT valid HTTP response code 404")
    public void receivePUTHttpResponseCode404(){
        put.receivePUTHttpResponseCode404();
    }

//    @And("I receive PUT Wrong Data")
//    public void ValidatePutWrongData(){
//        put.ValidatePutWrongData();
//    }

    @Given("I set DELETE endpoints")
    public void setDeleteEndpoint(){
        delete.setDeleteEndpoint();
    }
    @When("I send DELETE HTTP request")
    public void sendDeleteHttpRequest(){
        delete.sendDeleteHttpRequest();
    }
    @Then("I receive DELETE valid HTTP response code 200")
    public void validHttpDELETEresponseCode200(){
        delete.validHttpDELETEresponseCode200();
    }

    @Given("I set DELETE Wrong endpoints")
    public void setWrongDeleteEndpoint(){
        delete.setWrongDeleteEndpoint();
    }
    @When("I send DELETE HTTP request1")
    public void sendDeleteHttpRequest1(){
        delete.sendDeleteHttpRequest1();
    }
    @Then("I receive DELETE valid HTTP response code 404")
    public void validHttpDELETEresponseCode404(){
        delete.validHttpDELETEresponseCode404();
    }
}
