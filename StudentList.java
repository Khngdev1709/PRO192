/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class StudentList extends ArrayList<Student> {

    private ArrayList<Student> list = new ArrayList<>();
    private Inputter input = new Inputter();

    public StudentList() {
        super();
    }

    //This method use to search the student through the code
    public Student search(String code) {
        code = code.trim().toUpperCase();
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getCode().equalsIgnoreCase(code)) {
                return this.get(i);
            }
        }
        return null;
    }

    //This method use to check if the code is existed.
    private boolean isCodeDuplicated(String code) {
        code = code.trim().toUpperCase();
        return search(code) != null;
    }

    //This method use to add a new student
    public void addStudent() {
        String newCode, newName;
        int newMark;
        boolean codeDuplicated = false;

        do {
            newCode = input.inputPattern("Input students code (S000): ", "[Ss]\\d{3}");
            if (isCodeDuplicated(newCode)) {
                System.out.println("Code is duplicated");
            } else {
                break;
            }
        } while (true);
        newName = input.inputNonBlankStr("Input name : ");
        newMark = input.inputInt("Input mark (0..10): ", 0, 10);
        list.add(new Student(newCode, newName, newMark));
        System.out.println("Student " + newCode + " has been added");
    }

    //This method use to print all the list
    public void printAll() {
        if (list.isEmpty()) {
            System.out.println("Empty list");
        }
        System.out.println("Student list: ");
        for (Student s : list) {
            System.out.println(s);
        }
        System.out.println("Total: " + list.size() + " Student(s).");
    }

    public void searchStudent() {
        String searchCode;
        if (list.isEmpty()) {
            System.out.println("Empty list. No search can be performed");
        }
        searchCode = input.inputPattern("Input code of student to update: ", "S\\d{3}$");
        Student s = search(searchCode);
        if (s == null) {
            System.out.println("Student " + searchCode + " doesn't exist!");
        } else {
            System.out.println("Old name: " + s.getName());
            String newName = input.inputNonBlankStr("New name: ");
            System.out.println("Old mark: " + s.getMark());
            int newMark = input.inputInt("New mark (0..10): ", 0, 10);
            s.setName(newName);
            s.setMark(newMark);
            System.out.println("Student " + searchCode + " has been updated.");
        }
    }

    // Xoá sinh viên theo mã
    public void removeStudent() {
        if (list.isEmpty()) {
            System.out.println("Empty list. No remove can be performed!");
            return;
        }
        String code = input.inputPattern("Input code of student to remove: ", "S\\d{3}");
        Student s = search(code);
        if (s == null) {
            System.out.println("Student " + code + " doesn't exist!");
        } else {
            list.remove(s);
            System.out.println("Student " + code + " has been removed.");
        }
    }

    public void updateStudent() {
        if (list.isEmpty()) {
            System.out.println("Empty list. No update can be performed!");
            return;
        }
        String code = input.inputPattern("Input code of student to update: ", "S\\d{3}");
        Student s = search(code);
        if (s == null) {
            System.out.println("Student " + code + " doesn't exist!");
        } else {
            System.out.println("Old name: " + s.getName());
            String newName = input.inputNonBlankStr("New name: ");
            System.out.println("Old mark: " + s.getMark());
            int newMark = input.inputInt("New mark (0..10): ", 0, 10);
            s.setName(newName);
            s.setMark(newMark);
            System.out.println("Student " + code + " has been updated.");
        }
    }
}
