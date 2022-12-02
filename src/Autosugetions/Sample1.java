package Autosugetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	//enter mob name
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("redmi");

	Thread.sleep(1000);
	
	List<WebElement> allOptions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
	
		String expText="redmi k50i";
		for(WebElement s1: allOptions)
		{
			String actText = s1.getText();
			if(actText.equals(expText))
			{
				s1.click();
				break;
			}
		}

	    		
	    	}
	    
	    

}
	
	
	
	
	
	
	
	
	
	
	

