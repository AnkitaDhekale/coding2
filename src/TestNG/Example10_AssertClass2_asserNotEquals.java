package TestNG;

import org.testng.Assert;

public class Example10_AssertClass2_asserNotEquals 
{

	public void asserEquals()
	{
		String actResult="Hi";
		String expResult="Hi";
		
		Assert.assertNotEquals(actResult, expResult,"Failed->bothresult are same:");
	}
	
	
	
	
	
	
	
	
}
