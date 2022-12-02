package Collection;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;


public class Example8_ArrayList 
{
public static void main(String[] args) 
{
	ArrayList ar=new ArrayList();
	ar.add("Ankita");
	ar.add(101);
	ar.add(null);
	ar.add(null);
	ar.add('A');
	
	System.out.println(ar);
	System.out.println(ar.size());
	System.out.println(ar.isEmpty());
	System.out.println(101);
	System.out.println('A');
	
	//remove ArrayList from Iterator
	ar.remove('A');
      System.out.println(ar);
	
      System.out.println("--print all info arraylist using iterator---");
      Iterator  itr=(Iterator) ar.iterator();
      while(((java.util.Iterator) itr).hasNext());
		{
      {
    	  System.out.println();
      }
    	  
    	System.out.println("--print all data using each---");  
    	for(Object s1:ar)  
    		System.out.println(s1);
}
	
	
	
}
}	
	

