package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student{

    public Freshman() {
    }

    public Freshman(String name, short age, int GPA) {
        super(name, age, GPA);
    }

    public Freshman(String name, short age, String name1, short age1, int GPA1) {
        super(name, age, name1, age1, GPA1);
    }

    public Freshman(Student other) {
        super(other);
    }

}
