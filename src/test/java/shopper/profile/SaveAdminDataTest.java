package shopper.profile;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class SaveAdminDataTest {

	@Test
	public void register() {

		baseURI = "https://www.shoppersstack.com/shopping";

		// int randomNumber = new Random().nextInt(1000);
		JSONObject jobj = new JSONObject();
		jobj.put("city", "bengaluru");
		jobj.put("country", "india");
		jobj.put("country", "india");
		jobj.put("email", "kishoremallarapu11@gmail.com");
		jobj.put("firstName", "Rakesh");
		jobj.put("gender", "MALE");
		jobj.put("lastName", "RKG");
		jobj.put("password", "Mnbvc@11");
		jobj.put("phone", 9945102670l);
		jobj.put("state", "KA");
		jobj.put("zoneId", "ALPHA");

		// pre condition
		given().body(jobj).contentType(ContentType.JSON)
				// action
				.when().post("/shoppers")
				// validation
				.then().assertThat().statusCode(201).log().all();
	}
}
