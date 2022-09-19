package aggregation;
import java.util.Scanner;
public class Employee{
	public double bp,dm,bm;//instance variable
	Scanner sc=new Scanner (System.in);
	public void emp()//instance mthd
	{
		System.out.print("enter basic pay");
		this.bp=sc.nextDouble();
		System.out.print("enter deduction amount");
		this.dm=sc.nextDouble();
		System.out.print("enter bonus amount");
		this.bm=sc.nextDouble();
	}
	

}

