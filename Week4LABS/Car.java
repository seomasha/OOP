package OOP.Week4LABS;

import java.util.Date;

public class Car extends Vehicle{
    private String motorType;

    public Car(String color, int numOfWheels, Date dateOfManufacture, String motorType) {
        super(color, numOfWheels, dateOfManufacture);
        this.motorType = motorType;
        System.out.println("Car constructor is called.");
    }

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    @Override
    public void generateSound() {
        System.out.println("AN ANNNNNNNNNNNN");
    }
}