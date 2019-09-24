package program;

public class Discount {

	public static void main(String[] args) {
		double discount=0;
		String Amount="$101.00";
		String updateed=Amount.replace("$","");
		double actamount=Double.parseDouble(updateed);
		System.out.println(actamount);
		if(actamount>100)
		{
			discount=((actamount/100)*10);
			System.out.println("10% discount");
		}
		else if(actamount<100 && actamount>0)
		{
			discount=((actamount/100)*5);
			System.out.println("5% discount");
		}
		else  {
			System.out.println("discont is not allowded");
		}
		

	}

}
