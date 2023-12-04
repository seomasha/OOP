package OOP.WEEK7LABS.Exercise3;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeManagementSystem {
    ArrayList<Employee> employees = new ArrayList<>();

    public List<Employee> filterEmployeesBySalary(double min) {
        return employees.stream().filter(employee -> employee.salary() >= min).toList();
    }

    public double totalSalary() {
        return employees.stream().mapToDouble(Employee::salary).sum();
    }

    public void displayEmployeeDetails() {
        employees.stream().forEach(employee -> System.out.println(employee));
    }
}
