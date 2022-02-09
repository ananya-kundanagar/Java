package com.ananya;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount to convert: ");
        double rs = scan.nextDouble();
        double usd = rs*0.013372583;

        System.out.println("Rupee to USD: "+ usd + "$");
    }


}
