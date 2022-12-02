package Collection;

import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;


public class Example5_HashSet 
{
public static void main(String[] args) 
{
	HashSet hs=new HashSet();
	
	hs.add("rahul");
	hs.add(101);
	hs.add(65.5);
	hs.add(null);
	hs.add(null);
	
	System.out.println(hs);
	System.out.println(hs.size());
	System.out.println(hs.isEmpty());
	System.out.println(hs.contains(101));

	//remove all info from hashset
	hs.remove('A');
	System.out.println(hs);
	
	System.out.println("---print all data from hashset using iterator --");
	Iterator itr=(Iterator) hs.iterator();
	while(((java.util.Iterator) itr).hasNext());
	{
		System.out.println();
	}
	
	System.out.println("--print all data using foreach--");
	for(Object s1:hs)
	{
		System.out.println(s1);
	}
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
}
