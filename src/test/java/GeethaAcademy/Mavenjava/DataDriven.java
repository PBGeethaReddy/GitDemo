package GeethaAcademy.Mavenjava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("C://Users//Geetha Reddy P B//Downloads//Book.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook();
		
		int sheets=workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("testdata"))
			{
				XSSFSheet sheet=workbook.getSheetAt(i);
				
				
			}
		}
		

	}

}
