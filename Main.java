package com.ananya;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number for the even/odd: ");
        int a = input.nextInt();
        if(a %2==0){
            System.out.println("Number is even");
        }else {
            System.out.println("Number is odd");
        }

    }
}
