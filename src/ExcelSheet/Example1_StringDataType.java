package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.management.OperatingSystemMXBean;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class Example1_StringDataType 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file=new FileInputStream("C:\\Selenium\\Book1.xlsx");
	
	  Sheet S1=WorkbookFactory.create(file).getSheet("Sheet2");
	
	  
			
}
	
	
	
	
	
	
	
	
	
	
	
}
