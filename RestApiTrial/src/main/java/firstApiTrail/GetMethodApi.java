package firstApiTrail;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
public class GetMethodApi {

	public static void main(String[] args) {
		String url="https://reqres.in/";
		RestAssured.baseURI=url;
		String resources="/api/users/2";//we always put the resource into http method
		given().log().all().   // this log().all() is used to print response in api
		when().get(resources).then().log().all();

	}

}
//given : input->token,payload,parameters,headers
//when : action perform on input->http method
//then : verify the result which we perform on input.