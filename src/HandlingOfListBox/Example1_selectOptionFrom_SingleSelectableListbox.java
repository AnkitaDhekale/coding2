package HandlingOfListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example1_selectOptionFrom_SingleSelectableListbox 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
    
	//click on create new acc link 
	driver.findElement(By.xpath("//a[text()='Create New Account']"));
	
	//step 1:
	WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
			
	//step 2: s=new Select(month);
	
	//step3:
	//s.selectByVisibleText("Dec"); //String text
	//s.selectByValue("12");  //String value
	//s.selectByIndex(3);    //int index
	
	
	
	
	
	
	
}
	
	
	
	
	
}
