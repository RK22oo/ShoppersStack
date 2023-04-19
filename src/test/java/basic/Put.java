package basic;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.http.ContentType;
public class Put {
	@Test
	public void test() {
//Rohan
		baseURI="https://www.shoppersstack.com/shopping";
		JSONObject jo=new JSONObject();
		jo.put("email", "rohanimds@gmail.com");
		jo.put("password", "Qwerty1@");
		jo.put("role", "ADMIN");
		

		given().body(jo).contentType(ContentType.JSON)
		.when().post("/users/login")
		.then().assertThat().statusCode(200).log().all();

		//	File f=new File("./src/main/resources/swagger.json");
		JSONObject go=new JSONObject();

			go.put("city", "Banglore");
			go.put("country", "India");
			go.put("createdDateTime", "sdgwg");
			go.put("dob", "7/8/96");
			go.put("email", "roha3586n@gmail.com");
			go.put("firstName", "rohan");
			go.put("gender", "male");
			go.put("imageId", "ksdyf");
			go.put("jwtToken", "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJyb2hhbmltZHNAZ21haWwuY29tIEFETUlOIiwiZXhwIjoxNjgxOTMzNzQ0LCJpYXQiOjE2ODE4OTc3NDR9.LHGMKZhgFV5syhuPwLH5BQltdY6ufeTCl7OZDfiyx3g");
			go.put("lastName", "imdapur");
			go.put("password", "Qwerty1@");
			go.put("phone", "7897897897");
			go.put("role", "ADMIN");
			go.put("state", "Karnataka");
			go.put("status", "ACTIVE");
			go.put("token", null);
			go.put("zoneId", "ALPHA");

		
		given().body(go).contentType(ContentType.JSON)
		.when().put("/admin")
		.then()
		.log().all();
	}
}
