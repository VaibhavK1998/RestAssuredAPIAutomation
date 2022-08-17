package firstApiTrail;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class GetTc1 {

	@Test
	public void getTc_1() {
		Response response=RestAssured.get("https://reqres.in/api/users?page=2");
		//Response response=get("https://reqres.in/api/users?page=2");//above line we also can write like this
		System.out.println("response body : "+response.getBody().asString());
		System.out.println("response in String : "+response.asString());
		System.out.println("response code : "+response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	@Test
public void getTc_2() {
	given().
	get("https://reqres.in/api/users?page=2").
	then().statusCode(200).body("data.id[0]",equalTo(7))
	.body("data.last_name[0]", equalTo("Lawson"))
	.body("data.first_name",hasItems("Michael","Lindsay","Tobias","Byron","George"));


	}
}
