package inheritance;


public class Hierarchial3 extends Hierarchial{
	void hlw()
	{
		System.out.println("passout");
	}
	
public static void main(String[]args)
{
	Hierarchial3 obj=new Hierarchial3();
	Hierarchial2 obj1=new Hierarchial2();
	obj1.add();
	obj.sum();
	obj.hlw();
	
}

}
