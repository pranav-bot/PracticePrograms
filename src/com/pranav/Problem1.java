package com.pranav;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t= in.nextInt();
        for(int i=0;i!=t;i++){
            int x= in.nextInt();
            int p=in.nextInt();
            int a=p-x;
            if(a%2==0){
                System.out.println(a/2);
            }
            else if(a==1){
                System.out.println(2);
            }
            else{
                System.out.println((a/2)+2);
            }
        }
    }
}
