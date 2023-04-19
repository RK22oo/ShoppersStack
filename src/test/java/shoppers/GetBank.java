package shoppers;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetBank {
	
	
	@Test
	public void getBankTest() {
		baseURI = "https://www.shoppersstack.com/shopping/";

		given().queryParams("shopperId", 20262).contentType(ContentType.JSON)

		.when().get("/bankaccounts")

		.then().log().all();

	}

}
