package by.academy.finaltest.air.service;

import by.academy.finaltest.air.domen.Airplane;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Airline {
	private String airlineName;
	private List<Airplane> listAirplane;

	public Airline() {
		super();

	}

	public Airline(String airlineName, List<Airplane> listAirplane) {
		super();
		this.airlineName = airlineName;
		this.listAirplane = listAirplane;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public List<Airplane> getListAirplane() {
		return listAirplane;
	}

	public void setListAirplane(List<Airplane> listAirplane) {
		this.listAirplane = listAirplane;
	}

	public double totalCapacity() {
		double totalCapacity = 0;
		for (Airplane plane : listAirplane) {
			totalCapacity += plane.takeoffWeight();
		}
		return totalCapacity;

	}
	public int totalPlaces() {
		int totalPlaces=0;
		for (Airplane plane : listAirplane) {
			totalPlaces += plane.takePlaces();
		}
		return totalPlaces;
	}

	public ArrayList<Airplane> getPlaneByFuelConsumption(double fuelMin, double fuelMax) {
		ArrayList<Airplane> filteredAirline = new ArrayList<>();
		for (Airplane plane : listAirplane) {
			double currentFuel = plane.getFuelConsumption();
			if (currentFuel >= fuelMin && currentFuel <= fuelMax) {
				filteredAirline.add(plane);
			}
		}
		return filteredAirline;
	}

	public void sortPlane() {
		listAirplane.sort(Comparator.comparingDouble(Airplane::getRangeOfFlight));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airlineName == null) ? 0 : airlineName.hashCode());
		result = prime * result + ((listAirplane == null) ? 0 : listAirplane.hashCode());
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
		Airline other = (Airline) obj;
		if (airlineName == null) {
			if (other.airlineName != null)
				return false;
		} else if (!airlineName.equals(other.airlineName))
			return false;
		if (listAirplane == null) {
			if (other.listAirplane != null)
				return false;
		} else if (!listAirplane.equals(other.listAirplane))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Airline [airlineName=" + airlineName + ", listAirplane=" + listAirplane + "]";
	}

}
