package com.acis.automation.testcases.personmanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class PersonCardsTest_0128 extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(PersonCardsTest_0128.class);

	public PersonCardsTest_0128() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(description = "S:0128:Person Management -PersonCards verify account id ,Duplicates and create new task using Intake User", groups = {
			"Simple", "ACIS_Regression", "Khushboo" })
	public void PersonCardsIntake() throws AcisException, InterruptedException {
		try {
			loginTest.login("Intake");
			homePage_SFDCPage.clickDownArrowAccount();
			homePage_SFDCPage.selectAllAccount();
			homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameTwo"));
			personsInformationPage.clickDetailsTab();
			personsInformationPage.verifyPrimaryDetails();
			personsInformationPage.createNewTask();
			personsInformationPage.verifyNewTask();
			personsInformationPage.verifyNewEvent();
			personsInformationPage.verifyUpcomingAndOverdue();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed S-0128:Person Management - PersonCards verify account id ,Duplicates and create new task using Intake User");

		}
	}

	@Test(description = "S-0128:Person Management - PersonCards verify account id ,Duplicates and create new task using Supervisor User", groups = {
			"Simple", "ACIS_Regression", "Khushboo" })
	public void PersonCardsSupervisor() throws AcisException, InterruptedException {
		try {
			loginTest.login("Supervisor");
			homePage_SFDCPage.clickDownArrowAccount();
			homePage_SFDCPage.selectAllAccount();
			homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameTwo"));
			//Thread.sleep(10000);
			personsInformationPage.clickDetailsTab();
			personsInformationPage.verifyPrimaryDetails();
			personsInformationPage.createNewTask();
			personsInformationPage.verifyNewTask();
			personsInformationPage.verifyNewEvent();
			personsInformationPage.verifyUpcomingAndOverdue();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-0128:Person Management - PersonCards  verify account id ,Duplicates and create new taskusing supervisor User");

		}
	}

	@Test(description = "S-0128:Person Management - PersonCards  verify account id,Duplicates and create new task using Investigator User", groups = {
			"Simple", "ACIS_Regression", "Khushboo" })
	public void PersonCardsInvestigator() throws AcisException, InterruptedException {
		try {
			loginTest.login("Investigator");
			homePage_SFDCPage.clickDownArrowAccount();
			homePage_SFDCPage.selectAllAccount();
			homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameTwo"));
			//Thread.sleep(10000);
			personsInformationPage.clickDetailsTab();
			personsInformationPage.verifyPrimaryDetails();
			personsInformationPage.createNewTask();
			personsInformationPage.verifyNewTask();
			personsInformationPage.verifyNewEvent();
			personsInformationPage.verifyUpcomingAndOverdue();
		} catch (Exception e) {

			// TODO Auto-generated catch block
			getStackTrace(e,
					" Failed S-0128:Person Management - PersonCards verify account id ,Duplicates and create new task using investigator User");

		}
	}

	@Test(description = "S-0128:Person Management - PersonCards verify account id ,Duplicates and create new taskusing admin User", groups = { "Simple",
			"ACIS_Regression", "Khushboo" })
	public void PersonCardsadmin() throws AcisException, InterruptedException {
		try {
			loginTest.login("Admin");
			homePage_SFDCPage.clickDownArrowAccount();
			homePage_SFDCPage.selectAllAccount();
			homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameTwo"));
			//Thread.sleep(10000);
			personsInformationPage.clickDetailsTab();
			personsInformationPage.verifyPrimaryDetails();
			personsInformationPage.createNewTask();
			personsInformationPage.verifyNewTask();
			personsInformationPage.verifyNewEvent();
			personsInformationPage.verifyUpcomingAndOverdue();

	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed S-0128:Person Management - PersonCards verify account id,Duplicates and create new task using Admin User");

		}
	}

}