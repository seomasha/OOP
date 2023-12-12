package OOP.Week11LABS.LABTask;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentSystem {

    List<Student> students = new ArrayList<>();

    public StudentSystem(String fileName) {
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

            students = readStudents(fileName);

            for(Student student : students) {
                System.out.println(student);
            }
        }
        catch(IOException e){
            System.out.println("Unable to read file.");
        }
    }

    public static List<Student> readStudents(String fileName) throws IOException{
        ArrayList<Student> students1 = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

        List<String> lines = bufferedReader.lines().collect(Collectors.toList());

        for(String line : lines) {
            String[] tempArr = line.split(",");

            Student student = new Student(
                    tempArr[0] == "" ? 000 : Integer.parseInt(tempArr[0]),
                    tempArr[1],
                    tempArr[2],
                    tempArr[3],
                    tempArr[0] == "" ? 000 : Integer.parseInt(tempArr[0])
            );

            students1.add(student);
        }

        bufferedReader.close();

        return students1;
    }

    public Optional<Student> getStudentByID(int ID) throws StudentNotFoundException{
        for(Student student : students) {
            if(student.ID() == ID) {
                return Optional.of(student);
            }
        }
        throw new StudentNotFoundException("The student doesn't exist.");
    }

    public Student getHighestGPAStudent() {
        Student student = students.get(0);

        for(Student s : students) {
            if(s.GPA() > student.GPA()) {
                student = s;
            }
        }

        return student;
    }

    public Student getLongestNameStudent() throws EmptyStudentListException{
        try{
            Student student = students.get(0);

            for(Student s : students) {
                if(s.name().length() > student.name().length()) {
                    student = s;
                }
            }

            return student;
        }
        catch (EmptyStudentListException e) {
            throw new EmptyStudentListException("List of students is empty");
        }
    }

    public static void main(String[] args) {
        StudentSystem system = new StudentSystem("students.csv");

        try {
            Optional<Student> studentByID = system.getStudentByID(10);

            System.out.println(studentByID.get().name());
        } catch (StudentNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(system.getHighestGPAStudent());
        System.out.println(system.getLongestNameStudent());

    }
}
