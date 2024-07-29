package Pages;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Reusable.Utils;

public class Solid extends Utils {
	By drpdwn = By.xpath("(//*[@id=\"form-options-894604636\"])[2]");
	By yes = By.xpath("//*[@id=\"cmp-form-field__form-options-1677526349\"]/label[1]");
	By no = By.xpath("//*[@id=\"cmp-form-field__form-options-1677526349\"]/label[2]");
	By dontinsurense = By.xpath("//*[@id=\"cmp-form-field__form-options-1677526349\"]/label[3]");
	By nosure = By.xpath("//*[@id=\"cmp-form-field__form-options-1677526349\"]/label[4]");
	By prvt = By.xpath("//*[@id=\"cmp-form-field__form-options-1715902900\"]/label[1]");
	By pbl = By.xpath("//*[@id=\"cmp-form-field__form-options-1715902900\"]/label[2]");
	By yes2 = By.xpath("//*[@id=\"cmp-form-field__form-options-178871275\"]/label[1]");
	By no2 = By.xpath("//*[@id=\"cmp-form-field__form-options-178871275\"]/label[2]");
	By copay = By.xpath("//*[@id=\"cmp-form-field__form-options-165420547\"]/label[1]");
	By ptfound = By.xpath("//*[@id=\"cmp-form-field__form-options-165420547\"]/label[2]");
	By independent = By.xpath("//*[@id=\"cmp-form-field__form-options-165420547\"]/label[3]");
	By submit = By.xpath("//*[@type='submit']");

	@SuppressWarnings("resource")
	@Test
	void method1() throws Exception {
		openBrowser("Chrome");
		driver.get(getPropertiesFiles("URL9"));
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet linkSheet;
		Row linkRow;

		FileInputStream fileInput = new FileInputStream(
				"C:\\Users\\sanket.wadyalkar\\JavaAutomation\\Java\\TestData\\fs_tool_input(v3).xlsx");
		XSSFWorkbook inputWorkbook = new XSSFWorkbook(fileInput);
		XSSFSheet inputSheet = inputWorkbook.getSheetAt(0);
		int totalRows = inputSheet.getLastRowNum();
		System.out.println(totalRows);
		linkSheet = workbook.createSheet("FS Tool Output");
		linkRow = linkSheet.createRow(0);
		linkRow.createCell(0).setCellValue("URL");
		linkRow.createCell(1).setCellValue("For which of the following indications?");
		linkRow.createCell(2).setCellValue("Does insurance cover Brand X?");
		linkRow.createCell(3).setCellValue("What type of primary insurance?");
		linkRow.createCell(4).setCellValue("Receiving any other form of financial assistance?");
		linkRow.createCell(5).setCellValue("What type of assistance?");
		linkRow.createCell(6).setCellValue("Meets Household Size/Income Limit");
		linkRow.createCell(7).setCellValue("Actual Landing URL");
		linkRow.createCell(8).setCellValue("Expected Landing URL");
		linkRow.createCell(9).setCellValue("Status");

		for (int j = 1; j <= totalRows; j++) {
			String url = inputSheet.getRow(j).getCell(0).getStringCellValue(); // URL from input sheet
			String indications = inputSheet.getRow(j).getCell(1).getStringCellValue();
			String insCover = inputSheet.getRow(j).getCell(2).getStringCellValue();
			String insType = inputSheet.getRow(j).getCell(3).getStringCellValue();
			String financeAssist = inputSheet.getRow(j).getCell(4).getStringCellValue();
			String typeOfAssist = inputSheet.getRow(j).getCell(5).getStringCellValue();
			String householdTool = inputSheet.getRow(j).getCell(6).getStringCellValue();
			String expectedURL = inputSheet.getRow(j).getCell(7).getStringCellValue();
			System.out.println("Scenario:" + j);
			driver.get(url);

			// Question 1
			if (indications.equals("Approved Indication")) {
				getDropdownByIndex(drpdwn, 1);
			} else {
				getDropdownByIndex(drpdwn, 6);
			}

			// Question 2
			if (insCover.equals("YES")) {
				driver.findElement(yes).click();
			} else if (insCover.equals("NO")) {
				driver.findElement(no).click();
			} else if (insCover.equals("I don't have insurance")) {
				driver.findElement(dontinsurense).click();
			} else if (insCover.equals("UNSURE")) {
				driver.findElement(nosure).click();
			}

			// Question 3

			if (insType.equals("Private")) {
				driver.findElement(prvt).click();
			} else if (insType.equals("Public")) {
				driver.findElement(pbl).click();
			} else if (typeOfAssist.equals("Not Applicable - Not Shown")) {
				try {
					driver.findElement(submit).click();
				} catch (Exception e) {
					System.out.println("");
				}
			}

			// Question 4

			if (financeAssist.equals("YES")) {
				driver.findElement(yes2).click();
			} else if (financeAssist.equals("NO")) {
				driver.findElement(no2).click();
			} else if (financeAssist.equals("Not Applicable - Not Shown")) {
				try {
					driver.findElement(submit).click();
				} catch (Exception e) {
					System.out.println("");
				}
			}

			// Question 5

			if (typeOfAssist.equals("Brand X Co-pay Program")) {
				driver.findElement(copay).click();
			} else if (typeOfAssist.equals("Genentech Patient Foundation")) {
				driver.findElement(ptfound).click();
			} else if (typeOfAssist.equals("Assitance from any other...")) {
				driver.findElement(independent).click();
			} else if (typeOfAssist.equals("Not Applicable - Not Shown")) {
				try {
					driver.findElement(submit).click();
				} catch (Exception e) {
					System.out.println("");
				}
			}

//			driver.findElement(submit).click();
			String actual_Url = driver.getCurrentUrl();
			System.out.println(actual_Url);
			// Output in excel
			int rowNum = linkSheet.getLastRowNum();
			linkRow = linkSheet.createRow(rowNum + 1);
			linkRow.createCell(0).setCellValue(url);
			linkRow.createCell(1).setCellValue(indications);
			linkRow.createCell(2).setCellValue(insCover);
			linkRow.createCell(3).setCellValue(insType);
			linkRow.createCell(4).setCellValue(financeAssist);
			linkRow.createCell(5).setCellValue(typeOfAssist);
			linkRow.createCell(6).setCellValue(householdTool);
			linkRow.createCell(7).setCellValue(actual_Url);
			linkRow.createCell(8).setCellValue(expectedURL);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
		FileOutputStream out = new FileOutputStream("C:\\Users\\sanket.wadyalkar\\JavaAutomation\\Java\\TestData\\op.xlsx");
		workbook.write(out);
		workbook.close();
		out.close();
		System.out.println("Excel Created!");
	}

}
