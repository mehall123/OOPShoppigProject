//Micheal O Sullivan R00102982 SD2

public class TV extends Product {	
	 
	 private String make;
	 private String model; 
	 private boolean led = false;	
	 
	 public TV(String name, double price, String description, String make, String model, boolean led) {
		super(name, price, description);
		this.make = make;
		this.model = model;
		this.led = led;
		ProductDB DB = new ProductDB();
		DB.add(this);
	}
	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	 
	public String getMake() {
	    return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public boolean getLed() {
		return led;
	}

	public void setLed(boolean led) {
		this.led = led;
	}
		
	public void print() {
		System.out.println(name);
	}	 
}
