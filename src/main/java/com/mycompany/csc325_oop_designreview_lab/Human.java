/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public abstract class Human {
    private String name;
	private String address;
	private short age;

	//Default Constructor
	public Human() {
		this.name = "John Doe";
		this.address = "123 Main Street";
		this.age = 0;
	}

	// constructor that takes only two paras
	public Human(String name, short age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract String getAddress() ;

	public abstract void setAddress(String address);


	public short getAge() {
		return age;
	}

	public void setAge(short age) {
		this.age = age;
	}
}