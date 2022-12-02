package HandlingOfListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example4_getSelectedOption_FromSingleSelectableListbox 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/login/");
	
	//click on create new account
	   driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	 
	    WebElement Month=driver.findElement(By.xpath("//select[@id='month']"));
	   
		Select s=new Select(Month);
	    
       String text=s.getFirstSelectedOption().getText();
       System.out.println("text");
       
     //  WebElement selectedOption=s.getFirstSelectedOption();
      // String text=SelectedOption.getText();
       //sysem.out.println(text);
     
 
}      
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
    		   
    		   
}
	
	
	
	
	

