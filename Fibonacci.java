package com.ananya;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum=0,a=0,b=1;
        while(n>0){
            System.out.println(sum + " ");
            a=b;
            b = sum;
            sum = a+b;
            n--;
        }

    }
}
