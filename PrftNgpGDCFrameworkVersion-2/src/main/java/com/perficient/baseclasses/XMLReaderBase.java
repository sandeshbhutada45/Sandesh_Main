package com.perficient.baseclasses;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.http.client.fluent.Request;

import com.perficient.util.ExcelReader;
import com.perficient.util.PageManager;
import com.perficient.util.PageObject;
import com.perficient.util.SystemUtil;
import com.perficient.util.XmlReader;

public class XMLReaderBase extends PageObject{
	
	
	public XMLReaderBase(PageManager pm, ExcelReader xl) {
		super(pm,xl);
	}

	public static String XML_FILE_PATH;
	public static String TEXT_FILE_PATH ;
	
	
	
	
		/**
		 * Method to read XML file
		 * @throws InterruptedException
		 */
		public void filePathReader() throws InterruptedException {
			
			// read the url from property file "testdata_jordan.properties" 
			Properties FILE_PATH = SystemUtil.loadPropertiesResources("\\testdata_filePath.properties");
			 XML_FILE_PATH = FILE_PATH.getProperty("XML_FILE_PATH");
		     TEXT_FILE_PATH = FILE_PATH.getProperty("TEXT_FILE_PATH");
		     System.out.println(TEXT_FILE_PATH);
			
			Thread.sleep(1000);
		}
		
		public void linkResponseWriter() throws IOException{
		File f = new File(TEXT_FILE_PATH);
        FileWriter fw=new FileWriter(f);
        BufferedWriter bw=new BufferedWriter(fw);
        XmlReader xmlreader = new XmlReader();
        ArrayList<String> urlList = xmlreader.readeXML(XML_FILE_PATH);
        
        int valid =0;
		int counter = 0;
		int exceptions=0;
        
        if(!urlList.isEmpty())
        {
              bw.write("Number of Links:  "+urlList.size());
              bw.newLine();
              bw.write("");
              bw.newLine();
              System.out.println("Number of Links:  "+urlList.size());
        }
      
		for(int i=0;i<=urlList.size();i++)
        {
              try{
                     
                     int responseCode = Request.Get(urlList.get(i)).execute().returnResponse().getStatusLine()
                             .getStatusCode();
                     
                     
                     String ResCode = Integer.toString(responseCode); 
                     
                     System.out.println(i + ". Link " + urlList.get(i));
                     System.out.println(i + ". Status " + ResCode);
                     System.out.println();
                 
                     bw.write(i + ". Link :: " + urlList.get(i));
                     bw.newLine();
                     bw.write(i + ". Status :: " + ResCode);
                     bw.newLine();
                     bw.write("");
                     bw.newLine();
                     if(ResCode == "200")
                     {
                            valid += 1;
                     }
                     
                     if (ResCode == "404")
                     {
                            counter += 1;
                     }                          
              }
              catch(Exception e)
              {
                     e.getMessage();
                     String link = urlList.get(i);
                     System.out.println(i + ". Link :: " + link);
                     System.out.println(i + ". Exception :: " + e);
                     bw.write(i + ". Link :: " + link);
                     bw.newLine();
                     bw.write(i + ". Exception :: " + e);
                     bw.newLine();
                     bw.write("");
                     bw.newLine();
                     System.out.println();
                     exceptions += 1;
                     continue;
              }
        }
        System.out.println("Total Number of Broken Items = " + counter);
        bw.write("Total Number of Broken Items = "+counter);
        bw.newLine();
        System.out.println("Total Number of Exception Items = " + exceptions);
        bw.write("Total Number of Exception Items = " + exceptions);
        bw.newLine();
        System.out.println("Total Number of Valid Items= "+valid);
        bw.write("Total Number of Valid Items= "+valid);
        bw.newLine();
        bw.flush();
        bw.close();
   }

}

		

