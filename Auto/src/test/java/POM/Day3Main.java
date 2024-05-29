package POM;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day3Main extends Day3Page {
	Day3Page page= new Day3Page();

	@BeforeMethod
	public void step1() throws IOException {
		page.chormeopen();
	}
	
	@Test
	public void step2() throws IOException {
		page.navigate();
	}
}
