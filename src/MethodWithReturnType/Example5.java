package MethodWithReturnType;

public class Example5
{
public static void main(String[] args) 
{
	Example5 s5=new Example5();
	
	int Length1=s5.getlength ("Ankitalokhande");
	
	int length=s5.getlength("Ankita");
	
	System.out.println(Length1);
	System.out.println(length);	
	
}
	
	



public int getlength(String name)
{
	int S1=name.length();
	return S1;		
			
}


}
