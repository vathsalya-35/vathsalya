////fetching the values from the excel sheet
package data_Driven_testing;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetching_value_Excelsheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream f1= new  FileInputStream ("C:\\Users\\vaths\\eclipse-workspace\\Selenium_project\\Excel_sheet\\Input.xlsx");
	      Workbook wb= WorkbookFactory.create(f1);
	      Sheet s1= wb.getSheet("Login");
	      Row r1=s1.getRow(1);
	      Cell c1=r1.getCell(0);
	      String str=c1.getStringCellValue();
	      System.out.println(str);
	      Row r2=s1.getRow(1);
	      Cell c2=r2.getCell(1);
	      String pwd=c2.getStringCellValue();
	      System.out.println(pwd);
	}
}
