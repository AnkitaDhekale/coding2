package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example3_EmailableReport 
{
	@Test
	public void TC1()                                       //TC1 =  test case or test method
	{
		Reporter.log("running test case 1",true);
	}
	
	@Test
	public void TC2()                                       //TC1 =  test case or test method
	{
		Reporter.log("running test case 2",true);
	}
	
	@Test
	public void TC3()                                       //TC1 =  test case or test method
	{
		Reporter.log("running test case 3",true);
	}
	
	
	
	
}
