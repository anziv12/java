package polymorphism;

public class Division extends Addition {
	public void divi()
	{
	
	int k=super.sum();
	
	if (k%12==0)
		System.out.print(k + "is divisble");
	else 
		System.out.print(k +"not divsble");
}
public static void main(String[]args)
{
	Division objB=new Division();
	objB.divi();
}
	

}
