//Micheal O Sullivan R00102982 SD2

public class Test {

	public static void main(String[] args) {

		ProductDB DB = new ProductDB();
		
		Phone p1 = new Phone("iPhone 12", 900, "latest apple flagship phonee", "Apple", "iPhone 12", 128);
		Phone p2 = new Phone("iphone 11", 650,"last gen apple flagship phone" , "Apple", "iPhone 11", 128);
		Phone p3 = new Phone("Samsung Galaxy S21", 750,"latest samsung flagship phone" , "Samsung", "Galaxy S21", 128);
		Phone p4 = new Phone("Nokia X10", 270,"Budget Nokia smart phone" , "Nokia", "Nokia X10", 64);
		
		TV T1 = new TV("LG 50UP77006LB", 500, "50 inch 4K UHD HDR Smart LED TV", "LG", "50UP77006LB", true);
		TV T2 = new TV("LG 32LM6370PLA", 360, "32 Inch LCD TV ", "LG", "32LM6370PLA", false);
		TV T3 = new TV("HISENSE 50AE7000FTUK", 410, "50-inch 4K UHD HDR Smart TV", "HISENSE", "50AE7000FTUK", true);
		
		OrderDetails od1 = new OrderDetails(p2, 5);
		OrderDetails od2 = new OrderDetails(T1, 2);
		OrderDetails od3 = new OrderDetails(T3, 1);
		
		Order o1 = new Order(od1);
		o1.add(od2);
		o1.add(od3);
		
		Customer Bill = new Customer("Bill", "Ballinciollig, Cork");
		Bill.add(o1);
		Bill.add(o1);
		Bill.add(o1);
		
		DB.showAll();
        Bill.showAll();
	}
}
