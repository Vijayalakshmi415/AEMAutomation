package java;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ReadExcelData {
	public WebDriver driver;
	
	@Test
	public void excel() throws EncryptedDocumentException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
	Workbook wb= WorkbookFactory.create(new FileInputStream("C:\\test data\\testdata.xlsx"));
	Sheet sh = wb.getSheet("sheet1");
	 
	int rowcount = sh.getLastRowNum();
	for (int i = 0; i <= rowcount; i++) 
    {
		// total cell count
       int cellcount = sh.getRow(i).getLastCellNum();
       for (int j = 0; j < cellcount; j++) 
       {                         
         //cell value
         String value = sh.getRow(i).getCell(j).getStringCellValue();
	     System.out.println(value);
}

}}}
