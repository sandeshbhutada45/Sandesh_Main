package Pages;

import java.io.IOException;

import org.testng.annotations.Test;

import Reusable.Utils;

public class ResponeCodePage extends Utils {
	Utils us = new Utils();

	@Test
	public void status() throws IOException {
		us.openBrowser("Chrome");
		us.readExcel();
		for(int i=1;i<=rowCount;i++) {
			String url= sheet.getRow(i).getCell(0).getStringCellValue();
			driver.get(url);
		    us.getImageAndText();
			us.writeExcel("SRC", "Responce Code","");
			

		}
	}
	}


