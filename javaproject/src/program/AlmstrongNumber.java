package program;

public class AlmstrongNumber {
	public static void main(String[] args) {
		int n=153;
		int a=0,c;
		int temp=n;
		while(n>0)
		{
			c=n%10;
			a=a+(c*c*c);
			n=n/10;
			
		}
		if(temp==a)
		{
			System.out.println("number is almstrong number");
		}
		else{
			System.out.println("number is not almstrong number");
		}
		
	}

}
