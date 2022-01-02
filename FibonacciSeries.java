import java.util.*;
public class FibonacciSeries {

	public static void main(String[] args) {
		int number1=0;
		int number2=1;
		int number3;
		int count=10;
		 System.out.print(number1+" "+number2);//printing 0 and 1    
		    
		 for(int i=2;i<count;i++)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  number3=number1+number2;    
		  System.out.print(" "+number3);    
		  number1=number2;    
		  number2=number3;    
		 }    
	        
	}

}
