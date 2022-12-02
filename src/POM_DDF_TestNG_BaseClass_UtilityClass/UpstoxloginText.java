package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UpstoxloginText extends BaseClass
{  UpstoxLogin1Page login1;
   UpstoxLogin2Page  login2;
   UpstoxHomePage   Home;
   UpstoxWelcomePage welcome;
   
    @BeforeClass
	public void openBrowser() throws InterruptedException
	{
		initializeBrowser();
		login1=new  UpstoxLogin1Page(driver);
		login2=new  UpstoxLogin2Page(driver);
		Home=new UpstoxHomePage(driver);
		welcome=new  UpstoxWelcomePage(driver);
	}
	
	@BeforeMethod
	public void logintoUpstox() throws EncryptedDocumentException, IOException
	{
		login1.enterUN(UtilityClass.gettestdata(0, 0) );
		login1.enterPWD(UtilityClass.gettestdata(0, 1));
		login1.clickOnLoginBtn();
		login2.enterYOB(UtilityClass.gettestdata(0, 2));
		welcome.clickOnNoAmGood();
		
		}
	
	@Test
	public void verifymyaccount() throws EncryptedDocumentException, IOException
	{
		String actPN=Home.verifyUserID();
		String ExPN=UtilityClass.gettestdata(0, 3);
		Assert.assertEquals(actPN, ExPN,"Failed:ifResult is different");
		
	}

	@AfterMethod
    public void logout()
    {
		
    }
	
	@AfterClass
	public void closeBrowser()
	{
		
		
		
	}
	
	
	
}