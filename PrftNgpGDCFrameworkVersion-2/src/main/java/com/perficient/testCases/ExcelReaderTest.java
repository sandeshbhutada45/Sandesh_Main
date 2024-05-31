package com.perficient.testCases;

import java.util.List;

import org.testng.annotations.Test;
import com.perficient.util.TestCaseBase;
import com.perficient.util.TestData;
import com.perficient.baseclasses.ExcelBasePage;

public class ExcelReaderTest extends TestCaseBase {
	
	@Test(groups = {"regression","smokes"}, description = "Verify Excel functionality", testName = "Excel Reader Sample", priority = 1)
	public void TC001() throws InterruptedException, ClassNotFoundException
	{
		String sheetName = TestData.get("sheetName");
		String columnName1 = TestData.get("columnName1");
		String columnName2 = TestData.get("columnName2");
		String columnName3 = TestData.get("columnName3");
		String columnName4 = TestData.get("columnName4");
		String resultSheetName = TestData.get("resultSheetName");

		
		ExcelBasePage xel = new ExcelBasePage(pageManager, excelReader);
		
		xel.loadExcelSheet();
		
		List<String> dataList = xel.readData(sheetName, columnName1, columnName2, columnName3, columnName4);
		
		xel.setData(dataList, resultSheetName, columnName1, columnName2, columnName3, columnName4);
}
}
