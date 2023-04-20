package shoppers;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetShopper {

	@Test
	public void getShopperTest() {
		baseURI = "https://www.shoppersstack.com/";

		given().pathParam("shopperId", 20262).contentType(ContentType.JSON)

		.when().get("shoppers/{shopperId}")

		.then().log().all();

	}
}
