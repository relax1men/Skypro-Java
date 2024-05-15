package pro.sky;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class EmployeeService {
    private static final int maxEmployees = 10;
    private static final List<Employee> employees = new ArrayList<>();

    public static Employee add(String firstname, String lastName) {
        Employee employee = new Employee(firstname, lastName);
        if (employees.contains(employee)) {
            throw new EmployeeAlreadyAddedException();
        }
        if (employees.size() >= maxEmployees) {
            throw new EmployeeStorageIsFullException();
        }
        employees.add(employee);
        return employee;
    }

    public Employee remove(String firstname, String lastName) {
        Employee employee = new Employee(firstname, lastName);
        if (!employees.contains(employee)) {
            throw new EmployeeNotFoundException();
        }
        employees.remove(employee);
        return employee;
    }

    public Employee find(String firstname, String lastName) {
        Employee employee = new Employee(firstname, lastName);
        if (!employees.contains(employee)) {
            throw new EmployeeNotFoundException();
        }
        return employee;
    }

    public List<Employee> findAll() {
        return Collections.unmodifiableList(employees);
    }
}
