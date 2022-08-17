package firstApiTrail;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import org.json.simple.JSONObject;

import static org.hamcrest.Matchers.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
public class RealApiMethodWorkExa1 {
	
	

//@Test
	public void getProductDetails() {
	
	baseURI="http://localhost:3000";
		given().
		get("/product_Details")
		.then().statusCode(200)
		.log().all();
	}

@Test
public void CreateNewProduct() throws JsonProcessingException {
	baseURI="http://localhost:3000/";
	JSONObject request= new JSONObject();
	
//	request.put("product", "meal");
//	request.put("price", 45000);
//	request.put("discount", 9);
//	given().contentType(ContentType.JSON)
//	.accept(ContentType.JSON)
//	.body(request.toJSONString())
//	.when().post("/product_Details")
//	.then().statusCode(201).log().all();
	ObjectMapper objmap=new ObjectMapper();
	Product_detailsPojoClass pd=new Product_detailsPojoClass("household",25000,20);
	String productPayload=objmap.writerWithDefaultPrettyPrinter().writeValueAsString(pd);
	
	given().contentType(ContentType.JSON)
	.accept(ContentType.JSON)
	.body(productPayload)
	.when().post("/product_Details")
	.then().statusCode(201).log().all();
	
	
}
//@Test
public void updateCustomer() {//put request
	baseURI="http://localhost:3000/";
	JSONObject payload= new JSONObject();
	payload.put("name","abhijit dhakade" ); 
	payload.put( "age"  ,27); 
	payload.put("gender" ,"male" ); 
	payload.put("profession" ,"collector" ); 
	payload.put( "Annual_income" ,999000); 

	String endpoint="/customer/5";
	
	given().contentType(ContentType.JSON)
	.accept(ContentType.JSON).body(payload.toJSONString())
	.when().put(endpoint).then().log().all();

}


}
