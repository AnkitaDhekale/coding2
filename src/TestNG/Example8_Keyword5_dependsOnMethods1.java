package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example8_Keyword5_dependsOnMethods1 
{
@Test
public void login()	
{
	Reporter.log("running login", true);
}
@Test(dependsOnMethods= {"login"})
public void Logout()
{
	Reporter.log("running logout", true);
}

}
