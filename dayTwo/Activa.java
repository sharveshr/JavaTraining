package com.Training.dayTwo;

public class Activa extends HondaMotors {
	
	public Activa() {
		System.out.println("!!!!!HONDA ACTIVA!!!!!!");
		makeSound();
		System.out.println(fuelType());
		colour();
		brandName();
		System.out.println(engineCapacity());
		System.out.println(manufacturerDetails());
	}

	@Override
	public void makeSound() {
		System.out.println("Grrrrrrrrrrr");
		
	}

	@Override
	public int engineCapacity() {
		return 125;
	}

	@Override
	public String fuelType() {
		return "Petrol";
	}

	@Override
	public void price() {
		System.out.println("Rs.80000");
		
	}

	@Override
	public void mileage() {
		System.out.println("30.5");
		
	}

	@Override
	public void vehicleType() {
		System.out.println("Scooter");
		
	}

	@Override
	public void brandName() {
		System.out.println("Honda Activa");
		
	}

	@Override
	public void colour() {
		System.out.println("Silver");
		
	}

	@Override
	public int speed() {
		// TODO Auto-generated method stub
		return 120;
	}

	@Override
	public int numberOfWheels() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int numberOfCylinders() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public float maxSpeed() {
		// TODO Auto-generated method stub
		return 80.5f;
	}
	
}
