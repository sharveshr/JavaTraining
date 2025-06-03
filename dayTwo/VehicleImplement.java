package com.Training.dayTwo;

public class VehicleImplement {

	public static void main(String[] args) {
		Activa activaScooter = new Activa();
		System.out.println("!!!!!HONDA ACTIVA!!!!!!");
		activaScooter.makeSound();
		System.out.println(activaScooter.fuelType());
		activaScooter.colour();
		activaScooter.brandName();
		System.out.println(activaScooter.engineCapacity());
		System.out.println(activaScooter.manufacturerDetails());
		

	}

}
