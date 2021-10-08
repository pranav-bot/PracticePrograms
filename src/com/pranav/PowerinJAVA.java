package com.pranav;

import java.util.Scanner;

public class PowerinJAVA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int i =0;
        int z = x;
        while(y!=1){
            x=z*x;
            y--;
        }
        System.out.println(x);
    }
}
