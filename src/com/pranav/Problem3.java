package com.pranav;

import java.util.Arrays;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int t1=1;
        int t2=1;
        int[] arr=new int[n];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i!=n;i++){
            int sum=t1+t2;
            arr[i]=sum;
            t1=t2;
            t2=sum;
        }
        for(int i=0;i<arr.length;i++)
        {
            int z=arr[i];
            for(int j=0;j<z;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
