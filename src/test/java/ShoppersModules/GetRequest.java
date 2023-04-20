package ShoppersModules;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class GetRequest {
	@Test
	public void GetReq() {
		baseURI="https://www.shoppersstack.com/shopping";
		String token="eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ2aXNod2FAZ21haWwuY29tIFNIT1BQRVIiLCJleHAiOjE2ODE5MzU4OTQsImlhdCI6MTY4MTg5OTg5NH0.lm3Skllm6zHsfRViLAXxhLNc3TawdgFFq5PbeQYvKsE";
//		int id= 20275;
		given().auth().oauth2(token)
		.when().get("/shoppers/20330/wishlist")
		.then().assertThat().statusCode(200).log().all();
	}

}
