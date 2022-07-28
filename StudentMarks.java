package com.marks;

public class StudentMarks {
    public static void main(String[] args) {
        Student s[] = new Student[10];
        s[0] = new Student("Akask", "4001", new Marks("76", "90", "89", "57", "87"));
        s[1] = new Student("Aravind", "4002", new Marks("76", "67", "96", "98", "89"));
        s[2] = new Student("Bala", "4003", new Marks("76", "79", "86", "84", "78"));
        s[3] = new Student("Balaji", "4004", new Marks("78", "98", "54", "64", "78"));
        s[4] = new Student("Chandru", "4005", new Marks("91", "95", "83", "71", "66"));
        s[5] = new Student("Dhanush", "4006", new Marks("58", "81", "48", "59", "73"));
        s[6] = new Student("Dinesh", "4007", new Marks("56", "59", "54", "93", "83"));
        s[7] = new Student("Elavarasan", "4008", new Marks("75", "62", "67", "37", "87"));
        s[8] = new Student("Govind", "4009", new Marks("69", "91", "98", "55", "65"));
        s[9] = new Student("Hari", "4010", new Marks("74", "83", "76", "72", "94"));
        int n = 0;
        for (int i = 0; i < s.length; i++) {
            System.out.println("Student " + ++n);
            System.out.println(s[i].display());
            System.out.println(s[i].toString());
            System.out.println();
        }   
        
    }
}
