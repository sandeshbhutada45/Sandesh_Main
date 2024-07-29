package Main;

import java.io.IOException;

import org.testng.annotations.Test;

import Pages.readCredentialPage;

public class readCredentialMain extends readCredentialPage {
	readCredentialPage rd= new readCredentialPage();
	@Test
	public void process1() throws IOException {
		rd.Excel();

	}
}
