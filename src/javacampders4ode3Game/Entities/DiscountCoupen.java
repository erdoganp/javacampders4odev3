package javacampders4ode3Game.Entities;

public class DiscountCoupen {
	private int discountid;
	private String discountName;
	private double discount;
	
	public DiscountCoupen() {
		
	}
	
	public DiscountCoupen(int discountid, String discountName, double discount) {
		super();
		this.discountid = discountid;
		this.discountName = discountName;
		this.discount = discount;
	}

	public int getDiscountid() {
		return discountid;
	}

	public void setDiscountid(int discountid) {
		this.discountid = discountid;
	}

	public String getDiscountName() {
		return discountName;
	}

	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
}
