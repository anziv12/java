package inheritance;

public class single2 extends single {//extends the first class 
	
	void add()
	{
		
		System.out.println("age is 22");
	}
	public static void main(String[]args)
	{
		
		   single2 obj=new single2();
		   obj.add();//age is 22
		   obj.sum();//my name is 
		   
				
	}
}
