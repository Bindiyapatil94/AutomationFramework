package program;

public class reversestringdemo {

	public static void main(String[] args) {
		String str="I am an Engineer";
		String[] s1=str.split("\\s");
	
		String rev="";
		for(int i=s1.length-1;i>=0;i--)
		{
			rev=rev+s1[i]+" ";
	    }
		System.out.println(rev); 

	}

}
