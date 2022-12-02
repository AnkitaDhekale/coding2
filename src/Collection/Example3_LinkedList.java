package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Example3_LinkedList 
{

	public static void main(String[] args) 
	{
		
		LinkedList LL=new LinkedList();  
		 LL.add("Rahul");
		 LL.add("101");
		 LL.add('A');
		 LL.add(65.5f);
		 LL.add("Rahul");
		 LL.add(null);
		 LL.add(null) ;
		 
		System.out.println(LL);
		 System.out.println(LL.size());
		 System.out.println(LL.isEmpty());//false
		 System.out.println(LL.contains(101));//true
		 System.out.println(LL.get(3));  //65.5
		 
		 //remove/delete info in between LinkedList  info in between LinkList
		   LL.remove(4);
		   System.out.println(LL);
          //modify /update info LL.set(0,"Ramesh")
		   LL.set(0, "Ramesh");
		   System.out.println(LL);
		   
		   System.out.println("---print all data using lterator cursor---");
		   Iterator itr=LL.iterator();
		  while(itr.hasNext())
			  {
			   System.out.println(itr.next());
			   }
		     System.out.println("----print all data using for loop---");
		    for(int i=0;i<=LL.size()-1;i++)
		    {
		    	System.out.println(LL.get(i));
		    }	
		     System.out.println("---print all data using foreach loop----");	
		    for(Object s1:LL)
		    {
		    	System.out.println(s1);
		    }
		     
		     
		    
		    	
		    }
		  
		  
		  } 
			  
	
	
	
	
	
	
	
	
	
	
	
	

