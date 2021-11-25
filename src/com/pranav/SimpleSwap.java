package com.pranav;

import java.util.Scanner;

public class SimpleSwap {
    public static void main(String[] args) {
        int a, b;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        int temp = a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);


    }
}
