package OOP.Week4LABS.people;

public class Person {

    private String fullName;
    private String address;

    public Person(String name, String add) {
        this.fullName = name;
        this.address = add;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String newname) {
        this.fullName = newname;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String newadress) {
        this.address = newadress;
    }

    @Override
    public String toString() {
        String str = this.fullName + "\n" + this.address;

        return str;
    }
}
