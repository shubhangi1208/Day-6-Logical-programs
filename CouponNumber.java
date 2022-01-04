package com.bridgelabz;
import java.util.*;

public class CouponNumber {

		public String createRandomCode(int codeLength) {
			
	        //Collection of Values among which Random Coupon Value Generated
	        char[] chars = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	        String s = "";
	        Random random = new Random();
	        for (int i = 0; i < codeLength; i++)
	        {
	            char c = chars[random.nextInt(chars.length)];  //Accessing the char value from array index
	            s=s+c;
	        }
	        return s ;
	    }

	    
	    public static void main(String args[])
	    {
	        System.out.println("Welcome to Program for Generating 10 Unique Coupon Code");

	        CouponNumber cn = new CouponNumber();

	        //Generating 10 Unique Coupon Code
	        for(int i=1;i<=10;i++) {
	            String couponCode = cn.createRandomCode(6);   //Passing value 6 as Length of Coupon Code
	            System.out.println("COUPON NUMBER = "+couponCode);
	        }
		
	}

}
