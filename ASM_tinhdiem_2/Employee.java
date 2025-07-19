/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Employee {

    private double salary;
    private int experience;

    public Employee() {
        setSalary(0.0);
        setExperience(0);
    }

    public Employee(double salary, int experience) {
        setSalary(salary);
        setExperience(experience);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    public double calculateBonus() {
        return salary * (experience * 0.05);
    }
}
