package genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility 
{
public String getDataFromExcel(String sheetName , int rowNum , int celNum) throws Throwable {
		
		FileInputStream fis = new FileInputStream("C:/Users/Prince Kumar/Desktop/TestScriptData.xlsx");
		Workbook wb =  WorkbookFactory.create(fis);
	    String data = wb.getSheet(sheetName).getRow(rowNum).getCell(celNum).getStringCellValue();
	    wb.close();
		return data;
	}

public static Object[][] getMultipleDataFromExcel(String sheetName) throws Throwable {
	FileInputStream fis = new FileInputStream("C:/Users/Prince Kumar/Desktop/TestScriptData.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sheet = book.getSheet(sheetName);
	DataFormatter df = new DataFormatter();
	int rowCount = sheet.getPhysicalNumberOfRows();
	int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
	Object [][] data = new Object [rowCount-1][cellCount];
	
	for (int i = 1; i < rowCount; i++) {
		for (int j = 0; j < cellCount; j++) {
//			data [i-1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			data [i-1][j] = df.formatCellValue(sheet.getRow(i).getCell(j));
		}
		
	}
	return data;
}


	
	public int getRowcount(String sheetName ) throws Throwable {
		FileInputStream fis = new FileInputStream("./testdata/testScriptdata.xlsx");
		Workbook wb =  WorkbookFactory.create(fis);
		int rowCount = wb.getSheet(sheetName).getLastRowNum();
		 wb.close();
		return rowCount;
	}
	
	public void setDataIntoExcel(String sheetName , int rowNum , int celNum , String data) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./testdata/testScriptdata.xlsx");
		Workbook wb =  WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(rowNum).createCell(celNum);
		
		FileOutputStream fos = new FileOutputStream("./testdata/testScriptdata.xlsx");
		wb.write(fos);
		wb.close();
	} 

}
