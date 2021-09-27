package com.pranav;

import java.util.Scanner;

public class AreaOfACircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Radius");
        Double r = in.nextDouble();
        r = 3.14*r*r;
        System.out.println(r);
    }
}
