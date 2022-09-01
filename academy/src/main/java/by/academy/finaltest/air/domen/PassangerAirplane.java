package by.academy.finaltest.air.domen;

public class PassangerAirplane extends Airplane {
	private int placesForPassengers;
	private double loadCapacity;

	public PassangerAirplane() {
		super();
	}

	public PassangerAirplane(String model, String brand, double rangeOfFlight, double fuelConsumption,
			int placesForPassengers, double loadCapacity) {
		super(model, brand, rangeOfFlight, fuelConsumption);
		this.placesForPassengers = placesForPassengers;
		this.loadCapacity = loadCapacity;
	}

	public int getPlacesForPassengers() {
		return placesForPassengers;
	}

	public void setPlacesForPassengers(int placesForPassengers) {
		this.placesForPassengers = placesForPassengers;
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

	public int takePlaces() {
		return placesForPassengers;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(loadCapacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + placesForPassengers;
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
		PassangerAirplane other = (PassangerAirplane) obj;
		if (Double.doubleToLongBits(loadCapacity) != Double.doubleToLongBits(other.loadCapacity))
			return false;
		if (placesForPassengers != other.placesForPassengers)
			return false;
		return true;
	}
	

}
