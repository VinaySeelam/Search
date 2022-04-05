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
	
	public final String BASE_URI = "https://waarkoop-server.herokuapp.com/";
	public final int SUCCESS_CODE = 200;
	public final int ERROR_CODE = 404;
	public final String ERROR_VALUE = "true";
	public final String ERROR_MESSAGE = "Not found";
	public final String RESOURCE = "api/v1/search/test/";
	
	
	RequestSpecification req;
	ResponseSpecification responsespi;
	RequestSpecification res;
	Response response;
		
	@Given("Accessing product payload")
	public void accessing_product_payload() throws IOException {
		
		 req = new RequestSpecBuilder().setBaseUri(BASE_URI).build();
		 responsespi = new ResponseSpecBuilder().build();
		 
		res = given().spec(req).log().all();
	}

	@When("he calls {string} product from resource")
	public void he_calls_product_from_resource(String product) throws IOException {
				
		String resource  = RESOURCE+product;
		
		if (product.equalsIgnoreCase("car")) {
			response = res.when().get(resource).then().log().all().spec(responsespi).assertThat().statusCode(ERROR_CODE).extract().response();
		} else {
			response = res.when().get(resource).then().log().all().spec(responsespi).assertThat().statusCode(SUCCESS_CODE).extract().response();
		}
	
	}

	@Then("results should be displayed")
	public void results_should_be_displayed() throws IOException {
		
		assertEquals(response.getStatusCode(),SUCCESS_CODE);
		
	}

	@Then("he don't see the results")
	public void he_don_t_see_the_results() throws IOException{
				
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		
		String error = js.getString("detail.error");
		String message = js.getString("detail.message");
		
		assertEquals(response.getStatusCode(),ERROR_CODE);
		assertEquals(error,ERROR_VALUE);
		assertEquals(message,ERROR_MESSAGE);
		
	}
	
	
	@Given("I am finding total number of users")
	public void i_am_finding_total_number_of_users() throws Exception{
		
		RestAssured.baseURI ="https://reqres.in";
		RestAssured.useRelaxedHTTPSValidation();
//		RestAssured.proxy("http.proxy.fmr.com",8000);
			String res = given().contentType("application/json").
			when().get("/api/users").
			then().log().all().assertThat().statusCode(200).extract().response().asString();
			
			JsonPath json = new JsonPath(res);
			int totalUsers = json.get("data.size()");
			System.out.println("Total Number of Users: " + totalUsers);
			System.out.println("\n");
			
			for(int i=0;i<totalUsers;i++) {
				System.out.println("First name: " + json.get("data["+i+"].first_name"));
				System.out.println("Last name: " + json.get("data["+i+"].last_name"));
				System.out.println("\n");
			}
	}
}
