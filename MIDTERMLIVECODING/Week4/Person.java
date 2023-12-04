package OOP.MIDTERMLIVECODING.Week4;

import java.util.ArrayList;
import java.util.List;

class Person {
    private String fullname;
    private String address;
    private int age;
    private String country;
    public Person(String fullname, String address, int age, String country)
    {
        this.fullname = fullname;
        this.address = address;
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

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class Student extends Person {
    private int student_id;
    private int credit;
    private List<Integer> grades = new ArrayList<>();

    public Student(String fullname, String address, int age, String country) {
        super(fullname, address, age, country);
        this.credit = 0;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    public void study() {
        this.credit++;
    }

    public int getCredit() {
        return credit;
    }
}

class Teacher{
    private int salary;
    public Teacher(String fullname, String address, int salary)
    {
        this.salary = salary;
    }
    public int getSalary()
    {
        return this.salary;
    }
}

class Main{
    public static void main(String[] args) {

    }

    public static void printDepartment(List<Person> people) {
        for(Person p : people) {
            System.out.println(p);
        }
    }
}