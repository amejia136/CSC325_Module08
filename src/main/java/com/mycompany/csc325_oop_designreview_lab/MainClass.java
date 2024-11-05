/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

/**
 * @author MoaathAlrajab
 */
public class MainClass {

    public static void main(String[] args) {


        Student std1 = new Student("James", (short) 20, 0);

        Freshman std3 = (Freshman) new Student("James", (short) 20, 12); // name, age, credits

        Senior std2 = (Senior) new Student("John", (short) 30, 90);

        System.out.println(std1);

        System.out.println(std2);

    }
}

