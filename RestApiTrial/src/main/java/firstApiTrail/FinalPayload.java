package firstApiTrail;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FinalPayload {

	public static void main(String[] args) throws JsonProcessingException {
		Referrel_pojoClass rp=new Referrel_pojoClass(27,20);
		ObjectMapper objmap=new ObjectMapper();
		String ReferrelPayload=objmap.writerWithDefaultPrettyPrinter().writeValueAsString(rp);
		System.out.println(ReferrelPayload);

		Product_detailsPojoClass pd=new Product_detailsPojoClass("household",6000,15);
		String productPayload=objmap.writerWithDefaultPrettyPrinter().writeValueAsString(pd);
		System.out.println(productPayload);
	}
	

}
