	package shoppers;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.io.File;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class UserLogin {
	@Test
	public void userLoginTest(){
		
		baseURI = "https://www.shoppersstack.com/shopping/";

		JSONObject jObj= new JSONObject();
		jObj.put("email", "amr@gmail.com");
		jObj.put("password", "amr123");
		jObj.put("role", "SHOPPER");
		
		given().body(jObj).contentType(ContentType.JSON)

		.when().post("/users/login")

		.then().log().all();

	}
}
