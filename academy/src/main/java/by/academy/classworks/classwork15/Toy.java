package by.academy.classworks.classwork15;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//Создайте HashMap, содержащий пары значений  - 
//имя игрушки и объект игрушки (класс Toy).
//Перебрать и распечатать пары значений - entrySet().
//Перебрать и распечатать набор из имен продуктов  - keySet().
//Перебрать и распечатать значения продуктов - values().
//Для каждого перебора создать свой метод.
public class Toy {
	String name;
	String color;
	double weight;

	public Toy() {
		super();
	}

	public Toy(String name, String color, double weight) {
		this.color = color;
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void key(Map<String, Toy> toys) {
		for (String key : toys.keySet()) {
			System.out.println("KEY:" + key);
		}
	}

	public void values(Map<String, Toy> toys) {
		for (Toy key : toys.values()) {
			System.out.println("NAME:" + key.getName());
		}
	}

	public void entry(Map<String, Toy> toys) {
		for (Entry<String, Toy> entry : toys.entrySet()) {
			System.out.println("KEY+VALUE:" + entry.toString());

		}
	}

	@Override
	public String toString() {
		return "Toy [name=" + name + ", color=" + color + ", weight=" + weight + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Toy other = (Toy) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}

	public static void main(String[] args) {
		Map<String, Toy> toys = new HashMap<String, Toy>();
		toys.put("one", new Toy("Bear", "Red", 10.2));
		toys.put("two", new Toy("Car", "Green", 11.2));
		toys.put("three", new Toy("Doll", "Black", 12.2));
		toys.put("four", new Toy("Sword", "White", 13.2));
		Toy toys1 = new Toy();
		toys1.key(toys);
		toys1.values(toys);
		toys1.entry(toys);

	}

}
