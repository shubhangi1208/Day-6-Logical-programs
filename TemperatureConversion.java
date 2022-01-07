package com.bridgelabz;
import java.util.*;
public class TemperatureConversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice \n 1. Fahrenheit to Celsius \n 2. Celsius to Fahrenheit");
        int choice = sc.nextInt();
        if (choice == 1){
            System.out.println("Enter temperature in Fahrenheit");
            int F = sc.nextInt();
            double Conv2Celsius = (double)(F-32)*5/9;
            System.out.println("Temperature in Celsius is " +Conv2Celsius);
        }

        else{
            System.out.println("Enter temperature in Celsius");
            int C = sc.nextInt();
            double Conv2Fahrenheit = (double)(C*9/5)+32;
            System.out.println("Temperature in Fahrenheit is " +Conv2Fahrenheit);

        }
    }
}

