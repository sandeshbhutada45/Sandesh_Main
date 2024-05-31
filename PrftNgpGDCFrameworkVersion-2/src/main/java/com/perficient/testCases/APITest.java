package com.perficient.testCases;

import com.perficient.baseclasses.APIBasePage;
import com.perficient.baseclasses.JsonObjects;
import com.perficient.util.TestCaseBase;
import com.perficient.util.TestData;

import java.io.IOException;

import org.testng.annotations.Test;

public class APITest extends TestCaseBase {
	String url;

	@Test(groups = {"regression","smokes"}, description = "Verify GET request with response code", testName = "GET request test", priority = 1)
	public void checkGetstatusCode() throws IOException  {

		url = TestData.get("url");
		
		APIBasePage apiBase = new APIBasePage(pageManager, excelReader, customAssertion, restApiutility);
		int code = apiBase.checkGetResponse(url);
		customAssertion.assertTrue(code == 200, null);
	}
	
	@Test(groups = {"regression","smokes"}, description = "Verify POST request with response code", testName = "POST request test", priority = 2)
	public void checkPoststatusCode() throws IOException  {
		
		APIBasePage apiBase = new APIBasePage(pageManager, excelReader, customAssertion, restApiutility);
		JsonObjects jsonObj = new JsonObjects(pageManager, excelReader);
		String postRequestBody = jsonObj.postRequestJsonObject().toString();
		int code = apiBase.checkPostResponse(url, postRequestBody);
		customAssertion.assertTrue(code == 201, null);
	}
	
}
