package program;



public class Employee {
	public Employee calSalary()
	{
		System.out.println("ddvcjdn");
		return new Employee();
	}

}
class Manager extends Employee
{
	public Manager calSalary()
	{
		System.out.println("xvcdcdv");
		return new Manager();
	}
	
public static void main(String[]args)
{
	Manager em=new Manager();
	em.calSalary();
	}
}