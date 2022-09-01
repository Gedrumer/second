package by.academy.finaltest.air.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import by.academy.finaltest.air.domen.Airplane;
import by.academy.finaltest.air.domen.CargoAirplane;
import by.academy.finaltest.air.domen.PassangerAirplane;
import by.academy.finaltest.air.service.Airline;

public class Main {
	public static void main(String[] args) {
		PassangerAirplane airbus = new PassangerAirplane("Airbus", "A319neo", 7_750, 1_830, 144, 13_200);
		PassangerAirplane boeing = new PassangerAirplane("Boeing", "777-8", 16_000, 6_100, 365, 15_660);
		CargoAirplane mcDonnellDouglas = new CargoAirplane("McDonnell Douglas", "MD-11", 20_000, 15_000, 20_000);
		CargoAirplane airbus2 = new CargoAirplane("Airbus", "A330", 19_000, 14_000, 17_000);
		List<Airplane> listAirplane = new ArrayList<Airplane>();
		listAirplane.add(airbus);
		listAirplane.add(boeing);
		listAirplane.add(mcDonnellDouglas);
		listAirplane.add(airbus2);
		Airline airline = new Airline("AIRLINE.BY", listAirplane);
		System.out.println("Passangers places:" + airline.totalPlaces());
		System.out.println("Toatal capacity:" + airline.totalCapacity());
		airline.sortPlane();
		System.out.println("Sort by range of flight:\n" + listAirplane.toString());
		System.out.println("Aircraft corresponding to the given range of fuel consumption parameters:\n"
				+ airline.getPlaneByFuelConsumption(4_000, 15_000));

		ArrayList<Airplane> air = (ArrayList<Airplane>) listAirplane.stream()
				.filter(x -> x.getFuelConsumption() > 7_000).collect(Collectors.toList());
		System.out.println(air);
	}
}
