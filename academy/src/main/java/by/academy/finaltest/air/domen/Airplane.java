package by.academy.finaltest.air.domen;
import java.util.Objects;

public abstract class Airplane {
	private String model;
	private String brand;
	private double rangeOfFlight;
	private double fuelConsumption;

	public Airplane() {
		super();
	}

	public Airplane(String model, String brand, double rangeOfFlight, double fuelConsumption) {
		super();
		this.model = model;
		this.brand = brand;
		this.rangeOfFlight = rangeOfFlight;
		this.fuelConsumption = fuelConsumption;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}


	public double getRangeOfFlight() {
		return rangeOfFlight;
	}

	public void setRangeOfFlight(double rangeOfFlight) {
		this.rangeOfFlight = rangeOfFlight;
	}


	public double getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}
	abstract public double takeoffWeight();
	abstract public int takePlaces();

	@Override
	public int hashCode() {
		return Objects.hash(brand, fuelConsumption, model, rangeOfFlight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airplane other = (Airplane) obj;
		return Objects.equals(brand, other.brand)
				&& Double.doubleToLongBits(fuelConsumption) == Double.doubleToLongBits(other.fuelConsumption)
				&& Objects.equals(model, other.model)
				&& Double.doubleToLongBits(rangeOfFlight) == Double.doubleToLongBits(other.rangeOfFlight)
				;
	}

	@Override
	public String toString() {
		return "Airplane [model=" + model + ", brand=" + brand  + ", rangeOfFlight="
				+ rangeOfFlight + ", fuelConsumption=" + fuelConsumption + "]";
	}

	
}
