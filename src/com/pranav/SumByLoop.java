package com.pranav;

import java.util.Scanner;

public class SumByLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=0;
        int sum = 0;
        System.out.println("Enter Numbers and Enter 0 to stop");
        while((a = in.nextInt()) != 0) {
            sum = sum +a;

        }
        System.out.println(sum);
    }
}
