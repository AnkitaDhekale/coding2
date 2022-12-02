package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass1 
{

	public static String gettestdata(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Selenium\\Book1.xlsx");
		
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet2");
		
		String value=sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		
		return value;
	
	
	
	
	}	
}
