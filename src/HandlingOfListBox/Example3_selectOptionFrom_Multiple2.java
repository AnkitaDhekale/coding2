package HandlingOfListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example3_selectOptionFrom_Multiple2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Amruta/Desktop/New%20html/ListboxHtml.html");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']"));
		 Thread.sleep(3000);
		
		//step1:
		 WebElement selectCountry=driver.findElement(By.xpath("//select[@id='month']"));
		
		//step2: s=new Select(month);
		 
		 Select s = null;
		//step:3
		boolean result =s.isMultiple();
		System.out.println(result);
		if(result==true)
		{
			System.out.println("Listbox is of multi-selectable");
		}
		else
		{
			System.out.println("Listbox is of single selectable");
		}
		
		
		
	}


	}

	
	
	
	
	
	
	
	
	
	
	
	

