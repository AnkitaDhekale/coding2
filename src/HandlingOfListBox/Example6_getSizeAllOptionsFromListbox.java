package HandlingOfListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example6_getSizeAllOptionsFromListbox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//click on create in account
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		 
	   Thread.sleep(3000);
	 
	   WebElement month=driver.findElement(By.xpath("//a[@id='month']"));
	
	Select s=new Select(month);
	
     int size=s.getOptions().size();
	System.out.println(size);
	
	   // List<WebElement>MultipleOption=s.getOptions();
	   //int size=MultipleOption.size();
	   // system.out.println(size);
	
	}	
}
