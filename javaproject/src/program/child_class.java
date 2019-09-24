package program;

public class child_class extends parent_class {

	public child_class()
	{
		System.out.println("child class constructor");
	}
	static
	{
		System.out.println("child static block");

	}
	static
	{
		System.out.println("child static block 2");
	}
	{
		System.out.println("child instance block");
	}

	public static void data()
	{
		System.out.println("child static method");
	}
	public void data1()
	{
		System.out.println("child instance method");
	}
	public static void main(String[] args) {

		child_class ch= new child_class();
		ch.data1();
	}

}
