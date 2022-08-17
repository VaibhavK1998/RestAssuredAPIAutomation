package firstApiTrail;

public class PayloadC1 {

	CustomerPojoClass customer;
	Product_detailsPojoClass product;
	Referrel_pojoClass referrels;
	
	public PayloadC1(CustomerPojoClass customer,Product_detailsPojoClass product,
			Referrel_pojoClass referrels)
	{
		this.customer = customer;
		this.product = product;
		this.referrels = referrels;
	}
	
	public CustomerPojoClass getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerPojoClass customer) {
		this.customer = customer;
	}
	public Product_detailsPojoClass getProduct() {
		return product;
	}
	public void setProduct(Product_detailsPojoClass product) {
		this.product = product;
	}
	public Referrel_pojoClass getReferrels() {
		return referrels;
	}
	public void setReferrels(Referrel_pojoClass referrels) {
		this.referrels = referrels;
	}
	
}
