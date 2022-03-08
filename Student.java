package com.marks;

public class Student {
    private String name;
    private String regNo;
    private Marks marks;

    public Student(String name, String regNo, Marks marks) {
        this.name = name;
        this.regNo = regNo;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String getRegNo() {
        return regNo;
    }

    public Marks getMarks() {
        return marks;
    }
    public String display(){
        return "Name :" + name + "  RegNO :" + regNo;
    }
    public String toString(){
        return ""+marks;
    }
}
