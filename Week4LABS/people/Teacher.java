package OOP.Week4LABS.people;

public class Teacher extends Person{

    private int salary;
    public Teacher(String name, String add, int salary) {
        super(name, add);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int newsalary) {
        this.salary = newsalary;
    }

    @Override
    public String toString() {
        String str = super.getFullName() + "\n" + super.getAddress() + "\nsalary: " + this.salary;

        return str;
    }
}
