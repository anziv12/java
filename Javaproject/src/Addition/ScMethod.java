package Addition;
import java.util.Scanner;
public class ScMethod {
	
	public static void main(String[]args)
	
	{
		int a,b,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		a=sc.nextInt();
		System.out.println("Enter the second number");
		b=sc.nextInt();
		sum =sum(a,b);
		System.out.println("the sum of two numbers a,b is: "+sum);
	}


	public static int sum(int a,int b) {
		int sum=a+b;
		return sum;
		
		
	}

}
