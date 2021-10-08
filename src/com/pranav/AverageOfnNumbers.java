package com.pranav;


import java.util.Scanner;

public class AverageOfnNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int i = 1;
        float sum=0;
        while(i<=n) {
            sum = sum + i;
            i++;

        }
        System.out.println(sum/n);

    }
}
