package basic;
import static io.restassured.RestAssured.*;

import java.io.File;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
public class Get {
	@Test
	public void test() {
		
		baseURI="https://www.shoppersstack.com/shopping";
		JSONObject jo=new JSONObject();
		jo.put("email", "rohanimds@gmail.com");
		jo.put("password", "Qwerty1@");
		jo.put("role", "ADMIN");
		
		given().body(jo).contentType(ContentType.JSON)
		.when().post("/users/login")
		.then().assertThat().statusCode(200).log().all();

		given().auth().oauth2("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJyb2hhbmltZHNAZ21haWwuY29tIEFETUlOIiwiZXhwIjoxNjgxOTMzOTI5LCJpYXQiOjE2ODE4OTc5Mjl9.iLon7-auMK8hsOENKhjVMi_kddovZTg-ZIFEFRVxnZQ")
		.when().get("/admin/20246")
		.then()
		.log().all();
	}
}
