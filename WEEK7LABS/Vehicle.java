package OOP.WEEK7LABS;

class Vehicle { //finals can't be extended
    private final String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String sayHello() { //final methods can't be overriden
        return "Hello";
    }
}

class Motorbike extends Vehicle {
    public Motorbike(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Fikro aka Jim Carrey.";
    }
}

class Car extends Vehicle{
    public Car(String name) {
        super(name);
    }
}

class RunMyFinals{
    public static void main(String[] args) {
        Car c = new Car("Benga");
        System.out.println(c.getName());

        final Car myCar;
        myCar = new Car("Mecka");
        System.out.println(myCar.getName());
    }
}