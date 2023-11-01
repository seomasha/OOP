package OOP.WEEK5LABS.polymorphism;

public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String makeSound() {
        return "ANIMAL SOUND";
    }

    public String makeSound(String myAnimalSound) {
        return "POLYMORPHIC ANIMAL SOUND";
    }
}
