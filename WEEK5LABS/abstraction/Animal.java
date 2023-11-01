package OOP.WEEK5LABS.abstraction;

abstract class Animal { //can be instantiated

    private int legs;
    public String sayHello() {
        return "Hello";
    }

    public Animal(int legs) {
        this.legs = legs;
    }

    public abstract String saySomething(); //acts as an interface
}

class Main {
    public static void main(String[] args) {

    }

}