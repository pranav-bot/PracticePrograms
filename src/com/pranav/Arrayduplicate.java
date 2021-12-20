package com.pranav;

import java.util.Arrays;

public class Arrayduplicate {
    public static void main(String[] args) {
        int[] num = {1, 2, 3};
        int[] arr = new int[num.length + 1];
        for(int i=0;i!= num.length;i++){
            arr[i]=num[i];
        }
        System.out.println(Arrays.toString(arr));

    }
}
