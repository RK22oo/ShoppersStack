package shopperBankCards;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

public class PostVerifyCards {
	
	//Shopper Bank Cards Module
	@Test
	public void verifyCardsTest() {
		
		File file= new File("D:\\Eclipse Workspace\\Selenium Workspaces\\SDET Workspace\\swagger\\src\\test\\resources\\shopper.json");

		baseURI = "https://www.shoppersstack.com/shopping";

		given().body(file)

		.when().post("/cards/verify")

		.then().log().all();
	}
}
