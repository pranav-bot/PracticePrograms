package com.pranav;

import java.util.Scanner;

public class ArmstrongNumbersBetween2Numbers {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter Starting point");
        int x=in.nextInt();
        System.out.println("Enter Ending Point");
        int y= in.nextInt();
        for(int i=x;i!=y;i++){
            if(checker(i)){
                System.out.println(i);
            }
        }
    }
    static boolean checker(int x){
        int sum=0;
        int temp=x;
        boolean a= false;
        for(int i=0;x>0;i++){
            int c=x%10;
            sum=sum+(c*c*c);
            x=x/10;
        }
        if(sum==temp){
            a=true;
        }
        return a;
    }
}
