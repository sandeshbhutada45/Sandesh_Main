package Main;

import java.io.IOException;

import org.testng.annotations.Test;

import Pages.LenskartPage;

public class LenskartMain extends LenskartPage {
	LenskartPage lkp= new LenskartPage();
	
	
	@Test
	public void main1() throws IOException {
		lkp.method1();
		
	}
	@Test
	public void main2() throws IOException {
		lkp.method2();
	}
	
	@Test
	public void main3() throws IOException {
		lkp.method3();
	}
	@Test
	public void main4() throws IOException {
		lkp.method4();
	}
}
