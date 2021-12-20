package com.pranav;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i!=n;i++){
            String s= in.next();
            if(s.length()>10){
                char a=s.charAt(0);
                char b=s.charAt(s.length()-1);
                int c=s.length()-2;
                System.out.println(a+""+c+b);
            }
            else{
                System.out.println(s);
            }
        }
    }
}
