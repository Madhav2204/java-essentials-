package com.FirstAppDevelopment;
import java.util.Scanner;
public class PlayerDetails {
    Scanner scan=new Scanner(System.in);
    String name;
    int yourScore=0;

    public void getDetails(){

        System.out.print("Enter player name : ");
        name=scan.next();


    }
}
