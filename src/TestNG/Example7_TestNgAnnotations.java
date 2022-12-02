package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example7_TestNgAnnotations 
{
 @BeforeClass
 public void openBrowser()	
 {
	Reporter.log("-----------openbrowser--------", true);
 }
 @BeforeMethod
public void loginToApp()	
{
	Reporter.log("---login to App----", true); 
}
 @Test
 public void VerifyUserID()
 {
	Reporter.log("running verify userID", true); 
 }
 @AfterMethod
 public void LogoutfromApp()
 {
	 Reporter.log("running logout from app",true);
 }	 
	@AfterClass 
public void closeBrowser()	 
{
	Reporter.log("-------close Browser", true);
} 
	}

 

