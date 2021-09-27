package com.pranav;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class AreaOfATriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Value of sides");
        Double a = in.nextDouble();
        Double b = in.nextDouble();
        Double c = in.nextDouble();
        Double s= (a+b+c)/2;
        Double result = sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(result);
    }
}
