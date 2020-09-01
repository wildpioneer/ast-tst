package steps;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.http.protocol.HTTP;
import services.ReadProperties;

import static io.restassured.RestAssured.given;

public class ApiSteps  {
    private String endpoint;

    @Given("^api is up$")
    public void apiIsUp() {
        RestAssured.baseURI = new ReadProperties().getApiURL();
    }

    @When("^admin send GET request to \"([^\"]*)\"$")
    public void adminSendGETRequestTo(String endpoint) {
        this.endpoint = endpoint;
    }

    @Then("^status code is (\\d+)$")
    public void statusCodeIs(int statusCode) {
        given()
                .header(HTTP.CONTENT_TYPE, ContentType.JSON)
                .header(HTTP.CHARSET_PARAM, "UTF-8")
                .body("{\n" +
                        "    \"username\": \"steven.moreau@juiceplus.com\",\n" +
                        "    \"password\": \"Abcd1234\",\n" +
                        "    \"rememberMe\": false\n" +
                        "}")
                .when().post(endpoint)
                .then().log().all().statusCode(statusCode);
    }
}
