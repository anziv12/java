package Interface;

public class Banking  implements RBL{

	@Override
	public void test() {
	
	int bal =1000;
	System.out.println("calculate amount "+(bal*5)/100);
}

	public static void main(String[]args)
	{
		RBL obj = new Banking();
		obj.test();
	}
	
	
	
}

