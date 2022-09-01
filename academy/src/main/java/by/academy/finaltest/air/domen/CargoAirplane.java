package by.academy.finaltest.air.domen;
public class CargoAirplane extends Airplane {
	private double loadCapacity;

	public CargoAirplane() {
		super();
	}

	public CargoAirplane(String model, String brand, double rangeOfFlight,
			double fuelConsumption,double loadCapacity) {
		super(model, brand, rangeOfFlight, fuelConsumption);
		this.loadCapacity=loadCapacity;
	}

	public double getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(double loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	@Override
	public double takeoffWeight() {
		return loadCapacity;
		
	}

	@Override
	public int takePlaces() {
		return 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(loadCapacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CargoAirplane other = (CargoAirplane) obj;
		if (Double.doubleToLongBits(loadCapacity) != Double.doubleToLongBits(other.loadCapacity))
			return false;
		return true;
	}


	


}
