package javacampders4ode3Game.Entities;

public class Product {
	private int productid;
	private String productName;
	private int productPrice;
	
	public Product() {
		
	}
	
	public Product(int productid, String productName, int productPrice) {
		super();
		this.productid = productid;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
	
	

}
