package program;

public class HappyNumber {
	static int n=19;
	static int sum=0;
	static int temp;
	public static void main(String[] args) {
		
//		19=1*1+9*9=82
//		82=8*8+2*2=68
//		68=6*6+8*8=100
//		100=1*1+0+0=1
			while(n>0)
			{
			temp= n%10;
			sum= (temp*temp);
			n=n/10;
			}
			n=sum;
		
			if(sum==1)
			{
				System.out.println("happy number");
			}
			else
			{
				System.out.println("unhappy number");
			}
		}
		
	}

