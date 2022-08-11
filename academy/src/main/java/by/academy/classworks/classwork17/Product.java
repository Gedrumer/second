package by.academy.classworks.classwork17;

import java.io.Serializable;

public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	protected String title;
	protected transient double price;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(quantity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (Double.doubleToLongBits(quantity) != Double.doubleToLongBits(other.quantity))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product [title=" + title + ", price=" + price + ", quantity=" + quantity + "]";
	}

}
