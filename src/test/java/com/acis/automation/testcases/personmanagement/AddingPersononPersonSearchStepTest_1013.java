package com.acis.automation.testcases.personmanagement;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class AddingPersononPersonSearchStepTest_1013 extends TestBase {

	public AddingPersononPersonSearchStepTest_1013() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	 String firstName = faker.name().firstName();
	 String lastName = faker.name().lastName();


	String recruitmentEventId;

	@Test(enabled = true, description = "S:1013 add recuitments events and person ", groups = { "High",
			"acisRegression", "Khushboo" }, priority = 0)

	public void CreateNewrecuitment() throws AcisException {
		try {
			loginTest.login("LicesningWorker");
			homePage_SFDCPage.clickDownArrowEvent();
			homePage_SFDCPage.selectAllEvent();
			newOrientationEventPage.clickonNewbtn();
			newRecruitmentEventPage.selectRecruitmentRadioButton();
			newRecruitmentEventPage.EventType();
			newRecruitmentEventPage.selectDateTime();
			newRecruitmentEventPage.setAddressInformation("Street1", "sugar 123");
			newRecruitmentEventPage.setAddressInformation("City", "Richland City");
			newRecruitmentEventPage.setState();
			newRecruitmentEventPage.setAddressInformation("ZipPostalCode", "12345");
			newRecruitmentEventPage.next();
			newRecruitmentEventPage.searchPersonUsingvalidData("firstName", "first");
			newRecruitmentEventPage.linkToCreateNewPerson();
			newRecruitmentEventPage.setFields("First Name", firstName);
			newRecruitmentEventPage.setFields("Last Name", lastName);
			newRecruitmentEventPage.setFields("Email", "abc@demo.com");
			newRecruitmentEventPage.setFields("Phone", "1234567890");
			newRecruitmentEventPage.clickOnSavebtn();
			newRecruitmentEventPage.closeFosterCareProspective();
			newRecruitmentEventPage.next();
			newRecruitmentEventPage.next();
			newRecruitmentEventPage.clickSubmit();
			recruitmentEventId = newRecruitmentEventPage.getRecruitmentID();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S:1013 add recuitments events and person");
		}

	}

}
