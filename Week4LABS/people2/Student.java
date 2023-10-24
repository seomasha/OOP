package OOP.Week4LABS.people2;

import java.util.ArrayList;

public class Student {

    private int student_id;
    private String fullName;
    private ArrayList<Integer> grades = new ArrayList<Integer>();

    public Student(int student_id, String fullName, ArrayList<Integer> grades) {
        this.student_id = student_id;
        this.fullName = fullName;
        this.grades = grades;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }
}
