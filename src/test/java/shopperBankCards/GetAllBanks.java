package shopperBankCards;

import static io.restassured.RestAssured.baseURI;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
//Amruth
//Bank Action Module

public class GetAllBanks {
	@Test
	public void getAllBanksTest() {

		baseURI = "https://www.shoppersstack.com/shopping/";

		when().get("/banks")

		.then().log().all();

	}
}
