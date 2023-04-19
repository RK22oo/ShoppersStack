package ShoppersWishlist;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class Login {
	@Test
	public void test() {
		baseURI="https://www.shoppersstack.com/shopping";
		JSONObject obj=new JSONObject();
		obj.put("email", "vishwa@gmail.com");
		obj.put("password", "Janu@123");
		obj.put("role", "SHOPPER");
		
		given().body(obj).contentType(ContentType.JSON)
		  .when().post("/users/login")
		    .then().log().all();
		      
		
	}
}
