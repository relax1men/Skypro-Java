package ru.skypro;

import java.util.Objects;

public class Employee {

    private final String name;
    private final String surname;
    private final String middleName;
    private int salary;
    private int department;
    private final int id;
    private static int idGenerate = 1;


    public Employee(String name, String surname, String middleName, int salary, int department) {
        this.id = idGenerate++;
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "id = " + id +
                ", имя = " + name +
                ", фамилия = " + surname +
                ", отчество = " + middleName +
                ", зарплата = " + salary +
                ", отдел = " + department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return salary == employee.salary && department == employee.department && id == employee.id && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(middleName, employee.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, middleName, salary, department, id);
    }
}