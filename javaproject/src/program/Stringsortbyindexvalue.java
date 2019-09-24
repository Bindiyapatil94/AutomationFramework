package program;

public class Stringsortbyindexvalue {
	public static void main(String[] args) {
		
	
	String s1="I am an engineer";
	String[] str=s1.split("\\s");
	String str1="";
	for(int i=0; i<str.length; i++)
	{
     str1=str1+str[i];
     
	}
	 System.out.println(str1);

	}
}
