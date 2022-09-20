package Collection;

import java.util.*;

public class ListCollection 
{

	public static void main(String[] args)
	{
		
	
		ArrayList<String> list= new ArrayList <String>();
		list.add("anzi");
		list.add("ayaan");
		Iterator<String> itr =list.iterator();
	
		while(itr.hasNext())
		{
			System.out.println(itr.next()); 
		
			}  
			
	System.out.println("each method");
	for(String a:list)
	{
		System.out.println(a);
	}



			
		
		
		
		
		
	
	}

}
