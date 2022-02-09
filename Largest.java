package com.ananya;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number for comp: ");
        a = scan.nextInt();
        b = scan.nextInt();
        if (a>b){
            System.out.println(a+ " is larger than " + b);
        }else{
            System.out.println(b + " is larger than " + a);
        }
    }
}
