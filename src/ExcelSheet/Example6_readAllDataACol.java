package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example6_readAllDataACol 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	FileInputStream file=new FileInputStream("C:\\Selenium\\Book1.xlsx");
	
	  Sheet sh=WorkbookFactory.create(file).getSheet("Sheet5");
	
	
	int lascolIndex=sh.getRow(0).getLastCellNum()-1;
	for
	(int i=0;i<=lascolIndex;i++)
	{ //4 0
	
	String value=sh.getRow(0).getCell(i).getStringCellValue();
		System.out.print(value);
	}
	//abc
	//xyz
	//xyz2
	//xyz4
	//xyz5
	
	
	
}
}
