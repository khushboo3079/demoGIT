package com.acis.automation.testcases.providermanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _0301_LicensingRecommendationTest extends TestBase {

	public _0301_LicensingRecommendationTest() throws AcisException {
		// TODO Auto-generated constructor stub\
		super();
	}

	final static Logger logger = LoggerFactory.getLogger(_0301_LicensingRecommendationTest.class);

	 

	String firstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
	String middleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 6);
	String lastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 6);

	String childFirstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 3);
	String childMiddleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 3);
	String childLastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 3);

	String Applicantname=(excel.generateRandomTestData("Demo", 3));
	
	@Test(description = "US:301 Provider Management - Create Placement Resource Account and licensing Application", groups = {
			"High", "acisRegression", "Varun" }, priority = 0)
	public void CreatePlacementAccount() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAccount();
			homePage_SFDCPage.selectAllAccount();
			homePage_SFDCPage.clickNewButton();
			placementResourcePage.selectRadioButton();
			placementResourcePage.setTextOnPlacement("AccountName", Applicantname);
			placementResourcePage.setPlacementType("RelativeFoster");
			placementResourcePage.setTextOnPlacement("Capacity", "100");
			placementResourcePage.setTextOnPlacement("Occupancy", "45");
			placementResourcePage.setTextOnPlacement("MaleAgeMinimum", "3");
			placementResourcePage.setTextOnPlacement("FemaleAgeMinimum", "2");
			placementResourcePage.setTextOnPlacement("MaleAgeMaximum", "70");
			placementResourcePage.setTextOnPlacement("FemaleAgeMaximum", "60");
			placementResourcePage.setStatus("Applicant");
			placementResourcePage.selectSpecialNeeds("Medically Complex");
			placementResourcePage.clickOnSave();
			placementResourcePage.clickRelatedTab();
			licensingApplicationPage.clickLicenseApplicationTab();
			licensingApplicationPage.clickNewLicenseApplication();
			licensingApplicationPage.enterapplicationdetails(Applicantname);
			licensingApplicationPage.saveButton();
			licensingApplicationPage.clicksubmit();
			licensingApplicationPage.submitSavebtn();
			licensingApplicationPage.verifyActivityErrormessage();
			licensingApplicationPage.checklistForApplicant();
			licensingApplicationPage.clickonNewApplicant();
			licensingApplicationPage.searchForLicensingapplications("Walk through");
			licensingApplicationPage.selectStandardsMet("Meets");
			licensingApplicationPage.saveButton();
			licensingApplicationPage.clickonLicensingApplication();
			licensingApplicationPage.clicksubmit();
			licensingApplicationPage.submitSavebtn();
			licensingApplicationPage.verifyRecommendationErrorMessage();
			licensingApplicationPage.editRecommendation("Demo");
			licensingApplicationPage.saveButton();
			licensingApplicationPage.clicksubmit();
			licensingApplicationPage.submitSavebtn();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:301 Provider Management - Create Placement Resource Account and licensing Application");
		}
	}

	@Test(description = "US:0301 Provider Management - Approve as Supervisor ", groups = { "High", "acisRegression",
			"Varun" }, priority = 1)

	public void ApproveasSupervisor() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			licensingApplicationPage.clickonNotification();
			licensingApplicationPage.approval();
            licensingApplicationPage.enterComments();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US:0301 Provider Management - Approve as Supervisor");
		}

	}
	
	
	@Test(description = "US:301 Provider Management - Verify the Approved status", groups = {
			"High", "acisRegression", "Varun" }, priority = 2)
	public void searchPlacementAccountandVerify() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			licensingApplicationPage.searchAccountRecord(Applicantname);			
			licensingApplicationPage.verifyStatus();		
			licensingApplicationPage.clickLicenseApplicationTab();
			licensingApplicationPage.clickonaaprovedApplicant(Applicantname);
			licensingApplicationPage.clicksubmit();
			licensingApplicationPage.submitSavebtn();
			
			
			
		}
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US:0301 Provider Management - Verify the Approved status");
		}
	
	}

}
