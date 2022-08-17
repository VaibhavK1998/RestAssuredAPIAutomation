package firstApiTrail;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;
public class HttpMethod {

	 String url="https://reqres.in/";
	
	
	@Test(priority=5)
	public void getUsers() {
		System.out.println("************Get method*********");
		RestAssured.baseURI=url;
		String endpoint="/api/users/2";
		given().get(endpoint).
		then().statusCode(200).body("data.last_name[0]",equalTo("W"));
		System.out.println("not running method");
		//log().all();
		}
	@Test(priority=2)
	public void postCreateUser() {// this method use to create new user
		System.out.println("************post method**************");
		RestAssured.baseURI=url;
		String endpoint="/api/users";
		String payload="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		given().body(payload).when().post(endpoint).
		then().log().all();
		
	}
	@Test(priority=3)
	public void putUpdateUser() {// this method use to update user info completely
		System.out.println("************put method**************");
		RestAssured.baseURI=url;
		String endpoint="/api/users/2";
		String payload="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}";
		given().body(payload).when().put(endpoint).
		then().log().all();
	}
	@Test(priority=4)
	public void patchUpdateUser() {// this method use to update user info partially we use patch method 
		System.out.println("************patch method**************");
		RestAssured.baseURI=url;
		String endpoint="/api/users/2";
		String payload="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}";
		given().body(payload).when().patch(endpoint).
		then().log().all();
	}
	
	@Test(priority=5)
	public void deleteMethod() {//this method use to delete user
		System.out.println("************delete method**************");
		RestAssured.baseURI=url;
		String endpoint="/api/users/2";
		String payload="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}";
		given().body(payload).when().delete(endpoint).
		then().log().all();
	}
}

//note below line
//we always send payload with/after given()
//we always send http method after when()
//we always pass resource in http method









