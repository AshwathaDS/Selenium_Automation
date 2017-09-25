package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromXl {
	 public static String getCellValue(String xlpath,String sheet,int r,int c)
	 {
		String s="";
		try {
			 Workbook wb = WorkbookFactory.create(new FileInputStream(xlpath));
			 s=wb.getSheet(sheet).getRow(r).getCell(c).toString();
		} catch (Exception e) {
			
		}
		return s;
		 
	 }
	 
	 public static int getRowCount(String xlpath,String sheet)
	 {
		 int rc=0;
		 try {
			 Workbook wb = WorkbookFactory.create(new FileInputStream(xlpath));
			 rc= wb.getSheet(sheet).getLastRowNum();
			
		} catch (Exception e) {
			
		}
		 return rc;
	 }
	 
	 public static int getColumanCount(String xlpath,String sheet)
	 {
		 int cc=0;
		 try {
			 Workbook wb = WorkbookFactory.create(new FileInputStream(xlpath));
			 cc= wb.getSheet(sheet).getLeftCol();
			
		} catch (Exception e) {
			
		}
		 return cc;
	 }
 public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException  {
	 
	
	 String xlpath="./data/LogInPage.xlsx";
	 String s = getCellValue(xlpath, "InavalidLogIn", 1, 1);
	 System.out.println(s);
	 
	 int r = getRowCount(xlpath, "InavalidLogIn");
	 System.out.println(r);
	 
	 int c = getColumanCount(xlpath, "Sheet1");
	 System.out.println(c);
//	 
//	 FileInputStream fis=new FileInputStream(xlpath);
//	 Workbook wb = WorkbookFactory.create(fis);
//	 String s = wb.getSheet("Sheet1").getRow(0).getCell(0).toString();
//	 System.out.println(s);
	 

	
}
}
