package com.pranav;

import java.util.Arrays;
import java.util.Scanner;

public class Problem10{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Long n= in.nextLong();
        int count =0;
        while(n>0){
            Long rem=n%10;
            if(rem==4){
                count++;
            }
            else if(rem==7){
                count++;
            }
            n=n/10;
        }
        if(count==4){
            System.out.println("YES");
        }
        else if(count==7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
