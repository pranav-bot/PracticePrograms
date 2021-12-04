package com.pranav;

import java.util.Arrays;
import java.util.Scanner;

public class SwappinginArray {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter size of array- ");
        int n= in.nextInt();
        int[] arr =new int[n];
        for(int i=0;i!=n;i++){
            System.out.println("Enter element "+(i+1)+"- ");
            arr[i]=in.nextInt();
        }
        System.out.println("Enter first index- ");
        int x= in.nextInt();
        System.out.println("Enter second index- ");
        int y=in.nextInt();
        swap(arr,x-1,y-1);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] a,int b,int c){
        int temp=0;
        temp=a[b];
        a[b]=a[c];
        a[c]=temp;
    }
}
