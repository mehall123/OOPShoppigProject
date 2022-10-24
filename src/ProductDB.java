//Micheal O Sullivan R00102982 SD2

import java.util.HashMap;

public class ProductDB {

	private static HashMap<String ,String> products = new HashMap<String ,String>();
	
	public void add(Product product) {
		products.put(product.getProductID(),product.name);
	}

	public void remove(String ID) {
		products.remove(ID);
	}
	
	public void find(String ID) {	
    System.out.println(products.get(ID)); 		
	}
	
	public void showAll() {
		System.out.println(products);
	}
}