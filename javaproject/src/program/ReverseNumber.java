package program;

public class ReverseNumber {
	public static void main(String[] args) {

	int number=1234;
	int revnumber=0;
	int temp=0;
	{
	while(number>0)
	{
		temp=number%10;
		//create the reverse number
		revnumber=revnumber*10+temp;
		number=number/10;
		
	}
	System.out.println("reverse number is:"+revnumber);
	}
	}
}
