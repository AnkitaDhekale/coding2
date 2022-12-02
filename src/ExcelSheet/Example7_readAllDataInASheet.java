package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example7_readAllDataInASheet 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file=new FileInputStream("C:\\Selenium\\Book1.xlsx");
	
	WorkbookFactory.create(file).getSheet("Sheet");
	
	Sheet sh = null;
	int lastRowIndex=sh.getLastRowNum();
	
	for(int i=0;i<=lastRowIndex;i++)  //outer for loop--->rows
	{
		int lastCellIndex=sh.getRow(i).getLastCellNum()-1;
		
		for(int j=0;j<=lastCellIndex;j++ ) //inner for loop-->cols
		{
			String value=sh.getRow(i).getCell(i).getStringCellValue();
			System.out.print(value+"");
		}
			System.out.println();
		
			
	}
	
	
	
	
	
	
}
	
	
	
	
	
	
}
