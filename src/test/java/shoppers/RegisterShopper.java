package shoppers;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class RegisterShopper {

	@Test
	public void registerShopperTest() {

		baseURI = "https://www.shoppersstack.com/shopping/";

		File file= new File("D:\\Eclipse Workspace\\Selenium Workspaces\\SDET Workspace\\swagger\\src\\test\\resources\\shopper.json");
		
		given().body(file).contentType(ContentType.JSON)

		.when().post("/shoppers")

		.then().log().all();


	}
}
