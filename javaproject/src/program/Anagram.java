 package program;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String str1="coal";  //declare both the string
		String str2="cola";
		
		
		System.out.println("both strings are anagrme:"+AnagramCheck(str1,str2));
		
		}
	public static boolean AnagramCheck(String str1,String str2)
	{
		char[] String1=str1.toCharArray(); //convert string to char array by using toCharArray method
		char[] String2=str2.toCharArray(); //convert string to char array
		Arrays.sort(String1); //sort char array by using sort method
		Arrays.sort(String2); //sort char array by using sort method
		return Arrays.equals(String1, String2);//compare both char array by using array equals method
		
	}

}
