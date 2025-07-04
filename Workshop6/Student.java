/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Student {

    protected String code;
    protected String name;
    protected int mark;

    public Student() {
        setCode("");
        setName("");
        setMark(0);
    }

    public Student(String code, String name, int mark) {
        setCode(code);
        setName(name);
        setMark(mark);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        if (code != null && !code.isEmpty()) {
            this.code = code.trim().toUpperCase();
        } else {
            this.code = "null";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 0) {
            this.name = name.trim().toUpperCase();
        } else {
            this.name = "null";
        }
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return code + "," + name + "," + mark;
    }

}
