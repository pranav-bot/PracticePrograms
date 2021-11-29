package com.pranav;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        check(1,2,3,4,5,6,67,7,8,8,9,9,0,0,1);
    }
    static void check(int ...a){
        System.out.println(Arrays.toString(a));
    }
}
