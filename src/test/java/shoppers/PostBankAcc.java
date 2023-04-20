package shoppers;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostBankAcc {

	@Test
	public void postBankAccTest() {
		
     baseURI = "https://www.shoppersstack.com/shopping";
     
     JSONObject jObj= new JSONObject();
		jObj.put("email", "amr@gmail.com");
		jObj.put("password", "amr123");
		jObj.put("role", "SHOPPER");

		given().queryParam("bankName", "hdfc").body(jObj)

		.when().post("/bankaccounts/login")
		
		.then().log().all();
	}

}
