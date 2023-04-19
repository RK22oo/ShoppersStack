package shopper.profile;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
/**
 * 
 * @author Rakesh KG
 *
 */
public class ShoppersLoginTest {

	@Test
	public void login() {
		baseURI = "https://www.shoppersstack.com/shopping";

		JSONObject jobj = new JSONObject();
		jobj.put("email", "kishoremallarapu11@gmail.com");
		jobj.put("password", "Mnbvc@11");
		jobj.put("role", "SHOPPER");

        //pre condition
		given().body(jobj).contentType(ContentType.JSON)
				// action
				.when().post("/users/login")
				// validation
				.then().assertThat().statusCode(200).log().all();

	}
}
