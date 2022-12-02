package MethodWithReturnType;

public class Example1 
{
public static void main(String[] args) 
{
	int num1 =addition(10,20);
	System.out.println("num1");
	
	int num2=addition(5,6);
     System.out.println("num2");
	
	System.out.println("---");
	
	System.out.println(addition(100,200)); //300
	
	System.out.println(addition(8,9));  //17
	
}
	
	
	//method with int return type 
	public static int addition(int a, int b)//10,20
	{
	  int sum=a+b;  //10+20
	  return sum;
	
     }
	
	
	
	
	
}
