package com.perficient.baseclasses;

import java.io.IOException;

import com.perficient.util.CustomAssertion;
import com.perficient.util.ExcelReader;
import com.perficient.util.PageManager;
import com.perficient.util.PageObject;
import com.perficient.util.RestAPIUtility;

public class APIBasePage extends PageObject {
	
	public APIBasePage(PageManager pageManager, ExcelReader excelReader, CustomAssertion customAssertion,
			RestAPIUtility restApiutility) {
		// TODO Auto-generated constructor stub
		super(pageManager, excelReader, customAssertion, restApiutility);
	}	
	
	public int checkGetResponse(String url) throws IOException
	{
		int code = restApiutility.getResponseCode(url);
		return code;
	}
	
	public int checkPostResponse(String url, String jsonBody) throws IOException
	{
		int code = restApiutility.postResponseCode(url, jsonBody);
		return code;
	}
		
}
