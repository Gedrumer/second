package by.academy.classworks.classwork10;

public abstract class Product {
	
	protected String title;
	protected double price;
	protected double quantity;

	public Product() {
		super();
	}

	public Product(String title, double price, double quantity) {
		super();
		this.title = title;
		this.price = price;
		this.quantity = quantity;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getQuantity() {
		return quantity;
	}

	public abstract double discount();

	public double getProductPrice() {
		return price * quantity * discount();
	}
	public void inputProduct() {
		System.out.println("Seller enter products:");
			
	}
	public double calcFinalPrice() {
		return price*discount();
	}
	


}
