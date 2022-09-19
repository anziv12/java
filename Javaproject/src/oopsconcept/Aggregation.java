package oopsconcept;

public class Aggregation 
{
	double area(int a)
	
	{
		return square(a)*3.14;
	
	}
	public static void main(String[]args)
		{
			Aggregation ag=new Aggregation ();
			Square sq= new Square();
			System.out.println(ag.area(5));
		}
	}


