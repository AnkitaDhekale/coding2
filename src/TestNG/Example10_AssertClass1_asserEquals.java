package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example10_AssertClass1_asserEquals 
{
    @Test
	public void asserEquals()
	{
    	String actResult="Hi";
    	String expResult="Hello";
    	
    	Assert.assertEquals(actResult, expResult,"Failed:both result are different:");
    	
	}
	
	
	
	
}
