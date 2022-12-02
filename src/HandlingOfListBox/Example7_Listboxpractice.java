package HandlingOfListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example7_Listboxpractice 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("Webdrive.Chrome.drive", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/login/");
	
	//click on create new acc link
	driver.findElement(By.xpath("//a[text()='Create New Account']"));
	
	Thread.sleep(3000);
	
	 WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
	
	Select s=new Select(month);
	
	int size =s.getOptions().size();
	System.out.println(size);
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
