package program;

public class Demoprogram {

	/**
	 * <h1>Test Method</h1>
	 * this method will add some no's
	 * <p>sdbvhjasbdvbsdavbasdjvbja</p>
	 * @param intiger a
	 * @return sum of integer
	 * @since27-07-2019
	 * @author shri sai
	 */
	public static int test(int a)
	{
		int b = a+a;
		int c= a*a;
		System.out.println(b);
		System.out.println(c);

		return b;
	}
	public static void main(String[] args) {
		String s="abc7xyz11";
        int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char a=s.charAt(i);
			if(Character.isDigit(a))
			{
				int b=Integer.parseInt(String.valueOf(a));
				sum=sum+b;
			}
			
		}
		System.out.println(sum);
		test(10);
		
		
		}

}
