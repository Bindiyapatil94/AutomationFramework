package program;

public class palindromeNumber {
	public static void main(String[] args) {
		int n=121;
		int sum=0,temp;
		int rem;
		temp=n;
		while(n>0)
		{
			rem=n%10;
			
			sum= (sum*10)+rem;
			n=n/10;
		}
		if(temp==sum){
			System.out.println("number is palindrome number");
			
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
