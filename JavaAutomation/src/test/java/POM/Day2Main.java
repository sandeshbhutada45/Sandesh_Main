package POM;

import java.io.IOException;

import org.testng.annotations.Test;

public class Day2Main extends Day2pages {
	
	Day2pages pg= new Day2pages();
	
	@Test(priority = 5)
	public void close() {
		pg.teardown();
		
	}
	
	@Test(priority = 4)
	public void form() {
		pg.formpage();
		
	}
	
	
	@Test(priority = 1)
	public void open() throws IOException {
		pg.properties();
	}
	@Test(priority = 2)
	public void open2() {
		pg.brow();
	}
	@Test(priority = 3)
	public void register() {
		pg.registerpage();
	}

}
