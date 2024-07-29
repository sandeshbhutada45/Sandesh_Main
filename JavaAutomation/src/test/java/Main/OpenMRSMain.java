package Main;

import org.testng.annotations.Test;

import Pages.OpenMRS;

public class OpenMRSMain extends OpenMRS {
	
	OpenMRS OMRS = new OpenMRS();
	@Test
	public void main1() throws Exception
	{
		OMRS.method1();
	}
 
	@Test
	public void main2()
	{
		OMRS.ToGetCoulmnData();
	}
	@Test
    public void main3() 
    {
    	OMRS.ToGetCoulmnDataNextPage();
    }
}
