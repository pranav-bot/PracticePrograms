package com.pranav;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a={1,2,3,4,4,5,6,7,7,8,9,9,87,5,4,3,2,4,5,3,3,4,3,34,3,4,3,4,3343,4,3,43,3,2,4,55,5,68,9786,980,768,7453,54};
        int t=7;
        System.out.println(linearsearch(a,t));

    }
    static int linearsearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i< arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
