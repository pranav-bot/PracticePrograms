package com.pranav;

import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Number- ");
        int x= in.nextInt();
        int temp=x;
        if(ReverseOfaNumber(x)==temp){
            System.out.println("yes");
        }
        else {
            System.out.println("No");
        }
    }
    static int ReverseOfaNumber(int num){
        int c=0;
        while(num!=0){
            c=c*10;
            c=c+num%10;
            num=num/10;
        }
        return c;
    }
}
