package com.day8_2;

import java.util.Scanner;

public class Parent {
    String name;
    int id;
    String designation;
    Scanner s = new Scanner(System.in);
    public void setDetails(){
        System.out.print("Enter Name :" );
        name =s.next();
        System.out.print("Enter id :");
        id =s.nextInt();
        System.out.print("Enter Your Designation :");
        designation = s.next();
    }
    public void getDetails(){
        System.out.println("-------");
        System.out.println("Your details");
        System.out.println("Name :" + name);
        System.out.println("Id :" + id);
        System.out.println("Designation :" + designation);
    }
}
