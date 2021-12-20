package com.pranav;

import java.util.Arrays;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String al="abcdefghijklmnopqrstuvwxyz";
        int[] arr=new int[26];
        for(int i=0;i!=26;i++){
            arr[i]= in.nextInt();
        }
        String s= in.next();
        int[] arr1=new int[s.length()];
        for(int i=0;i!=s.length();i++){
            for(int j=0;j!=al.length();j++){
                if(s.charAt(i)==al.charAt(j)){
                    arr1[i]=arr[j];
                }
            }
        }
        int max=arr1[0];
        for(int i=1;i!=arr1.length;i++){
            if(arr1[i]>max){
                max=arr1[i];
            }
    }
        System.out.println(max*s.length());

    }
}
