/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Developer extends Employee {

    private int projects;

    public Developer(int projects, double salary, int experience) {
        super(salary, experience);
        setProjects(projects);
    }

    public Developer() {
        setProjects(0);
    }

    public int getProjects() {
        return projects;
    }

    public void setProjects(int projects) {
        this.projects = projects;
    }
    
    public String getLevel() {
        if (projects >= 5) {
            return "Senior Developer";
        } else {
            return "Junior Developer";
        }
    }

    @Override
    public String toString() {
        return String.format("%.2f,%d,%d,%s", getSalary(),getExperience(),projects,getLevel());
                
    }
    
}
