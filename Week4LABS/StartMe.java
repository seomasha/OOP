package OOP.Week4LABS;

import java.util.Date;

public class StartMe {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle("Black", 4);
        Car car = new Car("Black", 4, new Date(), "Diesel");

        bike.generateSound();
        car.generateSound();

        System.out.println(bike.toString());
    }
}
