package Collection;

import  java.util.*;
public class CollectionSample 
{
	public static void main(String[] args)
	{
		ArrayList<String> l2 =new ArrayList<String>();
		l2.add("malayalam");
		l2.add("english");
		l2.add("hindi");//System.out.println(l2);
		Iterator<String>it =l2.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next()); 
	}

	}
}
