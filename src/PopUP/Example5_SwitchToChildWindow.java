package PopUP;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example5_SwitchToChildWindow 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("Webdriver.chrome.driver", "  C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	//click on "New Tab"from main page
	driver.get("https://skpatro.github.io/demo/links/");
	
	//click on "New Tab" from main page
	driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	
	//get child window ID
	Set<String> allIds = driver.getWindowHandles();       //{mainPageID, childWindowID}
	ArrayList<String> al=new ArrayList<String>(allIds);   //{mainPageID(0), childWindowID(1)}
	
	//switch to child window
	driver.switchTo().window(al.get(1));         //String childWindowID
	
	//click on 'Training' link from child window
	driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	
	
	//switch to main page
	driver.switchTo().window(al.get(0));            //String mainPageID
	
	Thread.sleep(3000);
	
	//click on "New Window" from main page
	driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
	
}
	
}
	
	
	
	
	
	
	
	

