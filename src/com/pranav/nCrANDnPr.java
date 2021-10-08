package com.pranav;

import java.util.Scanner;

public class nCrANDnPr {
    public static void main(String[] args) {
        int n,r;
        Scanner in = new Scanner(System.in);
        n= in.nextInt();
        r= in.nextInt();
        int c=n-r;
        int i=1;
        int j=1;
        int k=1;
        int a=1;
        int b=1;
        int d=1;
        while(i<=n){
            a=a*i;
            i++;
        }
        while(j<=r){
            b=b*j;
            j++;
        }
        while(k<=c){
            d=d*k;
            k++;
        }
        long ncr=a/(b*d);
        long npr=a/d;
        System.out.println(ncr);
        System.out.println(npr);

    }
}
