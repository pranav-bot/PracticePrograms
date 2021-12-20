package com.pranav;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
            int[] nums=new int[5];
            int target=in.nextInt();
            int[] ans=new int[2];
            for(int i=0;i!= nums.length;i++){
                for(int j=i+1;j!=nums.length;j++){
                    if (target==nums[i]+nums[j]){
                        ans[0]=i;
                        ans[1]=j;
                    }
                }
            }
        }
        }
