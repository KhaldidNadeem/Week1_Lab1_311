package org.example;

public class Car extends Vehicle {

    public String brand;

    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numberOfWheels, color, engineSize, brand);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void honk(){
        System.out.println("Honk, honk!");
    }

    public void displayInfo(){
        System.out.println("Car Brand: " + brand);
    }

    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle(4, "White", 2.2f, "Electric");
        System.out.println("-----------My Vehicle Info-----------");
        myVehicle.displayInfo();

        Car myCar = new Car(4,"Red", 1.4f, "Gas", "Toyota");
        System.out.println("----------My Car Info-----------");
        myCar.displayInfo();
    }
}
