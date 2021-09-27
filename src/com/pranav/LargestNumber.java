package com.pranav;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.println("Enter 2 numbers");
        a = input.nextInt();
        b = input.nextInt();
        if (a > b) {
            System.out.println(a);
        }
        else if(a<b){
            System.out.println(b);
        }
        else{
            System.out.println("they are equal");
        }

    }
}
