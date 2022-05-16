package edu.fci.cs102;

public class Student {
    private String fname, lname;
    private int age;
    private String grade;
    private String image = "c:\\imgs\\student.png";

    public Student(String fname, String lname, int age, String grade) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.grade = grade;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return fname+" "+lname;
    }
}
