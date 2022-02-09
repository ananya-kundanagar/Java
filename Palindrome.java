package com.ananya;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int num = a,x;
        int rev = 0;
        while(a>0){
            x=a%10;
            rev = (rev*10) + x;
            a = a/10;
        }if (rev == num){
            System.out.println("Number is palindrome");
        }else {
            System.out.println("Number is not palindrome");
        }

    }
}
