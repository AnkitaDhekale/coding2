package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Example10_SoftAssertClass1 
{
     @Test
	public void TC()
	{
	SoftAssert soft=new SoftAssert();
	
	boolean actResult1=true;
	
	soft.assertFalse(actResult1,"Failed1->actResult is true:");
	
	String actResult="Hi";
	String expResult="Hello";
	soft.assertEquals(actResult, expResult,"Failed2:both results are different :");
	
	 soft.assertAll();
	}
	
	
	
	
	
	
}
