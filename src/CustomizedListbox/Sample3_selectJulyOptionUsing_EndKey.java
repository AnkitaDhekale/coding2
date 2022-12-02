package CustomizedListbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample3_selectJulyOptionUsing_EndKey 
{
@SuppressWarnings("deprecation")
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	//step1:
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
	//step2:
	Actions act=new Actions(driver);
	
	//step3: 
	act.click(month).perform();
	Thread.sleep(3000);
	
	//navigate to last option using End Key
	act.sendKeys(Keys.END).perform();
	Thread.sleep(3000);
	
	//navigate to July Option using arrow UP key
	for(int i=1; i<=5; i++)
	{
		act.sendKeys(Keys.ARROW_UP).perform();
	}
	Thread.sleep(3000);
	
	//select Option using Enter key
	act.sendKeys(Keys.ENTER).perform();
	
	
	
}
	
	

}
