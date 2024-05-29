package Assignment;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class default_sb {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook;
		FileInputStream file = new FileInputStream("C:\\Sanket\\SSAUTOMATION\\Java\\TestData\\Excel.xlsx");
		workbook= new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheetAt(0);
		int rowCount= sheet.getLastRowNum();
		System.out.println("Rows count: " + rowCount);
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
        System.out.println(cell);
		System.out.println(sheet.getRow(0).getCell(0));
		
//		for (int i = 1; i <= rowCount; i++) {
//            String user = sheet.getRow(i).getCell(0).getStringCellValue();
//            String pass= sheet.getRow(i).getCell(1).getStringCellValue();
//            System.out.println(user+ "  "+pass);
//	}
//		file.close();
//		workbook.close();
 
	}

}
