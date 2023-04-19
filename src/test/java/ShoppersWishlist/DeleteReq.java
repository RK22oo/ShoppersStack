package ShoppersWishlist;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class DeleteReq {
	@Test
	public void getTest() {
		baseURI="https://www.shoppersstack.com/shopping";
		String token="eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ2aXNod2FAZ21haWwuY29tIFNIT1BQRVIiLCJleHAiOjE2ODE5MzY3MjgsImlhdCI6MTY4MTkwMDcyOH0.JDlGHIledXcqri6SbA66hKzhDezxD6S6v3D10sFEooc";
		
		given().auth().oauth2(token)
		  .when().delete("/shoppers/20330/wishlist/59441")
		   .then().assertThat().statusCode(200).log().all();
	}
}
