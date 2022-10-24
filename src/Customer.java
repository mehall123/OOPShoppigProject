//Micheal O Sullivan R00102982 SD2

import java.util.ArrayList;

public class Customer {
	
	private String name;
	private String address;
	private static ArrayList<Order> Orders = new ArrayList<Order>();

	public Customer(String name, String address) {
		this.name = name;
		this.address = address;
	}	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void add(Order order) {
		Orders.add(order);
	}
	
	public void remove(int i) {
		Orders.remove(i);
	}
	
	public void get(int i) {
		Orders.get(i);
	}
	
	public void showAll() {
		System.out.println(name + "'s orders");
		for(int i =0; i < Orders.size(); i++) {
			System.out.println(Orders.get(i));
		}	
	}
}
