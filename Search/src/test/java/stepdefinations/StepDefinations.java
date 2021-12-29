package stepdefinations;

import java.io.IOException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import static org.junit.Assert.*;
import static io.restassured.RestAssured.*;

public class StepDefinations {
	
	RequestSpecification req;
	ResponseSpecification responsespi;
	RequestSpecification res;
	Response response;
	
	@Given("Accessing product payload")
	public void accessing_product_payload() throws IOException {
		
		 req = new RequestSpecBuilder().setBaseUri("https://waarkoop-server.herokuapp.com/").build();
		 responsespi = new ResponseSpecBuilder().build();
		 
		res = given().spec(req).log().all();
	}

	@When("he calls {string} product from resource")
	public void he_calls_product_from_resource(String product) throws IOException {
		
		String resource  = "api/v1/search/test/"+product+"";
		
		if (product.equalsIgnoreCase("car")) {
			response = res.when().get(resource).then().log().all().spec(responsespi).assertThat().statusCode(404).extract().response();
		} else {
			response = res.when().get(resource).then().log().all().spec(responsespi).assertThat().statusCode(200).extract().response();
		}
	
	}

	@Then("results should be displayed")
	public void results_should_be_displayed() throws IOException {
		assertEquals(response.getStatusCode(),200);
		
	}

	@Then("he don't see the results")
	public void he_don_t_see_the_results() throws IOException{
		
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		
		String error = js.getString("detail.error");
		String message = js.getString("detail.message");
		
		assertEquals(response.getStatusCode(),404);
		assertEquals(error,"true");
		assertEquals(message,"Not found");
		
	}


}
