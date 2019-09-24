package program;

public class Separate_int_char_from_string {

	public static void main(String[] args)
	{
		String s="Bindiya   1994$shrungari#1993";
		String s1=s.replaceAll("\\d", "");
		String s2=s.replaceAll("\\D", "");
		String s3=s.replaceAll("\\s", "");
		String s4=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s4);
		System.out.println(s3);
		System.out.println(s1);
		System.out.println(s2);
	}

}
