package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _0814_CustomButtonVisibilityforIntakeUsersTest extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(_0814_CustomButtonVisibilityforIntakeUsersTest.class);

	public _0814_CustomButtonVisibilityforIntakeUsersTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String allegationID,fosterCaseID;
	String childFirstName = faker.name().firstName();
	String childMiddleName = faker.name().lastName();
	String childLastName = faker.name().lastName();

	
	@Test(enabled = true, description = "US:S-0814 Custom Button Visibility for Intake Users (Case Management)", groups = {
			"High", "acisRegression", "Akash" }, priority = 0)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {

			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseHead();
			homePage_SFDCPage.selectAllCaseHeads();
			homePage_SFDCPage.clickFirstRecord();
//			homePage_SFDCPage.searchRecordAndClick(firstName+" "+middleName+" "+lastName);
			fosterCaseID = caseHeadPage.newFosterCase();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US:0173 Case Management - New Placement Search Criteria Create Foster Care Case");
		}

	}

	@Test(enabled = true,description = "US:S-0814 Custom Button Visibility for Intake Users (Case Management)", groups = {
			"High", "acisRegression", "Akash" }, priority = 1)
	public void fosterCareCreatePerson() throws AcisException, InterruptedException, IOException {
		try {
			
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
				customButtonVisibilityPage.newPlacementError();
				customButtonVisibilityPage.newCourtActionError();
				customButtonVisibilityPage.newCasePlanError();
				customButtonVisibilityPage.newServiceReferral();
				customButtonVisibilityPage.newSafetyAssessment();
			
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0174 Case Management - Case Management - Create Service Referral Foster Care Case Add Person");
		}

	}
	
	
	
	}
	
	

