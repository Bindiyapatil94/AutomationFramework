package program;

public class parent_class {
	
	public parent_class()
	{
		System.out.println("parent class constructor");
	}
	
	static 
	{
		System.out.println("parent static block");
	
	}
	{
		System.out.println("parent instance block");
	}
	public static void demo()
	{
		System.out.println("static method");
	}
	public void demo1()
	{
		System.out.println("instance method");
	}

	public static void main(String[] args) {
		 parent_class ps= new  parent_class();
		 ps.demo1();
		 demo();
	}

}
