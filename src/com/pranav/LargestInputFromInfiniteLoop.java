package com.pranav;

import java.util.Scanner;

public class LargestInputFromInfiniteLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 0;
        while (true) {
            a = in.nextInt();
            if (a == 0) {
                break;
            }
            else{
                b= in.nextInt();
                if(b>a){
                    System.out.println(b);}
                else{
                        System.out.println(b);
                    }
            }

        }

    }
}




