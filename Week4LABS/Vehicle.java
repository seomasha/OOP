package OOP.Week4LABS;

import java.util.Date;

public class Vehicle {
    private String color;
    private int numOfWheels;
    private Date dateOfManufacture;

    public Vehicle(String color, int numOfWheels, Date dateOfManufacture) {
        System.out.println("Vehicle constructed is called.");
        this.color = color;
        this.numOfWheels = numOfWheels;
        this.dateOfManufacture = dateOfManufacture;
    }

    public Vehicle(String color) {
        System.out.println("Vehicle constructor called only color.");
        this.numOfWheels = 4;
        this.dateOfManufacture = new Date();
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public Date getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(Date dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public void generateSound() {
        System.out.println("BRMMMM");
    }
}
