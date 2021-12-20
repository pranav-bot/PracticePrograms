package com.pranav;
import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i!=t;i++){
            int n= in.nextInt();
            int[] arr=new int[n];
            int[] l=new int[n];
            for(int j=0;j!=n;j++){
                arr[j]=in.nextInt();
                l[j]=1;
            }
            for(int j=0;j<n;j++){
                for(int k=0;k<j;k++){
                    if(arr[j]>=arr[k]){
                        l[j]=Math.max(l[k]+1,l[j]);
                    }
                }

            }

            System.out.println(l[n-1]);
        }
    }

}
