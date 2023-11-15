package OOP.WEEK7LABS;

import java.util.Objects;

class Person {
    private final String name;
    private final int age;
    private final String eyeColor;

    public Person(String name, int age, String eyeColor) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    @Override
    public String toString() {
        return "Person: [name = " + this.name + " age: " + this.age + " eye color: " + this.eyeColor + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, eyeColor);
    }

    @Override
    public boolean equals(Object object) {
        if(object == null) {
            return false;
        }
        Person p = (Person) object;
        return this.name.equals(p.name) && this.age == p.getAge() && this.eyeColor.equals(p.eyeColor);
    }

    public static void main(String[] args) {
    }
}

record PersonRecord(String name, int age, String eyeColor) {};