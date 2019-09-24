package program;

import java.util.Scanner;

public class EvenOddNumber {
	
	public static void main(String[] args) {
		
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter integer");
		x=sc.nextInt();
		if(x%2==0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is odd");
		}
		
	}

}
