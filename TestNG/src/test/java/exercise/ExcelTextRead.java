package exercise;

import java.io.File;
import java.io.FileInputStream;
//import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelTextRead {
    @DataProvider
	public String[][] getData() throws Exception{
		
		File file = new File("C:\\Users\\Hafiz\\eclipse-workspace\\TestNG\\datafiles\\newBook.xlsx");
		System.out.println(file.exists());
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		//System.out.println(sheet.getPhysicalNumberOfRows());
		
		int noOfColumn = sheet.getRow(0).getLastCellNum();
		int noOfRow = sheet.getPhysicalNumberOfRows();
		
		String[][] data = new String[noOfRow-1][noOfColumn];
		for(int i = 0; i<noOfRow-1; i++) {
			for(int j =0; j<noOfColumn; j++) {
				
				DataFormatter dt = new DataFormatter();
				data[i][j]=dt.formatCellValue(sheet.getRow(i+1).getCell(j));
				
			}
			
		}
		workbook.close();
		fis.close();
		//for(String[] dataArr:data) {
			
			//System.out.println(Arrays.toString(dataArr));
		//}
		return data;

	}

}
