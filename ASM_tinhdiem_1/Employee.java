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
        setSalary(0);
        setExperience(0);
    }

    public Employee(double salary, int experience) {
        setSalary(0);
        setExperience(0);
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
        double bonus;
        return bonus = salary * (experience * 0.05);
    }
}
