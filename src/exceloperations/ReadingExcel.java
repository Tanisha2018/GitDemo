package exceloperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		String excelFilePath=".\\datafiles\\countries.xlsx";
		
		FileInputStream inputstream=new  FileInputStream(excelFilePath);
		XSSFWorkbook workbook= new XSSFWorkbook(inputstream);
         
		//XSSFSheet sheet1 = workbook.getSheet("Sheet1");
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		//using for loop
		
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(1).getLastCellNum();
		
		for(int r=0;r<=rows;r++)
		{
			XSSFRow row=sheet.getRow(r);
			for(int c=0;c<cols;c++)
			{
				XSSFCell cell=row.getCell(c);
				cell.getCellType()
			}
		}
		
		
		
		
	}

}
