package com.pranav;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n= in.nextInt();
        int m= in.nextInt();
        String[][] arr=new String[n][m];
        for(int i=0;i!=n;i++){
            for(int j=0;j!=m;j++){
                arr[i][j]=in.next();
            }
        }
        boolean a=true;
        for(int i=0;i!=n;i++){
            for(int j=0;j!=m;j++){
                if(arr[i][j]!="B"){
                    a=false;
                }
                else if(arr[i][j]!="G"){
                    a=false;
                }
                else if(arr[i][j]!="W"){
                    a=false;
                }
            }

        }
        if(a=true){
            System.out.println("#Color");
        }
        else{
            System.out.println("#Black&White");
        }
    }
}
