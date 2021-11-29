package com.pranav;

import java.util.Scanner;

public class CheckWhetherEvenOrOdd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int a = input.nextInt();
        EvenOrOdd(a);
    }
    static void EvenOrOdd(int num1){
        if(num1%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("odd");

        }
    }
}

