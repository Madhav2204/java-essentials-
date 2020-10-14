package com.AssignmentNo2day4;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a[] = new int[5];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of elements You want in array :");
        for ( int i=0; i<5 ; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Your odd numbers  are : ");
        for (int i=0;i<5 ; i++){
            if(a[i] % 2!=0){
                System.out.print(a[i]+ " " );
            }
        }

    }
}
