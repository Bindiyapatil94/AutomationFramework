package program;

import java.util.Scanner;


public class PrimeNumber {
	public static void main(String[] args) {
		int n,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		n=sc.nextInt();
		for( i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				i++;
			}
		}
		if(i==2)
		{
			System.out.println("number is prime");
			
		}
		else
		{
			System.out.println("number is nonprime");
		}
		
		
	}

}
