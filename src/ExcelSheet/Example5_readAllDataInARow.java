package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example5_readAllDataInARow 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file=new FileInputStream("C:\\Selenium\\Book1.xlsx");
	
 Sheet	s=WorkbookFactory.create(file).getSheet("Sheet5");
	

	int lastCellIndex=s.getRow(0).getLastCellNum()-1;
	
	for(int i=0;i<=lastCellIndex;i++)
	{
		Cell info =s.getRow(0).getCell(i);
	String D=info.getStringCellValue();
	System.out.println(D);
}
	
}	
	
	
}
