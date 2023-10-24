package OOP.Week4LABS.people2;

public class Person {

    private String fullName;
    private String address;

    private int age;
    private String country;

    public Person(String name, String add, int age, String country) {
        this.fullName = name;
        this.address = add;
        this.age = age;
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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
