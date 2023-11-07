package OOP.WEEK6LABS.Lecture;

import java.util.HashMap;
import java.util.Map;

class AnimalPrinter<T extends Component> {

}

class ThingPrinter<SomethingOfTypeGeneric, V> {
    private SomethingOfTypeGeneric thingToPrint;
    private V anotherThingToPrint;

    public ThingPrinter(SomethingOfTypeGeneric thingToPrint, V anotherThingToPrint) {
        this.thingToPrint = thingToPrint;
        this.anotherThingToPrint = anotherThingToPrint;
    }

    public V getAnotherThingToPrint() {
        return anotherThingToPrint;
    }

    public void setAnotherThingToPrint(V anotherThingToPrint) {
        this.anotherThingToPrint = anotherThingToPrint;
    }

    public SomethingOfTypeGeneric getThingToPrint() {
        return thingToPrint;
    }

    public void setThingToPrint(SomethingOfTypeGeneric thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void printTheThing() {
        System.out.println(this.thingToPrint);
    }
}

class JustMainThing{
    public static void main(String[] args) {
        ThingPrinter<String, Component> stringThingPrinter = new ThingPrinter<>("Becko", new Component());
        stringThingPrinter.printTheThing();

        ThingPrinter<Integer, Motor> integerThingPrinter = new ThingPrinter<>(154, new Motor());
        integerThingPrinter.printTheThing();

        Map<String, Motor> stringMotorMap = new HashMap<>();

        AnimalPrinter<Motor> animalPrinter = new AnimalPrinter<Motor>();
    }

    public static <T> T returnMeAGeneric(T someGeneric) {
        return someGeneric;
    }
}