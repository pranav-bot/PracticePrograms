package com.pranav;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Operator From - " +
                "1.+" +
                "2.-" +
                "3./" +
                "4.*" +
                "5.**" +
                "6.%" +
                "7.//");
        int a = input.nextInt();

        System.out.println("Enter a number");

        int num1 = input.nextInt();

        System.out.println("Enter Another Number");

        int num2 = input.nextInt();

        if(a == 1){
            System.out.println(num1 + num2);
        }
        else if(a==2){
            System.out.println(num1 - num2);

        }
        else if(a==3){
            System.out.println(num1/num2);
        }
        else if(a==4){
            System.out.println(num1*num2);
        }
        else if(a==6){
            System.out.println(num1%num2);
        }
        else{
            System.out.println("Out of Range");
        }
    }

}

