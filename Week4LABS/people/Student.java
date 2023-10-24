package OOP.Week4LABS.people;

public class Student extends Person{

    private int credits = 0;
    public Student(String name, String address) {
        super(name, address);
    }

    public int getCredits() {
        return this.credits;
    }

    public void setCredits(int newcredits) {
        this.credits = newcredits;
    }

    public void study() {
        this.credits++;
    }

    @Override
    public String toString() {
        String str = super.getFullName() + "\n" + super.getAddress() + "\ncredits: " + this.credits;

        return str;
    }
}
