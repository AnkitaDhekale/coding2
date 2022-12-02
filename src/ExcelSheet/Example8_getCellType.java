package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example8_getCellType 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file=new FileInputStream("C:\\Selenium\\Book1.xlsx");
	
	               Sheet s1=WorkbookFactory.create(file).getSheet("Sheet3");
	             
	          Cell info =s1.getRow(0).getCell(2);
	             
	             CellType C=info.getCellType();
	             
	             System.out.println(C);
	             
	           boolean  I=info.getBooleanCellValue();
	             System.out.println(I);
	             
	             
}

	
	
	
	
	
	
	
	
	
	
	
}
