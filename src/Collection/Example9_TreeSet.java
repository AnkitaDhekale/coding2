package Collection;

import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;


public class Example9_TreeSet 
{

	public static void main(String[] args) 
	{
		
		TreeSet tr=new TreeSet();
		tr.add(500);
		tr.add(600);
		tr.add(100);
		tr.add(200);
		tr.add(300);
		tr.add(700);
		tr.add(400);
		tr.add(100);
		//tr.add(null)
		
		System.out.println(tr);
		System.out.println(tr.size());
		System.out.println(tr.isEmpty());
		System.out.println(tr.contains(100));
		System.out.println(400);
		System.out.println(tr);
		
		tr.pollFirst(); //remove 1st element from treeset
		System.out.println(tr);
		
		tr.pollLast(); //remove last element from treeset
		System.out.println(tr);
		
		System.out.println("---print data using iterator cursor---");
		
		Iterator itr=(Iterator) tr.iterator();
		  while(((java.util.Iterator) itr).hasNext());
			{
			{
			  System.out.println();
			}
		 System.out.println("---print all data using f0reach---");
		 for(Object s1:tr)

		 {
			 System.out.println(s1);
		 }
		 
		
		
			}		
		
		
		
		
		
		
	}	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	


