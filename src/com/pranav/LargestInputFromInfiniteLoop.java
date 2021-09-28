package com.pranav;

import java.util.Scanner;

public class LargestInputFromInfiniteLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 0;
        while((a = in.nextInt())!=0){
            int d= a;
            b= d;
            if(b>a){
                System.out.println(b);
            }
        }

    }


}

