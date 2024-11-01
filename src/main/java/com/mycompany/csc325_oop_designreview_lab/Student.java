/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human{

    //Member Variables
    private String name;
    private short age;

    //Default Constructor
    public Student(){
        super();
        this.name = "John Doe";
        this.age = 0;
    }

    //Parameterized Constructor


    public Student(String name, short age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, short age, String name1, short age1) {
        super(name, age);
        this.name = name1;
        this.age = age1;
    }

    //Copy Constructor
    public Student (Student other){
        this.name = other.name;
        this.age = other.age;
    }

    //Setter and Getters
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    @Override
    public String getAddress() {
        return "";
    }

    @Override
    public void setAddress(String address) {

    }


	// ToDo 3: Add a field for GPA and create a setter and a getter
	
	// ToDo 4: Add comments to your code
}
