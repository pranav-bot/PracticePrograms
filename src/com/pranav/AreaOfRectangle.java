package com.pranav;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Length");
        int a = in.nextInt();
        System.out.println("Enter Breadth");
        int b = in.nextInt();
        int c = a*b;
        System.out.println(c);
    }
}
