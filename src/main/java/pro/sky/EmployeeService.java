package pro.sky;

import org.springframework.stereotype.Service;
import pro.sky.Exception.EmployeeAlreadyAddedException;
import pro.sky.Exception.EmployeeNotFoundException;
import pro.sky.Exception.EmployeeStorageIsFullException;
import pro.sky.model.Employee;

import java.util.*;

@Service
public class EmployeeService {
    private final int maxEmployees = 10;
    private final Map<String, Employee> employees = new HashMap<>();
    private final ValidationService validationService;

    public EmployeeService(ValidationService validationService) {
        this.validationService = validationService;
    }


    public Employee add(String firstName, String lastName, int department, int salary) {
        firstName = validationService.validateCheckName(firstName);
        lastName = validationService.validateCheckName(lastName);
        String key = buildKey(firstName, lastName);
        if (employees.containsKey(key)) {
            throw new EmployeeAlreadyAddedException();
        }
        if (employees.size() >= maxEmployees) {
            throw new EmployeeStorageIsFullException();
        }
        Employee employee = new Employee(firstName, lastName, department, salary);
        employees.put(key, employee);
        return employee;
    }

    public Employee remove(String firstName, String lastName) {
        String key = buildKey(firstName, lastName);
        if (!employees.containsKey(key)) {
            throw new EmployeeNotFoundException();
        }
        return employees.remove(key);
    }

    public Employee find(String firstName, String lastName) {
        String key = buildKey(firstName, lastName);
        if (!employees.containsKey(key)) {
            throw new EmployeeNotFoundException();
        }
        return employees.get(key);
    }

    private String buildKey(String name, String surname) {
        return name + " " + surname;
    }

    public List<Employee> findAll() {
        return List.copyOf(employees.values());
    }
}
