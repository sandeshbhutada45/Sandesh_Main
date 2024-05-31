package com.perficient.testCases;
/**
 * @author pooja.manna
 * Test case for Writing the response of the links by reading the links from the XML file
 * 
 */

import org.testng.annotations.Test;
import com.perficient.baseclasses.XMLReaderBase;
import com.perficient.util.TestCaseBase;


public class LinkVerificationViaXML extends TestCaseBase {

	@Test(groups = {"regression","smokes"}, description = "Verify XML functionality", testName = "XML Reader Sample", priority = 1)
	public void test08NavigateToLinks() throws Exception {

		XMLReaderBase xmlBase = new com.perficient.baseclasses.XMLReaderBase(pageManager, excelReader);
		xmlBase.filePathReader();
		xmlBase.linkResponseWriter();

	}
}

