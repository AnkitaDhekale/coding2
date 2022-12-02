package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example8_Keyword5_dependsOnMethod2 
{
	@Test
public void login1()
{
	Reporter.log("running login1", true);
}
	@Test
public void login2()	
{
	Reporter.log("running login2", true);
}
	@Test(dependsOnMethods= {"login1","login2"})
public void Logout()
{
	Reporter.log("running logout",true);	
}
}
