package OOP.WEEK7LABS;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Sejo", 1, "brown");

        System.out.println(test(person));
    }
    public static Person test(Person person) {
        return person;
    }
}