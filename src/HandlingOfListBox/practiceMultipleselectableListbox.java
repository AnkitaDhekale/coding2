package HandlingOfListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practiceMultipleselectableListbox 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/Amruta/Desktop/New%20html/ListboxHtml.html");
	
	        WebElement SelectCountry=driver.findElement(By.xpath("//select[@id='name']"));
	
	        Select s=new  Select( SelectCountry);
	      
	       // s.selectByIndex(2);
	       // s.selectByIndex(0);
	       // s.selectByIndex(1);
	        
	       String text=s.getFirstSelectedOption().getText();
	       System.out.println(text);
	       
}
	
	
	
	
	
}
