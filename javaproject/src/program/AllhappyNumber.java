package program;

public class AllhappyNumber {
	public static void main(String[] args) {
		int num;
		int limit=100;
		int temp,i ,sum=0;
		for(i=1;i<=limit;i++)
		{ 
			num=i;
			while(num>0)
			{
				temp=num%10;
				sum=temp*temp;
				num=num/10;
			}
			num=sum;
			if(sum==1)
			{
				System.out.println("all the happy number:"+i);
			}
	}
	}
	

}
