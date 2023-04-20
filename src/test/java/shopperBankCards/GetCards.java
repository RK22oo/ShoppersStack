package shopperBankCards;

import org.testng.annotations.Test;

import genericUtility.JavaUtility;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class GetCards {
	//Shopper Bank Cards Module
	@Test
	public void getCardsTest() {
		
		JavaUtility jUtil= new JavaUtility();
		
		baseURI = "https://www.shoppersstack.com/shopping";
		
		Response response = when().get("/banks");
		
		String bankName = response.jsonPath().get("data[1]");
		
		given().queryParam("bankName", bankName)
		.queryParam("cardType", "DEBIT")
		.queryParam("email", "amr"+jUtil.getRandomNumber(100)+"@gmail.com")
		.queryParam("name", "amr")
		.queryParam("shopperId", 20262)
		
		.when().get("/cards")
		
		.then().log().all();
	}
}
