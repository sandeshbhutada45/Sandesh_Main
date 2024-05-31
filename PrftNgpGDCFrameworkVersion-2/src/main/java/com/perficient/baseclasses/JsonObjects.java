package com.perficient.baseclasses;

//import java.util.concurrent.TimeUnit;

import org.json.JSONArray;
import org.json.JSONObject;

import com.perficient.util.ExcelReader;
//import com.perficient.insite.basepages.InsiteSignInPage;
import com.perficient.util.PageManager;
import com.perficient.util.PageObject;



public class JsonObjects extends PageObject {

	public JsonObjects(PageManager pm, ExcelReader excelReader) {
		super(pm, excelReader);
	}

	public JSONObject postRequestJsonObject()
	{
		JSONObject main = new JSONObject();
		main.put("name", "xyz");
		main.put("job", "QA");
		return main;
		
	}
	
}
