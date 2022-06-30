package by.academy.deal;

public class Product {
	// methods: discount- возвращаем double
	String product;
	int price;
	int quantity;
	int isTax;

	public void setProducts(String product) {
		this.product = product;
	}

	public String getProducts() {
		return product;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setIsTax(int isTax) {
		this.isTax = isTax;
	}

	public int getIsTax() {
		return isTax;
	}

	public double discount(double n1, double n2) {
		n1 = 1;
		return n1;

	}

}
