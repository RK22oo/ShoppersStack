package ShoppersModules;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostRequest {
	@Test
	public void postRe() {
	baseURI="https://www.shoppersstack.com/shopping";
	String token="eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ2aXNod2FAZ21haWwuY29tIFNIT1BQRVIiLCJleHAiOjE2ODE5MzYxNzAsImlhdCI6MTY4MTkwMDE3MH0.da1egbHs3JbOruhoZezJj4MuBOolGG12nV_9mYdou3k";
	JSONObject obj=new JSONObject();
	obj.put("projectId",89);
	obj.put("quantity", 0);
	given().auth().oauth2(token).body(obj).contentType(ContentType.JSON)
	.when().post("/shoppers/20330/wishlist")
	   .then().assertThat().statusCode(201).log().all();
		
	}

}
