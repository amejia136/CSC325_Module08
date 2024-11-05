package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student{

    private int credtis;

    public Senior(int credtis) {
        this.credtis = credtis;
    }

    public Senior(String name, short age, int GPA, int credtis) {
        super(name, age, GPA);
        this.credtis = credtis;
    }

    public Senior(String name, short age, String name1, short age1, int GPA1, int credtis) {
        super(name, age, name1, age1, GPA1);
        this.credtis = credtis;
    }

    public Senior(Student other, int credtis) {
        super(other);
        this.credtis = credtis;
    }

    @Override
    public String toString() {
        String formattedSenior = String.format("%s, %d, %d, %d", getName(), getAge(), getGPA(), credtis);
        return formattedSenior;
    }
}
