package com.inherit;

import java.util.Scanner;

public class Employee {
    String name;
    double salary;
    int age;
    String designation;
    Scanner sc = new Scanner(System.in);
    public void setDetails(){
        System.out.print("Enter the name of Employee : ");
        name=sc.next();
        System.out.print("Enter salary of Employee  : ");
        salary =sc.nextDouble();
        System.out.print("Enter age of Employee : ");
        age = sc.nextInt();
        System.out.print("Enter designation of Employee : ");
        designation =sc.next();
    }
    public void getDetails(){
        System.out.println("-------------");
        System.out.println("Employee Details");
        System.out.println("-------------");
        System.out.println(name);
        System.out.println(salary);
        System.out.println(age);
        System.out.println(designation);
    }
}
