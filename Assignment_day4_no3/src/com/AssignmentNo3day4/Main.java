package com.AssignmentNo3day4;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Program to Sum entered elements by user in array
         int [] arr = new int[5] ;
         int sum =0;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Your five Elements of array.");
         for (int i=0 ; i<5 ; i++){
             System.out.print("Enter Your Element of array at " + i + " : " );
             arr[i]= sc.nextInt();
         }
         for (int i=0 ; i<5 ; i++){
             sum = sum+ arr[i];
         }
         System.out.println("The sum of your entered five integer elements is : " + sum);

    }
}
