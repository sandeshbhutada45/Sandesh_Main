package Main;

import java.io.IOException;

import org.testng.annotations.Test;

import Pages.ActmeraPage;

public class ActemraMain extends ActmeraPage {
	ActmeraPage rb= new ActmeraPage();
	
	@Test
	public void process1() throws IOException {
		rb.step1();
		rb.step2();
		rb.step3();
	}
}
