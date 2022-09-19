package Multipleinheritance;

public class Calculate implements Sum, Addition// implementing 2 interface into the class
{

	@Override
	public void b() {
		System.out.println("barrier");

	}

	@Override
	public void a() {
		System.out.println("admitter");
	}

	public static void main(String[] args)// main method
	{
		Addition obj = new Calculate();
		Sum obj1 = new Calculate();
		obj1.a();// reference of B
		obj.b();// reference of A

	}
}
