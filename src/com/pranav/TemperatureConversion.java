package com.pranav;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose Option-");
        System.out.println("1.Celsius to farhaneit");
        System.out.println("2.Farhaneit to Celsius");
        System.out.println("3.None of the above");
        int a = input.nextInt();
        if(a==1){
            System.out.println("Enter Temperature in Celsius");
            Double TempCelsius = input.nextDouble();
            TempCelsius = (TempCelsius*1.8) + 32;
            System.out.println(TempCelsius + "F");

            }
        if(a==2){
            System.out.println("Enter Temperature in Farhaneit");
            Double TempF = input.nextDouble();
            TempF = (TempF - 32)* 0.556;
            System.out.println(TempF + "C");

        }
        else{
            System.out.println("Program Ended");


        }





    }
}
