package program;

public class SumOfDigit {
	
		static int a=145;
		static int temp;
		static int sum=0;
		public static void main(String[] args) {
			while(a>0)
			{
				temp=a%10;
				sum=sum+temp;
				a=a/10;
			}
			System.out.println("sum of digit is:"+sum);
		
	}

}
