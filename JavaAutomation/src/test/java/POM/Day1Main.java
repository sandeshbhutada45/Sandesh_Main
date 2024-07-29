package POM;

import java.io.IOException;

import org.testng.annotations.Test;

public class Day1Main extends Day1pages {
	Day1pages page = new Day1pages();
	@Test
	public void main() throws IOException {
		page.browse();	
	}
	@Test
	public void process() {
		page.steps();
	}
	@Test
	public void process1() throws IOException {
		page.screenshot();
		System.out.println("TEST PASSED");
	}

	@Test
	public void process2() {
		page.pgurl();
	}
	
}
