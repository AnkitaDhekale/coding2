package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example6_EmailableReport1 
{
     @Test                                                            
	public void TC4()                                            //TC4=test case method
	{
    	 Reporter.log("running test case 4",true);
	}
	@Test
	public void TC5()                                           //TC4=test case method

	{
	   Reporter.log("running test case 5", true);
	}
	@Test
	public void TC6()                                           //TC4=test case method
	{
		Reporter.log("running test case 6", true);
	}
	
	
	
}
