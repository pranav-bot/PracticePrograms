package com.pranav;

import java.util.Scanner;

public class CircumfrenceAndAreaOfCircle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Radius");
        float r= in.nextFloat();
        Circimfrence(r);
        Area(r);
    }
    static float Circimfrence(float num1) {
        float Circum= (float) (2*(Math.PI)*num1);
        System.out.println(Circum);
        return Circum;
    }
    static float Area(float num1){
        float Ar=(float) Math.PI*num1*num1;
        System.out.println();
        return Ar;
    }

}
