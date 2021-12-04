package com.pranav;

import java.util.Scanner;

public class ReverseOfANumber {
    public static void main(int a){
        int c = 0;
        while(a!=0){
            c= c*10;
            c = c+a%10;
            a=a/10;

        }
        System.out.println(c);

    }
}
