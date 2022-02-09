package com.ananya;

import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in cel: ");
        float temp = input.nextFloat();
        float f = (temp * 9/5) + 32;
        System.out.println(f);
    }
}
