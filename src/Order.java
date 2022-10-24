//Micheal O Sullivan R00102982 SD2

import java.util.ArrayList;

public class Order {
	
	private static ArrayList<OrderDetails> orderDetails = new ArrayList<OrderDetails>();
	
	Order(OrderDetails details){
		orderDetails.add(details);	
	}
	
	public void add(OrderDetails details){
		orderDetails.add(details);
	}
	
	public void remove(int i) {
		orderDetails.remove(i);
	}
	
	public void find(int i) {	
	    orderDetails.get(i); 		
		}
	
    public void showAll() {
    	for(int i =0; i< orderDetails.size(); i++) {
		System.out.println(orderDetails.get(i).getProduct() + ", " + orderDetails.get(i).getQuantity());
    	}
	}
}
