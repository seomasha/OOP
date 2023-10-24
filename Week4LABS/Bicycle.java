package OOP.Week4LABS;

import java.util.Date;

class Bicycle extends Vehicle{
    private int numOfPedals;

    public Bicycle(String color, int numOfPedals) {
        super(color);
        this.numOfPedals = numOfPedals;
        System.out.println("Bicycle constructor called.");
    }

    public int getNumOfPedals() {
        return numOfPedals;
    }

    public void setNumOfPedals(int numOfPedals) {
        this.numOfPedals = numOfPedals;
    }

    @Override
    public void generateSound() {
        System.out.println("FIIIII");
    }

    @Override
    public String toString() {
        return String.valueOf(this.numOfPedals);
    }
}
