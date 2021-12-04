package com.pranav;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseofArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter size of array- ");
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i!=n;i++) {
            System.out.print("Enter element "+ (i+1)+"- ");
            arr[i] = in.nextInt();
        }
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int [] arr){
        int s=0;
        int e= arr.length-1;
        int temp=0;
        while(s<e){
            temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s=s+1;
            e=e-1;
        }
    }
}
