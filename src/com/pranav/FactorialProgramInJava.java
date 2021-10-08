package com.pranav;

import java.util.Scanner;

public class FactorialProgramInJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,n,i;
        n = in.nextInt();
        a=1;
        i=1;
        while(i<=n){
            a = a*i;
            i++;

        }
        System.out.println(a);
    }
}
