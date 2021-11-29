package com.pranav;

import java.util.Scanner;

public class ArmstrongOfANumber {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter Number- ");
        int x=in.nextInt();
        if( checker(x)==true){
            System.out.println("its an armstrong number");
        }
        else {
            System.out.println("its not an armstrong number ");
        }
    }
    static boolean checker(int x ){
        boolean a=false;
        int sum=0;
        int temp=x;
        for (int i=0;x>0;i++){
            int c=x%10;
            sum=sum+(c*c*c);
            x=x/10;
        }
        if(sum==temp){
            a=true;
        }
        return a;
    }
}
