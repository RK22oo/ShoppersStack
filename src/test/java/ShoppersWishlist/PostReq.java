package ShoppersWishlist;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostReq {
	@Test
	public void test2() {
		baseURI="https://www.shoppersstack.com/shopping";
		String token="eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ2aXNod2FAZ21haWwuY29tIFNIT1BQRVIiLCJleHAiOjE2ODE5MzY0MzUsImlhdCI6MTY4MTkwMDQzNX0.y4nsQqT9JS9QTHmK2DoYvtxelUvqmh-FCo1Oxmnw2Jo";
		JSONObject obj=new JSONObject();
		obj.put("productId", 59);
		obj.put("quantity", 0);
		
		given().auth().oauth2(token).body(obj).contentType(ContentType.JSON)
		  .when().post("/shoppers/20330/wishlist")
		   .then().assertThat().statusCode(201).log().all();
	}
}
