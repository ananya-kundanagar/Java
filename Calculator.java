package com.ananya;

import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Numbers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter opertaor:");
        String op = scan.nextLine();
        if(Objects.equals(op, "+")){
            System.out.println("Sum: "+ (a+b));
        }else if(Objects.equals(op, "*")){
            System.out.println("Multiplication:" + (a*b));
        }else if(Objects.equals(op, "/")){
            System.out.println("Division :"+ (a/b));
        }else{
            System.out.println("subtraction: " + (a-b));
        }
    }
}
