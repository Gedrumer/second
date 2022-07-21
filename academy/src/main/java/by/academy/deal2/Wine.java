package by.academy.homework3;

public class Wine extends Product {
	private int age;
	private String color;

	public Wine() {
		super();
	}

	public Wine(String title, double price, double quantity, String color, int age) {
		super(title, price, quantity);
		this.color = color;
		this.age = age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public double sum() {
		return price * quantity;
	}

	public double sumWithDiscount() {
		return sum() * discount();
	}

	@Override
	public double discount() {
		if (age > 5) {
			return 0.82;
		} else {
			return 1;
		}
	}

}