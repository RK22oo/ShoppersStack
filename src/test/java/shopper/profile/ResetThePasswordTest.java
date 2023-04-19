package shopper.profile;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
/**
 * 
 * @author Rakesh KG
 *
 */
public class ResetThePasswordTest {

	@Test
	public void reset() {
		baseURI = "https://www.shoppersstack.com/shopping";

		given().auth().oauth2(
				"eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJraXNob3JlbWFsbGFyYXB1MTFAZ21haWwuY29tIFNIT1BQRVIiLCJleHAiOjE2ODE5MjY3NTYsImlhdCI6MTY4MTg5MDc1Nn0.OBpxUbfmRd98Jiw-qPNxle_1mT_LW5177so-XEuCCfA")
				.header("token", "RHrawzy4LA77NOPXS53Q6NA053eLQcVOo6V0kwHjR2h81").body("Mnbvc@22".getBytes())
				
				// action
				.when().post("/users/reset-password")
				// validation
				.then().assertThat().log().all();

	}
}
