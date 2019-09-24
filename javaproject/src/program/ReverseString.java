package program;

public class ReverseString {
	public static void main(String[] args) {
		String str="BINDIYA";
		String rev="";
		for(int i=str.length()-1; i >= 0; i--) 
		{
			rev = rev + str.charAt(i);
		}
		System.out.println("the reverse string is:"+rev);
		System.out.println(str.length());
	}

}
