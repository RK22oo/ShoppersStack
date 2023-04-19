package shopper.profile;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
import io.restassured.http.ContentType;
/**
 * 
 * @author Rakesh KG
 *
 */
public class FindShopperByShopperIdTest {

	@Test
	public void getShopper() {
		baseURI = "https://www.shoppersstack.com/shopping";

		given().auth().oauth2(
				"eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJraXNob3JlbWFsbGFyYXB1MTFAZ21haWwuY29tIFNIT1BQRVIiLCJleHAiOjE2ODE5MjY3NTYsImlhdCI6MTY4MTg5MDc1Nn0.OBpxUbfmRd98Jiw-qPNxle_1mT_LW5177so-XEuCCfA")
				.pathParam("shopperId", 20281) // 20264 20265 20258
				// action
				.when().get("/shoppers/{shopperId}")
				// validation
				.then().assertThat().log().all();

	}
}
