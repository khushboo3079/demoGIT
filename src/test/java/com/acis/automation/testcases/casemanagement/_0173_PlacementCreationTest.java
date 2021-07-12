package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _0173_PlacementCreationTest extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(_0173_PlacementCreationTest.class);

	public _0173_PlacementCreationTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String allegationID, fosterCaseID;

	String firstName = faker.name().firstName();
	String middleName = faker.name().firstName();
	String lastName = faker.name().firstName();

	String childFirstName = faker.name().firstName();
	String childMiddleName = faker.name().firstName();
	String childLastName = faker.name().firstName();
	int count = 2;

	@Test(enabled=false,description = "US:0173 Case Management - New Placement Search Criteria Create Placement Resource Account", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 0)
	public void CreatePlacementAccount() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();

			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAccount();
			homePage_SFDCPage.selectAllAccount();
			homePage_SFDCPage.clickNewButton();
			placementResourcePage.selectRadioButton();
			placementResourcePage.setTextOnPlacement("AccountName", excel.generateRandomTestData("Demo", 3));
			placementResourcePage.setPlacementType("RelativeFoster");
			placementResourcePage.setStatus("Applicant");
			placementResourcePage.selectSpecialNeeds("Medically Complex");
			placementResourcePage.setTextOnPlacement("Capacity",
					testData.get(Constants.PlacementAccount_SHEET).get("capacity"));
			placementResourcePage.setTextOnPlacement("Occupancy",
					testData.get(Constants.PlacementAccount_SHEET).get("occupancy"));
			placementResourcePage.clickOnSave();
			placementResourcePage.clickRelatedTab();
			placementResourcePage.clickSiteLocationsTab();
			placementResourcePage.clickNewSiteLocations();
			placementResourcePage.setTextOnSite("LocationName",
					testData.get(Constants.PlacementAccount_SHEET).get("locationName"));
			placementResourcePage.setTextOnSite("Street", testData.get(Constants.PlacementAccount_SHEET).get("street"));
			placementResourcePage.checkPrimaryCheckBox();
			placementResourcePage.setTextOnSite("City", testData.get(Constants.PlacementAccount_SHEET).get("city"));
			placementResourcePage.setState(testData.get(Constants.PlacementAccount_SHEET).get("state"));
			placementResourcePage.setTextOnSite("ZipCode",
					testData.get(Constants.PlacementAccount_SHEET).get("zipCode"));
			placementResourcePage.setTextOnSite("Latitude",
					testData.get(Constants.PlacementAccount_SHEET).get("latitude"));
			placementResourcePage.setTextOnSite("Longitude",
					testData.get(Constants.PlacementAccount_SHEET).get("longitude"));
			providerAgencyAccountPage.clickOnSaveSite();
			count++;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0173 Case Management - New Placement Search Criteria Create Placement Resource Account");
		}

	}

	@Test(enabled=false,description = "US:0173 Case Management - New Placement Search Criteria Create Provider Agency Account", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 1)
	public void CreateProviderAccount() throws AcisException, InterruptedException, IOException {
		try {
			if (count == 1) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();

				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAccount();
				homePage_SFDCPage.selectAllAccount();
				homePage_SFDCPage.clickNewButton();
				providerAgencyAccountPage.selectRadioButton();
				providerAgencyAccountPage.setTextOnProvider("AccountName", excel.generateRandomTestData("Demo", 2));
				providerAgencyAccountPage.setProviderAgencyType("LicensedChildPlacementAgency");
				providerAgencyAccountPage.clickOnSave();
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0173 Case Management - New Placement Search Criteria Create Provider Agency Account");
		}

	}

	@Test(description = "US:0173 Case Management - New Placement Search Criteria Create Foster Care Case", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 2)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			if (count == 2) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowCaseHead();
				homePage_SFDCPage.selectAllCaseHeads();
				homePage_SFDCPage.clickFirstRecord();
				fosterCaseID = caseHeadPage.newFosterCase();
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US:0173 Case Management - New Placement Search Criteria Create Foster Care Case");
		}

	}

	@Test(description = "US:0173 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 3)
	public void FosterCareCreatePerson() throws AcisException, InterruptedException, IOException {
		try {
			if (count == 3) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
				fosterCareCase_Page.clickRelatedTab();
				fosterCareCase_Page.clickPersonTab();
				fosterCareCase_Page.clickNewPerson();
				personsInvovled_CP_OmniscriptPage.searchNewPerson(childFirstName);
				personsInvovled_CP_OmniscriptPage.clickCreateAddButton();
				personsInvovled_CP_OmniscriptPage.setAllNames("first", childFirstName, childMiddleName, childLastName);
				personsInvovled_CP_OmniscriptPage.provideBirthdate("first", "2010");
				personsInvovled_CP_OmniscriptPage.prvoideGender("first", "Male");
				personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
				personsInvovled_CP_OmniscriptPage.clickNextButton();
				establishRelationships_CP_OmniScriptPage.clickSubmit();
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0173 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}

	}

	@Test(description = "US:0173 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 4)
	public void FosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			if (count == 4) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
				fosterCareCase_Page.clickPlacementTab();
				fosterCareCase_Page.clickNewPlacement();

//				newPlacement_OmniScriptPage.selectICPCPlacement("Yes");
//				newPlacement_OmniScriptPage.verifyPlacementTypeDisabled();
				newPlacement_OmniScriptPage.clickDownIconEdit();
				newPlacement_OmniScriptPage.selectSpecialNeeds("Medically Complex");
				newPlacement_OmniScriptPage.saveButton();
				newPlacement_OmniScriptPage.selectICPCPlacement("No");
				newPlacement_OmniScriptPage.selectTypeOfPlacement("Relative Foster");
				newPlacement_OmniScriptPage.enterZipCode("94115");
				newPlacement_OmniScriptPage.selectStartDate();
				newPlacement_OmniScriptPage.enterRadius("10");
				newPlacement_OmniScriptPage.clickSearchButton();
				placementSearchResults_OmniScriptPage.verifyPlacementResourceNF();
				placementSearchResults_OmniScriptPage.clickPreviousButton();
				newPlacement_OmniScriptPage.clearZipCode();
				newPlacement_OmniScriptPage.enterZipCode("46011");
				newPlacement_OmniScriptPage.clickSearchButton();
				placementSearchResults_OmniScriptPage.verifyLabels();
				placementSearchResults_OmniScriptPage.selectFirstRecord();
				placementSearchResults_OmniScriptPage.clickSubmitButton();

			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0173 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}

	}

}
