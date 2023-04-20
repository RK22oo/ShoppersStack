package shoppers;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateBankAccount {

	@Test
	public void createBankAccountTest() {
		
     baseURI = "https://www.shoppersstack.com/shopping/";

		given().queryParam("bankName", "IDHC")
		.queryParam("email", "amr@gmail.com")
		.queryParam("shopperId", 20262).contentType(ContentType.JSON)

		.when().post("/bankaccounts")
		
		.then().log().all();
	}
}
