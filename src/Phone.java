//Micheal O Sullivan R00102982 SD2

public class Phone extends Product {

	private String make; 
	private String model;
	private int storage;

	public Phone(String name, double price, String description, String make, String model,int storage) {
		super(name, price, description);
		this.make = make;
		this.model = model;
		this.storage = storage;
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

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public void print(){
		System.out.println(name);
	}
}
