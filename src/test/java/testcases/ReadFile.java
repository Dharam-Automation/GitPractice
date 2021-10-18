package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadFile {


	public static void main(String[] args) throws IOException {

		String filePath = System.getProperty("user.dir")+"\\Downloads\\Demo.xlsx"; 
		
		File file = new File(filePath);
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		Sheet sheet =  workbook.getSheet("Sheet1");
		
		int rowCount =  sheet.getLastRowNum(); // - sheet.getFirstRowNum();
		
		System.out.println(rowCount);
		
		for (int i = 1; i <= rowCount; i++) {

	        Row row = sheet.getRow(i);

	        //Create a loop to print cell values in a row

	        for (int j = 0; j < row.getLastCellNum(); j++) {

	            //Print Excel data in console

	            System.out.print(row.getCell(j).getStringCellValue()+"|| ");

	        }

	        System.out.println();
		
		}	

	}

}
