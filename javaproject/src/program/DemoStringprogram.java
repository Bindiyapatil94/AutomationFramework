package program;

public class DemoStringprogram {

	public static void main(String[] args) {
     String s1="hello";
     String s4="hello";
     String s2="Hello";
     String s3=new String("hello");
     System.out.println(s1==s2);
     System.out.println(s1.equals(s2));
     System.out.println(s2.equals(s3));
     System.out.println(s1.equals(s4));
     System.out.println(s1.equals(s3));
	}

}
