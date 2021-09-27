package com.pranav;

import java.util.Scanner;

public class CheckWhetherEvenOrOdd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if(a % 2==0){
            System.out.println("It is Even");
        }
        else{
            System.out.println("It is Odd");
        }
	// write your code here
    }
}
