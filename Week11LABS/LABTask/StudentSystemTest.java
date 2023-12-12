package OOP.Week11LABS.LABTask;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class StudentSystemTest {

    private static StudentSystem system;

    @BeforeEach
    void initializeStudents (){
        system = new StudentSystem("students.csv");
    }

    @Test
    void testifStudentisPresent() {
        List<Student> studentList = system.students;
        assertNotEquals(studentList.size(), 0);
    }

    @Test
    void testStudentWithId100() {
        Optional<Student> student;
        try {
            student = system.getStudentByID(100);
        } catch (StudentNotFoundException e) {
            throw new RuntimeException(e);
        }
        assertNotNull(student);
    }

    @Test
    void testStudentNull() {
        Optional<Student> student;
        try {
            student = system.getStudentByID(100);
        } catch (StudentNotFoundException e) {
            throw new RuntimeException(e);
        }
        assertNull(student);
    }

    @Test
    void testExceptionForEmptyStudentList() {
        assertThrows(EmptyStudentListException.class, () -> {
            StudentSystem.readStudents("empty.csv");
        });
    }

    @Test
    void testNamesArray() {
        String[] actualNames = new String[5];
        String[] expectedNames = new String[5];

        for(int i = 0; i < 5; i++) {
            actualNames[i] = system.students.get(i).name();
            expectedNames[i] = system.students.get(i).name();
        }

        assertArrayEquals(actualNames, expectedNames);
    }

    @Test
    void testSize() {
        String fileName = "students.csv";
        File file = new File(fileName);

        assertEquals(file.length(), 70);
    }

    @Test
    void testLargestName() {
        assertNotEquals(system.getLongestNameStudent(), "Ava White");
    }

    @Test
    void testStudents() {
        assertNotEquals(system.getHighestGPAStudent(), system.getLongestNameStudent());
    }

    @Test
    void testSameStudent() {

        Optional<Student> student;

        try{
            student = system.getStudentByID(12);
        }
        catch(StudentNotFoundException e) {
            throw new RuntimeException(e);
        }
        assertSame(system.getHighestGPAStudent(), student);
    }
}
