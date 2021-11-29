package com.pranav;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Number- ");
        int x=in.nextInt();
        PrimeChecker(x);
    }
    static void PrimeChecker(int num1){
        boolean a=false;
        for(int i=2;i!=num1;i++){
            if(num1%i==0){
                a=true;
            }

        }
        if (!a){
            System.out.println(num1+" is a Prime Number");
        }
        else{
            System.out.println(num1+" is not a Prime Number");
        }
    }
}
