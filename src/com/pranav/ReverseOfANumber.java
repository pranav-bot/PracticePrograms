package com.pranav;

import java.util.Scanner;

public class ReverseOfANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int c = 0;
        while(a!=0){
            c= c*10;
            c = c+a%10;
            a=a/10;

        }
        System.out.println(c);

    }
}
