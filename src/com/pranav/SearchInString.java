package com.pranav;

public class SearchInString {
    public static void main(String[] args) {
        String name="abcdefghijklmnopqrstuvwxy";
        char t='a';
        System.out.println(search(name,t));

    }
    static boolean search(String str, char target){
        if(str==null){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
}
