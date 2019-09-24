package program;

import java.util.Scanner;

public class SwappngValue {
	public static void main(String[] args) {
		int x;
		int y;
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values of x and y");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println(x);
		System.out.println(y);
		temp=x;
		x=y;
		y=temp;
		System.out.println(x);
		System.out.println(y);
		
		
	}

}
