package shopper.profile;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
/**
 * 
 * @author Rakesh KG
 *
 */
public class GenaratesURLForForgotPasswordTest {

	@Test
	public void generate() {
		baseURI = "https://www.shoppersstack.com/shopping";

		given().auth().oauth2(
				"eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJraXNob3JlbWFsbGFyYXB1MTFAZ21haWwuY29tIFNIT1BQRVIiLCJleHAiOjE2ODE5MjY3NTYsImlhdCI6MTY4MTg5MDc1Nn0.OBpxUbfmRd98Jiw-qPNxle_1mT_LW5177so-XEuCCfA")
				.headers("email", "kishoremallarapu21@gmail.com","role","SHOPPER")
				// action
				.when().post("/users/forgot-password")
				// validation
				.then().assertThat().log().all();

	}
}
