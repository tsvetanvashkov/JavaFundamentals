package objects_and_classes.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double averageCarHP = 0.0;
		double averageTruckHP = 0.0;
		int sumCarHP = 0;
		int sumTrucHP = 0;
		int numberOfCars = 0;
		int numberOfTrucks = 0;
		
		List<Vehicle> vehicleList = new ArrayList<VehicleCatalogue.Vehicle>();
		String input = scan.nextLine();
		while (!input.equals("End")) {
			String[] inputArray = input.split(" ");
			String typeOfVehicle = inputArray[0];
			String model = inputArray[1];
			String color = inputArray[2];
			int horepower = Integer.parseInt(inputArray[3]);
			typeOfVehicle = typeOfVehicle.substring(0, 1).toUpperCase() + typeOfVehicle.substring(1);
			
			switch (typeOfVehicle) {
			case "Car":
				numberOfCars++;
				sumCarHP += horepower;
				break;
			case "Truck":
				numberOfTrucks++;
				sumTrucHP += horepower;
				break;
			}
			
			Vehicle vehicleObj = new Vehicle(typeOfVehicle, model, color, horepower);
			vehicleList.add(vehicleObj);
			
			input = scan.nextLine();
		}
		String secondInput = scan.nextLine();
		while (!secondInput.equals("Close the Catalogue")) {
			for (Vehicle vehicle : vehicleList) {
				if (secondInput.equals(vehicle.model)) {
					System.out.print(vehicle.toString());
				}
			}
			secondInput = scan.nextLine();
		}
		scan.close();
		
		if (numberOfCars != 0) {
			averageCarHP = (double)sumCarHP / numberOfCars;
		}
		if (numberOfTrucks != 0) {
			averageTruckHP = (double)sumTrucHP / numberOfTrucks;
		}
		
		
		System.out.printf("Cars have average horsepower of: %.2f.\n", averageCarHP);
		System.out.printf("Trucks have average horsepower of: %.2f.\n", averageTruckHP);

	}
	
	static class Vehicle{
		String typeOfVehicle;
		String model;
		String color;
		int horepower;
		
		public Vehicle(String typeOfVehicle, String model, String color, int horepower) {
			super();
			this.typeOfVehicle = typeOfVehicle;
			this.model = model;
			this.color = color;
			this.horepower = horepower;
		}
		
		public String toString() {
			return String.format("Type: %s\n"
					+ "Model: %s\n"
					+ "Color: %s\n"
					+ "Horsepower: %d\n"
					, this.typeOfVehicle, this.model, this.color, this.horepower);
		}

	}

}
