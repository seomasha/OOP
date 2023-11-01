package OOP.WEEK5LABS.abstraction;

public class Dog extends Animal implements AnimalAbility, AnotherAnimalAbility{

    public Dog(int legs) {
        super(legs);
    }

    @Override
    public String saySomething() {
        return null; //null is also an object
    }

    @Override
    public String walk() {
        return null;
    }

    @Override
    public String makeSomeWeirdSound() {
        return null;
    }
}
