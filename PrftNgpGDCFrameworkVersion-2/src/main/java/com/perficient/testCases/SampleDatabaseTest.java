package com.perficient.testCases;

import com.perficient.baseclasses.DatabaseStatements;
import com.perficient.baseclasses.MagentoSignInPage;
import com.perficient.util.TestCaseBase;
import com.perficient.util.TestData;

import java.sql.SQLException;

import org.testng.annotations.Test;

public class SampleDatabaseTest extends TestCaseBase {

	@Test(groups = {"regression","smokes"}, description = "Verify user in DB", testName = "Verify DB ", priority = 1)
	public void verifyDBValue() throws InterruptedException, SQLException, ClassNotFoundException  {
		
		String Address = DatabaseStatements.executeSelectStatementWithUniqueKey("Persons", "Address", "PersonID", 3);
		customAssertion.assertEquals("Add3", Address);
	}

	@Test(groups = {"regression","smokes"}, description = "Verify user in DB", testName = "Update DB ", priority = 2)
	public void updateDBValue() throws InterruptedException, SQLException, ClassNotFoundException  {
		
		DatabaseStatements.executeUpdateStatement("Persons", "Address", "NewAdress", "PersonID", 3);
		String Address = DatabaseStatements.executeSelectStatementWithUniqueKey("Persons", "Address", "PersonID", 3);
		customAssertion.assertEquals("NewAdress", Address);
	}
	
	@Test(groups = {"regression","smokes"}, description = "Verify user in DB", testName = "Delete DB ", priority = 3)
	public void deleteDBValue() throws InterruptedException, SQLException, ClassNotFoundException  {
		
		DatabaseStatements.executeDeleteStatement( "Persons", "PersonID", 3);
		String Address = DatabaseStatements.executeSelectStatementWithUniqueKey("Persons", "Address", "PersonID", 3);
		customAssertion.assertEquals(null, Address);
	}
}
