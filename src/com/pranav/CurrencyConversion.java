package com.pranav;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("Choose Option");
        System.out.println("1.Rupees to Dollar");
        System.out.println("2.Dollar to rupees");
        a = input.nextInt();
        double b = input.nextDouble();
        if(a==1){
            System.out.println("Enter Value In Rupees");
            b= input.nextInt();
            b = b*0.014;
        }
        else if(a==2){
            System.out.println("Enter Value in Dollars");
             Double c = input.nextDouble();
             c= c*73.4;
        }
        else{
            System.out.println("Wrong Input");
        }

    }
}
