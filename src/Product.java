//Micheal O Sullivan R00102982 SD2

import java.util.UUID;

public class Product {

	private String ProductID = UUID.randomUUID().toString();
	private double price;
	protected String name;
    private String description;

	public Product(String name, double price,  String description) {
		this.price = price;
		this.name = name;
		this.description = description;
	}

	public String getProductID() {
		return ProductID;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
		}	
	
	public void print() {
		
	}	
}