package com.AssignmentNO2;
import java.util.Scanner;
import java.time.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int birthDate;
        int birthMonth;
        int birthYear;
        float salary;
        float per_tax;
        System.out.print("Enter the Employee Name : ");
        name = sc.next();
        System.out.print("Enter Birth Date of Employee : ");
        birthDate = sc.nextInt();
        System.out.print("Enter Birth Month of Employee : ");
        birthMonth=sc.nextInt();
        System.out.print("Enter birth year of Employee : ");
        birthYear=sc.nextInt();
        System.out.print("Enter the Salary of Employee : ");
        salary=sc.nextFloat();
        LocalDate dateOfBirth = LocalDate.of(birthYear,birthMonth, birthDate);
        LocalDate currentDate = LocalDate.now();
        Period ageDetails =Period.between(dateOfBirth,currentDate);
        System.out.println("Name of Employee :"+name);
        System.out.println("Employee's is "+ ageDetails.getYears() + " years " + ageDetails.getMonths() + " months " + ageDetails.getDays() + " days old ");
        System.out.println("Annual Salary of Employee :"+ salary);
        if(ageDetails.getYears()>=51){
            per_tax= (20*salary)/100;
            System.out.println("Your 20% Annual Tax is :" + per_tax);
        }
        else if(ageDetails.getYears()>=41 && ageDetails.getYears()<51){
            per_tax= (15*salary)/100;
            System.out.println("Your 15%  Annual Tax is :" + per_tax);
        }
        else if(ageDetails.getYears()>=31 && ageDetails.getYears()<41){
            per_tax= (10*salary)/100;
            System.out.println("Your 10% Annual Tax is :" + per_tax);
        }
        else if(ageDetails.getYears()>=21 && ageDetails.getYears()<31){
            per_tax= (5*salary)/100;
            System.out.println("Your 5% Annual Tax is :" + per_tax);
        }
    }
}
