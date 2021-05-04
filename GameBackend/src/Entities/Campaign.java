package Entities;

public class Campaign {
	private int code;
	private String name;
	private double discountRate;
	
	public Campaign(int code, String name, double discountRate) {
		setCode(code);
		setName(name);
		setDiscountRate(discountRate);
	}

	public int getCode() {
		return this.code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiscountRate() {
		return this.discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
}
