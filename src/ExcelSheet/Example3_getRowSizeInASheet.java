package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example3_getRowSizeInASheet 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file=new FileInputStream("C:\\Selenium\\Book1.xlsx");
	
	Sheet S =WorkbookFactory.create(file).getSheet("Sheet2");
	
	int LastRowIndex = S.getLastRowNum();
	System.out.println(S);
	
	for(int i=0; i<=LastRowIndex;i++);
	{
		Row D=S.getRow(LastRowIndex);
				System.out.println(S);
				
				
	}
	
	
	
}
	
	
	
}
