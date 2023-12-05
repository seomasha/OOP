package OOP.WEEK10LABS.Exercise2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

class Student {
    private int ID;
    private String name;
    private ArrayList<Integer> grades;

    public Student(int ID, String name, ArrayList<Integer> grades) {
        this.ID = ID;
        this.name = name;
        this.grades = grades;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public void printInfo() {
        System.out.println(this.ID + " | " + this.name);
        System.out.println(this.grades);
    }
}

class GradeAnalyzer {
    private ArrayList<Integer> grades;

    public GradeAnalyzer(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public double calculateAverage() {
        double sum = 0;

        for(int i : this.grades) {
            sum+=i;
        }

        return sum / this.grades.size();
    }

    public void printSummary() {
        for(int i : grades) {
            System.out.println(i);
        }
    }
}

class Start {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(8);
        grades.add(9);
        grades.add(10);
        grades.add(9);
        grades.add(6);
        grades.add(10);
        GradeAnalyzer analyzer = new GradeAnalyzer(grades);

        Method[] methods = analyzer.getClass().getDeclaredMethods();

        for(Method m : methods) {
            if(m.getName().startsWith("calculate")) {
                m.setAccessible(true);
                System.out.println(m.getName());
                System.out.println(m.invoke(analyzer));
            }
            else if(m.getName().startsWith("print")) {
                m.setAccessible(true);
                System.out.println(m.getName());
                m.invoke(analyzer);
            }
        }
    }
}