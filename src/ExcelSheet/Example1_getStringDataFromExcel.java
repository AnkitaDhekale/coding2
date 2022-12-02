package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;

public class Example1_getStringDataFromExcel 
{
public static void main(String[] args) throws IOException 
{
	FileInputStream file=new FileInputStream("C:\\Selenium\\Book1.xlsx");
	
       XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
	XSSFSheet s=xssfWorkbook.getSheet("Sheet1");
	          String Value =s.getRow(0).getCell(0).getStringCellValue();
   
	System.out.println(Value);
	
	
}
	
	
}
