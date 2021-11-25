package com.pranav;

import java.util.Scanner;

public class MinimumOrMaximum {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Number Of inputs");
        int x= in.nextInt();
        int a[] = new int[x];
        for(int i=0;i!=x;i++){
            System.out.println("Enter number " + (i+1));
            a[i]=in.nextInt();
        }
        Maximum(a);
        Minimum(a);

    }
    static void Maximum(int a[]){
        int max=a[0];
        for(int k=1;k<a.length;k++) {
            if (max < a[k]) {
                max = a[k];
            }
        }
        System.out.println(max);
    }
    static void Minimum(int a[]){
        int min=a[0];
        for(int k=0;k!=a.length;k++){
            if(min>a[k]){
                min=a[k];
            }
        }
        System.out.println(min);

    }
}
