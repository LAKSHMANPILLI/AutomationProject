package com.actitime.AGeneric;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib2nd {
	public String getPropertyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\L\\eclipse-workspace\\Automation2\\data2\\Comman.properties");
		Properties p=new Properties();
		p.load(fis);
		String data=p.getProperty(key);
		return data;	
	}
	public String getExelData(String SheetName,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\L\\eclipse-workspace\\Automation2\\data2\\seleniumScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data=wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	public void setExelData(String SheetName,int row,int cell,String string) throws EncryptedDocumentException, IOException ,FileNotFoundException{
		FileInputStream fis=new FileInputStream("C:\\Users\\L\\eclipse-workspace\\Automation2\\data2\\seleniumScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
		FileOutputStream fos=new FileOutputStream("C:\\Users\\L\\eclipse-workspace\\Automation2\\data2\\seleniumScript.xlsx");
		wb.write(fos);
		wb.close();
	}
}
