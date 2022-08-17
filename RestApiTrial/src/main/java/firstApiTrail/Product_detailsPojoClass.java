package firstApiTrail;

public class Product_detailsPojoClass {
	String product;
	int  price ;
	int  discount;
	//int id ;
	
	
	public Product_detailsPojoClass(String product,int price,int discount) {
		this.product = product;
		this.price = price;
		this.discount = discount;
		//this.id = id;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
	
}
