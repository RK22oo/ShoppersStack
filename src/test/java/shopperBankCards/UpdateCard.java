package shopperBankCards;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class UpdateCard {
	
	//Shopper Bank Cards Module
	@Test
	public void updateCardTest() {

		baseURI = "https://www.shoppersstack.com/shopping";

		given().queryParam("amount", 400000d)
		.queryParam("cardNumber", "3014401191608049")

		.when().patch("/cards")

		.then().log().all();
	}

}
