package sekenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		File file = new File("E:\\workspace\\morning_7_8\\sekenium\\src\\main\\resources\\TestDat.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet sheet = workbook.getSheetAt(0);	
		 int rownumber = sheet.getLastRowNum();
		 System.out.println(rownumber);
		 
		 for(int i = 0;i<=rownumber; i++)
		 {
			 
			 int cellNumber = sheet.getRow(i).getPhysicalNumberOfCells();
			 
			System.out.println(cellNumber);
			 
			 Row row = sheet.getRow(i);
			 
			 for(int j =0;j<cellNumber;j++)
			 {
				 
				 Cell cell = row.getCell(j);
				 
				 if(cell.getCellType()==CellType.STRING)
				 {
					 System.out.println(cell.getStringCellValue());
				 }
				 
			 }
			 
			 
			 
			 
			 
			 
			 
			 
		 }
	
		
	}

}
