package ShoppersModules;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteRequest {
	@Test
	public void DeleteTest() {
		baseURI="https://www.shoppersstack.com/shopping";
		String token="eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ2aXNod2FAZ21haWwuY29tIFNIT1BQRVIiLCJleHAiOjE2ODE5MzU4OTQsImlhdCI6MTY4MTg5OTg5NH0.lm3Skllm6zHsfRViLAXxhLNc3TawdgFFq5PbeQYvKsE";
		given().auth().oauth2(token).when().delete("/shoppers/20330/wishlist/59441").then().assertThat().statusCode(204).log().all();
		
	}

}
