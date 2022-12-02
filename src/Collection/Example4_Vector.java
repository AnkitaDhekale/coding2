package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;



public class Example4_Vector 
{
	public static void main(String[] args) 
	{
		
		Vector V=new Vector();  
		 V.add("Rahul");
		 V.add("101");
		 V.add('A');
		 V.add(65.5f);
		 V.add("Rahul");
		 V.add(null);
		 V.add(null) ;
		 
		System.out.println(V.capacity());
		 System.out.println(V);
		 System.out.println(V.isEmpty());//false
		 System.out.println(V.contains(101));//true
		 System.out.println(V.get(3));  //65.5
		 
		 //add info in between Vector --->Right shift operation
	      V.remove(4);
	     System.out.println(V);
	     V.add(4,"mahesh");
	     System.out.println(V);
	     System.out.println("----print VI info from Vector using iterator cursor --");
	     Iterator itr=V.iterator();
	     while(itr.hasNext())//true false
	     {
	       System.out.println(itr.next());
	     }
	    System.out.println("---print VI info from Vector using Listlterator cursor---");
	    ListIterator litr=(ListIterator) V.iterator();
	    while(litr.hasNext())
	    	{
	    	  System.out.println(litr.next());
	    	}
	       System.out.println("--print VI data using  for loop---");
	       for(Object s1:V)
	       {
	    	   System.out.println(s1);
	       }
	       System.out.println("---print all data using enumeration cursor---");
	       Enumeration enu= V.elements();
	       while(enu.hasMoreElements());
	       {
	    	   System.out.println(enu.nextElement());
	       }
	    	}
	
	
	
	
	
	
}
