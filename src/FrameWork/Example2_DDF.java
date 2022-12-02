package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_DDF 
{
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
{
	FileInputStream file=new FileInputStream("C:\\Selenium\\Book1.xlsx");
	Sheet sh=WorkbookFactory.create(file).getSheet("DDF");
	
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.saucedemo.com/");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//enter UN
	String Username=sh.getRow(0).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys();
	
	//enter PW
	String Password=sh.getRow(0).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(args);
	
	//click on login btn
	
	driver.findElement(By.xpath("//input[@name='login-button']")).click();
	
	
	boolean result=driver.findElement(By.xpath("//div[@class='bot_column']")).isDisplayed();
	
	if(result==true)
	{
		System.out.println("Logo Found -->TC Pass");
	}
	
	else
	{
		System.out.println("Logo not Found--->TC Fail");
	}
	
	Thread.sleep(3000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
}
