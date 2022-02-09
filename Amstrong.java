package com.ananya;

import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int res = 0,num;
        num = a;
        while(a!=0){
            a= a%10;
            res += (a*a*a);
            a = a/10;
        }
        if (num == res){
            System.out.println("Number is amstrong");
        }else {
            System.out.println("Number is not amstrong");
        }
    }
}
