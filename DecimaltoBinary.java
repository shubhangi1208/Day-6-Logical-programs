package com.bridgelabz;
import java.util.*;

public class DecimaltoBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal Number :");
        int num = sc.nextInt();
        int temp = num , i = 0, j = 0;

        //Initializing array for Storing Binary numbers
        int[] arr = new int[8];

        while(temp != 0) {
            arr[i] = temp % 2;
            temp = temp / 2;
            i++;
        }
        //Printing the Binary and Decimal Compositions
        for(j = i-1; j >= 0; j--) {
//             System.out.println(arr[j]);
            if(arr[j] == 1) {
                int no =(int) Math.pow(2,j);
                System.out.println(arr[j]+"\t"+no);
            } else {
                System.out.println(arr[j]+"\t0");
            }
        }
    }
    }

