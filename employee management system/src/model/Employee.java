package model;
import java.util.ArrayList;

public class Employee {
    private int id;
    private String full_name;
    private double salary;

    public Employee(int id, String full_name, double salary) {
        this.id = id;
        this.full_name = full_name;
        this.salary = salary;
    }

    public Employee() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return full_name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee[id=" + id + ",name=" + full_name + ",salary=" + salary + "]";
    }
}