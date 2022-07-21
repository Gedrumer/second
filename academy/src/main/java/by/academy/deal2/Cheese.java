package by.academy.homework3;

public class Cheese extends Product {
	private double richness;

	public Cheese() {
		super();
	}

	public Cheese(String title, double price, double quantity, double richness) {
		super(title, price, quantity);
		this.richness = richness;
	}

	public void setRichness(double richness) {
		this.richness = richness;
	}

	public double getRichness() {
		return richness;
	}

	public double sum() {
		return price * quantity;
	}

	public double sumWithDiscount() {
		return sum() * discount();
	}

	@Override
	public double discount() {
		if (richness > 30) {
			return 0.76;
		} else {
			return 1;
		}
	}

}
