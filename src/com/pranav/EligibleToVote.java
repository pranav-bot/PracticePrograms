package com.pranav;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter age-");
        int age = in.nextInt();
        AgeChecker(age);
    }
    static void AgeChecker(int num1){
        if(num1>=18){
            System.out.println("Eligible To vote");
        }
        else {
            System.out.println("Not Eligible");
        }
    }
}
