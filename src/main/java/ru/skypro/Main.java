package ru.skypro;

import java.time.LocalDate;

public class Main {
    private static Employee[] employees = new Employee[10];


    public static void main(String[] args) {


        employees[0] = new Employee("Александр", "Пушкин", "Сергеевич", 50000, 5);
        employees[1] = new Employee("Гаджи", "Гаджиев", "Гаджиевич", 40000, 1);
        employees[2] = new Employee("Иван", "Иванов", "Иванович", 45000, 2);
        employees[3] = new Employee("Майк", "Тайсон", "Петрович", 43000, 4);
        employees[4] = new Employee("Любовь", "Бушуева", "Сергеевна", 63000, 3);
        employees[5] = new Employee("Илья", "Тихомиров", "Николаевич", 3000, 4);
        employees[6] = new Employee("Александр", "Курочкин", "Михайлович", 5000, 4);
        employees[7] = new Employee("Семен", "Семенов", "Семенович", 7000, 3);
        employees[8] = new Employee("Виталий", "Скоробогадько", "Витальевич", 70000, 2);
        employees[9] = new Employee("Павел", "Волков", "Петрович", 15000, 5);
        printEmployees();
        System.out.println("Сумма зарплат за месяц : " + calculateSumSalary());
        System.out.println("Средняя сумма зарплат : " + calculateAverageSalary());
        System.out.println("Сотрудник с максимальной зарплатой : " + employeeMaxSalary());
        System.out.println("Сотрудник с минимальной зарплатой : " + employeeMinSalary());

        fullName();
        int department = 3;
        System.out.println("Сотрудник с минимальной зарплатой для отдела " + department + ": " +
                employeeMinSalaryForDepartment(department));
        System.out.println("Сотрудник с максимальной зарплатой для отдела " + department + ": " +
                employeeMaxSalaryForDepartment(department));
        System.out.println("Сумма зарплат в отделе " + department + " : " + calculateSumSalaryForDepartment(department));
        System.out.println("Средняя сумма зарплат в отделе " + department + " : "
                + calculateAverageSumSalaryForDepartment(department));
        fullNameInDepartment(department);
        int percent = 10;
        changeSalaryOnPercent(percent);
        printSalaries();
    }

    private static void printEmployees() {
        for (Employee employee : employees) {

            System.out.println(employee);
        }
    }

    private static int calculateSumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static double calculateAverageSalary() {
        return (double) calculateSumSalary() / employees.length;
    }

    private static Employee employeeMaxSalary() {
        Employee employeeMaxSalary = null;
        double maxSalary = Integer.MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                employeeMaxSalary = employees[i];
            }
        }
        return employeeMaxSalary;
    }

    private static Employee employeeMinSalary() {
        Employee employeeWithMinSalary = null;

        double minSalary = Integer.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                employeeWithMinSalary = employees[i];
            }
        }
        return employeeWithMinSalary;
    }

    private static void fullName() {
        System.out.println("Ф.И.О. сотрудников :");
        for (Employee employee : employees) {
            System.out.println(employee.getSurname() + " " + employee.getName() + " " + employee.getMiddleName());
        }
    }

    private static Employee employeeMinSalaryForDepartment(int department) {
        Employee employeeWithMinSalary = null;

        double minSalary = Integer.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary && employees[i].getDepartment() == department) {
                minSalary = employees[i].getSalary();
                employeeWithMinSalary = employees[i];
            }
        }
        return employeeWithMinSalary;
    }

    private static Employee employeeMaxSalaryForDepartment(int department) {
        Employee employeeWithMaxSalary = null;

        int maxSalary = Integer.MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary && employees[i].getDepartment() == department) {
                maxSalary = (int) employees[i].getSalary();
                employeeWithMaxSalary = employees[i];
            }
        }
        return employeeWithMaxSalary;
    }

    public static int calculateSumSalaryForDepartment(int department) {
        int sumDeparment = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                sumDeparment += employees[i].getSalary();
            }
        }
        return sumDeparment;
    }

    public static double calculateAverageSumSalaryForDepartment(double department) {
        int employeeCount = 0;
        double sumAverageDeparment = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                sumAverageDeparment += employees[i].getSalary();
                employeeCount++;
            }
        }
        return sumAverageDeparment / employeeCount;
    }

    private static void fullNameInDepartment(int department) {
        System.out.println("Ф.И.О. сотрудников в " + department + " отделе: ");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                System.out.println(employees[i].getSurname() + " " + employees[i].getName() + " " +
                        employees[i].getMiddleName() + ", зарплата: " + employees[i].getSalary() +
                        ", id:  " + employees[i].getId());
            }
        }
    }

    public static void changeSalaryOnPercent(int percent) {
        double ratio = (double) percent / 100;
        System.out.println("Зарплата сотрудников после индексации:");
        for (Employee employee : employees) {
            double newSalary = (employee.getSalary() * ratio) + employee.getSalary();
            employee.setSalary(newSalary);
        }
    }

    public static void printSalaries (){
        for (Employee employee: employees){
            System.out.println(String.format("Сотрудник %s %s %s  зарплата %s", employee.getName(),employee.getSurname(),
                    employee.getMiddleName(), employee.getSalary()));
        }
    }
}
