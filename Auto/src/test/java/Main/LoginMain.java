package Main;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginMain extends LoginPage {
	LoginPage LP = new LoginPage();

	@AfterMethod
	public void close() {
		LP.step();
	}

	@BeforeMethod
	public void process1() throws IOException {
		LP.step1();
	}
	
	@Test
	public void process2() throws IOException {
		LP.step2();
		LP.step3();
	}

	
	
	

}
