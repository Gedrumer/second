package by.academy.homework3;

public class Bread extends Product {
	private String type;

	public Bread() {
		super();
	}

	public Bread(String title, double price, double quantity, String type) {
		super(title, price, quantity);
		this.type = type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public double sum() {
		return price * quantity;
	}

	public double sumWithDiscount() {
		return sum() * discount();
	}

	@Override
	public double discount() {
		if (type.toLowerCase() == "grey") {
			return 0.87;
		} else {
			return 1;
		}

	}

}
