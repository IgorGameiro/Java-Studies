package OOP;

import java.util.ArrayList;
import java.util.List;

interface Payable {
    double calculateSalary();
}

abstract class Employee implements Payable {
    protected String name;
    protected int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String getRole();

    public String getDetails() {
        return name + " (" + getRole() + ")";
    }
}

class Manager extends Employee {
    private double baseSalary;
    private double bonus;

    public Manager(String name, int age, double baseSalary, double bonus) {
        super(name, age);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public String getRole() {
        return "Manager";
    }
}

class Developer extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Developer(String name, int age, double hourlyRate, int hoursWorked) {
        super(name, age);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String getRole() {
        return "Developer";
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Manager("Alice", 40, 5000, 1000));
        employees.add(new Developer("Bob", 28, 50, 160));
        employees.add(new Developer("Carol", 32, 60, 150));

        for (Employee emp : employees) {
            System.out.println(emp.getDetails() + " - Salary: $" + emp.calculateSalary());
        }
    }
}
