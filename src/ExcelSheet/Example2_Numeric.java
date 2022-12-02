package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example2_Numeric 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
	FileInputStream file=new FileInputStream("C:\\Selenium\\Book1.xlsx");
	
	Double d=WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getCell(0).getNumericCellValue();
	
	System.out.println(d);
	

	
	
	
	}	
	
}
