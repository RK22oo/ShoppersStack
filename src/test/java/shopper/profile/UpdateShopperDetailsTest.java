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
public class UpdateShopperDetailsTest {

	@Test
	public void updateShopper() {

		baseURI = "https://www.shoppersstack.com/shopping";

		JSONObject jobj = new JSONObject();
		jobj.put("city", "bengaluru");
		jobj.put("country", "india");
		jobj.put("email", "kishoremallarapu11@gmail.com");
		jobj.put("firstName", "RakeshK");
		jobj.put("gender", "MALE");
		jobj.put("lastName", "RKG");
		jobj.put("password", "Mnbvc@11");
		jobj.put("phone", 9945102670l);
		jobj.put("state", "KA");
		jobj.put("zoneId", "ALPHA");

		// pre condition
		given().auth().oauth2(
				"eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJraXNob3JlbWFsbGFyYXB1MTFAZ21haWwuY29tIFNIT1BQRVIiLCJleHAiOjE2ODE5MjY3NTYsImlhdCI6MTY4MTg5MDc1Nn0.OBpxUbfmRd98Jiw-qPNxle_1mT_LW5177so-XEuCCfA")
				.body(jobj).contentType(ContentType.JSON).pathParam("shopperId", 20281)
				// action
				.when().patch("/shoppers/{shopperId}")
				// validation
				.then().assertThat().statusCode(200).log().all();
	}
}
