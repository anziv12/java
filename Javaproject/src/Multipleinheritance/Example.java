package Multipleinheritance;

public class Example implements Example1,Example2
{

	@Override
	public void to() 
	{
		System.out.println("malayalam");
	}

	@Override
	public void from() 
	{
		
	System.out.println("english");	
	}
	 public static void main(String[]args)
	 {
		 Example1 obj =new Example();
		 Example2 obj2 =new  Example();
				 obj.from();
				 obj2.to();
	 }

}
