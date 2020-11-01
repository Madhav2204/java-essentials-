package com.day8_2;

public class Main {

    public static void main(String[] args) {
        Engineer E =new Engineer();
        E.setDetails();
        E.getDetails();
        System.out.println("---------");
        Doctor D =new Doctor();
        D.setDetails();
        D.getDetails();
        System.out.println("---------");
        Pilot P =new Pilot();
        P.setDetails();
        P.getDetails();
    }
}
