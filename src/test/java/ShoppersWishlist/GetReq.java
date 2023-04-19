package ShoppersWishlist;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class GetReq {
	@Test
	public void getTest() {
		baseURI="https://www.shoppersstack.com/shopping";
		String token="eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ2aXNod2FAZ21haWwuY29tIFNIT1BQRVIiLCJleHAiOjE2ODE5MzY0MzUsImlhdCI6MTY4MTkwMDQzNX0.y4nsQqT9JS9QTHmK2DoYvtxelUvqmh-FCo1Oxmnw2Jo";
		
		given().auth().oauth2(token)
		  .when().get("/shoppers/20330/wishlist")
		   .then().assertThat().statusCode(200).log().all();
	}
}
