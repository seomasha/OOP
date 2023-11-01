package OOP.WEEK5LABS.polymorphism;

public class Main {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        Tiger tiger = new Tiger();
        Animal animal = new Animal();

        doSomethingCrazy(mouse);
        doSomethingCrazy(tiger);
        doSomethingCrazy(animal);
    }

    public static void doSomethingCrazy(Animal animal) {
        //System.out.println(animal.makeSound()); //upcasting
        if(animal instanceof Mouse) {
            Mouse t = (Mouse) animal;
            t.amIaMouse();
        }
    }
}
