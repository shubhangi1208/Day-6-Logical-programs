import java.util.*;
public class perfectNumber {

	public static void main(String[] args) {
		int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int i=1;
        while(i <= n/2)
        {
            if(n % i == 0)
            {
                sum = sum + i; //calculates the sum of factors
            }
            i++;
        }
        if(sum==n)  //compares sum with the number
        {
            System.out.println(n+" is a perfect number.");
        }
        else
            System.out.println(n+" is not a perfect number.");

	}

}
