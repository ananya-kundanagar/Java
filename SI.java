package com.ananya;

import java.util.Scanner;

public class SI {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Principal amount , Time and Rate: ");
        double principal = scan.nextDouble();
        float time = scan.nextFloat();
        float rate = scan.nextFloat();
        double simpleIntrest = (principal*rate*time)/100;
        System.out.println("Simple Intrest : "+ simpleIntrest);

    }

}
