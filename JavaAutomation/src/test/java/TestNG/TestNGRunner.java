package TestNG;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestNGRunner {

	public static void main(String[] args) {
		TestNG test= new TestNG();
		List<String> list= new ArrayList<String>();
		list.add("C:\\Users\\sandesh.bhutada\\Eclipse_Workspace\\JavaAutomation\test-output\\DemoSuite\\testng-failed.xml");
		test.setTestSuites(list);
		test.run();

	}

}
