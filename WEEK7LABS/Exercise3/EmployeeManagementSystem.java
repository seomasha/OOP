package OOP.WEEK7LABS.Exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeManagementSystem {
    ArrayList<Employee> employees = new ArrayList<>();

    public List<Employee> filterEmployeesBySalary(double min) {
        return employees.stream().filter(employee -> employee.salary() >= min).toList();
    }

    public double totalSalary() {
        double sum = 0;

        for(Employee e : employees) {
            sum += e.salary();
        }

        return sum;
    }

    public void displayEmployeeDetails() {
        for(Employee e : employees) {
            System.out.println(e);
        }
    }
}
