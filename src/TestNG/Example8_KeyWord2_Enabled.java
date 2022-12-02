package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example8_KeyWord2_Enabled 
{
	@Test
	public void TC1()
	{
		Reporter.log("--running TC1--", true);
	}
	public void TC2()
	{
		Reporter.log("running TC2", true);
	}
	public void TC3()
	{
		Reporter.log("running TC3", true);
	}

}
