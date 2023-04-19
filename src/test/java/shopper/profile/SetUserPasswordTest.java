package shopper.profile;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
/**
 * 
 * @author Rakesh KG
 *
 */
public class SetUserPasswordTest {

	@Test
	public void set() {
		baseURI = "https://www.shoppersstack.com/shopping";

		given().auth().oauth2(
				"eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJraXNob3JlbWFsbGFyYXB1MTFAZ21haWwuY29tIFNIT1BQRVIiLCJleHAiOjE2ODE5MjY3NTYsImlhdCI6MTY4MTg5MDc1Nn0.OBpxUbfmRd98Jiw-qPNxle_1mT_LW5177so-XEuCCfA")
				.header("password", "Mnbvc@22").queryParam("token", "Dupy42A8hDXrYSRizyHZ7PH62mu7iJ6bzQqN03MgPhS1A")
				// action
				.when().post("/users/verify-account")
				// validation
				.then().assertThat().log().all();

	}
}
