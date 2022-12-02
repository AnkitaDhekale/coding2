package Collection;

import java.util.LinkedHashSet;

import javax.swing.text.html.HTMLDocument.Iterator;


public class Example7_LinkedHashSet 
{
public static void main(String[] args) 
{
	LinkedHashSet lhs=new LinkedHashSet();
	lhs.add("Rahul");
	lhs.add(101);
	lhs.add('A');
	lhs.add(null);
	lhs.add(null);
	
	System.out.println(lhs);
	System.out.println(lhs.size());
	System.out.println(101);
	System.out.println(lhs.isEmpty());
	
	//remove info from haslhset
	lhs.remove('A');
	System.out.println(lhs);
	
	System.out.println("---print all data from  hashset using Iterator----");
	Iterator itr=(Iterator) lhs.iterator();
	while(((java.util.Iterator) itr).hasNext());
		{
		 System.out.println();
		}
	
	System.out.println("----print all data using for each---");
	for(Object s1:lhs)
	{
		System.out.println(s1);
	}
}



	
	
	
	
	
	
	
	
}
