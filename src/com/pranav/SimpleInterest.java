package com.pranav;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        int r = input.nextInt();
        int t = input.nextInt();
        System.out.println("Simple Interest Amount is = " + p*r*t/100);
        int i  = (p*r*t/100)+p;
        System.out.println("Total Amount is = " + i );
    }
}
