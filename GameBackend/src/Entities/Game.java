package Entities;

public class Game {
	private int id;
	private String name;
	private String type;
	private double price;
	
	public Game(int id, String name, String type, double price) {
		setId(id);
		setName(name);
		setType(type);
		setPrice(price);
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
