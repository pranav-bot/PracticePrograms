package com.pranav;

import java.util.Scanner;

public class PrimeNumbersBW2Numbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Starting point- ");
        int x=in.nextInt();
        System.out.print("Enter Ending point- ");
        int y= in.nextInt();
        for(int i=x;i!=y;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
            }
        }
    public static boolean isPrime(int n)
    {
        if (n<= 1)
        {
            return false;
        }
        for (int i = 2; i <=n/2; i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
