package com.pranav;

import java.util.Scanner;

public class SumByLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=0;
        int sum = 0;
        while((a = in.nextInt()) != 0) {
            sum = sum +a;

        }
        System.out.println(sum);
    }
}
