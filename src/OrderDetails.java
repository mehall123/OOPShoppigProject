//Micheal O Sullivan R00102982 SD2

public class OrderDetails {
	
	private String product;
	private int quantity;
	
	public OrderDetails(Product product, int quantity) {
		this.product = product.getProductID();
		this.quantity = quantity;
	}

	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
