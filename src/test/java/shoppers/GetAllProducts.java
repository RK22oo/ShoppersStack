package shoppers;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetAllProducts {
	@Test
	public void getAllProducts() {
		baseURI = "https://www.shoppersstack.com/shopping/";

		given().queryParams("zoneId", "ALPHA").auth().oauth2("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhbXJAZ21haWwuY29tIFNIT1BQRVIiLCJleHAiOjE2ODE5MzM1NjQsImlhdCI6MTY4MTg5NzU2NH0.V4KWfdAAWLJgPNT5oBR2_kSSjLkEwD8x3nkRoSQDiik")

		.when().get("/products")

		.then().log().all();
	}

}
