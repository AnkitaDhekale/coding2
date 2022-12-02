package MethodWithReturnType;

public class Example4 
{

	public static void main(String[] args) 
	{
		
		Example4 s4=new Example4();
		
		int length1= s4.getlength ("Ankita");
	
		System.out.println(length1);
		
		
		
		
		
		
		}
	
	public  int getlength(String name)
	{
	     int S1=name.length();
	     return S1;
	}
}
