package shopperBankCards;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

public class PostCardsTranscations {
	
	//Shopper Bank Cards Module
	@Test
	public void postCardsTranscationsTest() {
		
		File file= new File("D:\\Eclipse Workspace\\Selenium Workspaces\\SDET Workspace\\swagger\\src\\test\\resources\\shopper.json");

		baseURI = "https://www.shoppersstack.com/shopping";

		given().queryParam("amount", 150000d).body(file)

		.when().post("/cards/transaction")

		.then().log().all();	
	}
}
