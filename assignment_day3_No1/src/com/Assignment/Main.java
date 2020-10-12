package com.Assignment;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int marks[] = new int[5];
        int i;
        float total=0,percentage;
        Scanner scanner= new Scanner(System.in);

        for (i=0;i<5;i++){
            System.out.print("Enter Marks out of 100 of subject " + (i+1) + ":");
            marks[i] =scanner.nextInt();
            total = total + marks[i];
        }
        scanner.close();

        percentage=(total/500)*100;
        System.out.println("Percentage of Student : "+ percentage);
        System.out.println("The student grade is : ");
        if(percentage>=90){
            System.out.print("A+");
        }
        else if(percentage>=80 && percentage<90){
            System.out.print("A");
        }
        else if(percentage>=60 && percentage<80){
            System.out.print("B");
        }
        else if(percentage>=40 && percentage<60){
            System.out.print("C");
        }
        else{
            System.out.print("D");
        }
    }
}
