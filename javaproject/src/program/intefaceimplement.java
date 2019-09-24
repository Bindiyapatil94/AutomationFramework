package program;

public class intefaceimplement implements interfacedemo{
	

	@Override
	public void demo(int a, int b) {
		
		int c=a+b;
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		intefaceimplement in=new intefaceimplement();
		in.demo(10, 20);
		interfacedemo.demo1();
	}
}

