package Multipleinheritance;

public class SampleC implements SampleA,SampleB

{

	@Override
	public void m2() {
		System.out.println("show");
	}

	@Override
	public void m1() {
	System.out.println("test");	
		
	}
	public static void main(String[]args)
	{
		SampleA obj =new SampleC();
		SampleB obj2 =new SampleC();
		obj.m1();
        obj2.m2();
	}
	
}
