package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example11_grouping2 
{
@Test(groups="wishlist")
public void TC1()
{
	Reporter.log("running TC1", true);
}
@Test(groups="profile")	
public void TC2()
{
Reporter.log("running TC2", true);	
}	
@Test(groups="profile")
public void TC3()
{
Reporter.log("running TC3", true);	
}
@Test(groups="fund")
public void TC4()	
{
Reporter.log("running TC4",true);	
}
	
}