package javatraining.test1;

public class Product {
	private int productId;
	private double price;
	
	Product(int productId, double price){
		this.productId =productId;
		this.price=price;
	}
	
	public int getProductId(){
		return productId;
	}
	
	public double getPrice(){
		return price;
	}
	
	public void applyDiscount(double percentage) {
		
	}
}
