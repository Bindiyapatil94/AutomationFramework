package program;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		int n;
		int i=1;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		n=sc.nextInt();
		
		while(i<n)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		if(sum==n)
		{
			System.out.println("number is perfect number");
		}
		else
		{
			System.out.println("number is not perfect");
			
		}
		
	}

}
