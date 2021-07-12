package com.acis.automation.testcases.casemanagement;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _770_AutocreatePlacementResourceFosterChildRelationshipTest extends TestBase{
	
	public  _770_AutocreatePlacementResourceFosterChildRelationshipTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	final static Logger logger = LoggerFactory.getLogger(_770_AutocreatePlacementResourceFosterChildRelationshipTest.class);
	String fosterCaseID,allegationID;
	
	String childSecondFirstName =  faker.name().firstName();
	String childSecondMiddleName = faker.name().firstName();
	String childSecondLastName = faker.name().lastName();
	 String placementName = "demo";
	
	@Test( description = "US:770 Case Management -  Auto-create Placement Resource-Foster Child Relationship-Create Foster Care Case", groups = {
			"High", "acisRegression", "Priyanka" }, priority = 0)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			logger.info("Clicked on DownArrow"+placementName);
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseHead();
			homePage_SFDCPage.clickFirstRecord();
			//homePage_SFDCPage.selectAllCaseHeads();
			//homePage_SFDCPage.searchRecordAndClick("Case Head New");
			fosterCaseID = caseHeadPage.newFosterCaseWithoutHousholdMember();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US:0770 Case Management - Auto-create Placement Resource-Foster Child Relationship-Create Foster Care Case");
		}

	}
	
	
	 @Test(enabled=false, description = "US-770 Case Management -  Auto-create Placement Resource-Foster Child Relationship-Create Placement Account", groups = {
			"High", "acisRegression", "Priyanka" }, priority = 1)
	public void CreatePlacementAccount() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();

			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAccount();
			homePage_SFDCPage.selectAllAccount();
			homePage_SFDCPage.clickNewButton();
			placementResourcePage.selectRadioButton();
			placementResourcePage.setTextOnPlacement("AccountName", placementName);
			placementResourcePage.setPlacementType("RelativeFoster");
			placementResourcePage.setTextOnPlacement("Capacity", "10");
			placementResourcePage.setTextOnPlacement("Occupancy", "1");
			placementResourcePage.setStatus("Licensed");
			placementResourcePage.selectSpecialNeeds("Medically Complex");
			placementResourcePage.clickOnSave();
			placementResourcePage.clickRelatedTab();
			placementResourcePage.clickSiteLocationsTab();
			placementResourcePage.clickNewSiteLocations();
			placementResourcePage.setTextOnSite("Street", "510 S Burnside Ave");
			placementResourcePage.setTextOnSite("LocationName", "Demo Location");
			placementResourcePage.checkPrimaryCheckBox();
			placementResourcePage.setTextOnSite("City", "Los Angeles");
			placementResourcePage.setState("California");
			placementResourcePage.setTextOnSite("ZipCode", "46011");
			providerAgencyAccountPage.clickOnSaveSite();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:770 Case Management -  Auto-create Placement Resource-Foster Child Relationship-Create Placement Account");
		}

	}
	

	@Test( description = "US:770 Case Management -  Auto-create Placement Resource-Foster Child Relationship- Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Priyanka" }, priority = 2)
	public void fosterCareCreatePerson() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickRelatedTab();
			fosterCareCase_Page.clickPersonTab();
			fosterCareCase_Page.clickNewPerson();
			
			personsInvovled_CP_OmniscriptPage.searchNewPerson("a");
			personsInvovled_CP_OmniscriptPage.clickCreateAddButton();
			personsInvovled_CP_OmniscriptPage.setAllNames("first", childSecondFirstName, childSecondMiddleName, childSecondLastName);
			personsInvovled_CP_OmniscriptPage.provideBirthdate("first", "2010");
			personsInvovled_CP_OmniscriptPage.prvoideGender("first", "Male");
			personsInvovled_CP_OmniscriptPage.clickSaveButton("next");
			personsInvovled_CP_OmniscriptPage.clickNextButton();
			establishRelationships_CP_OmniScriptPage.clickSubmit();


		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:770 Case Management - Auto-create Placement Resource-Foster Child Relationship- Foster Care Case Add Person");
		}

	}
	
	@Test( description = "US:770 Case Management -  Auto-create Placement Resource-Foster Child Relationship- Foster Care Case Person mapped with placement", groups = {
			"High", "acisRegression", "Priyanka" }, priority = 3)
	public void fosterCareCaseMappedWithPlacement() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickPlacementTab();
			fosterCareCase_Page.clickNewPlacement();
			//newPlacement_OmniScriptPage.click
			newPlacement_OmniScriptPage.clickDownIconEdit();
//			newPlacement_OmniScriptPage.enterTextChildTextbox(childSecondFirstName+" "+childSecondLastName);
			newPlacement_OmniScriptPage.selectSpecialNeeds("Medically Complex");
			newPlacement_OmniScriptPage.saveButton();
			newPlacement_OmniScriptPage.selectICPCPlacement("No");			
			newPlacement_OmniScriptPage.selectTypeOfPlacement("Relative Foster");
			newPlacement_OmniScriptPage.enterZipCode("46011");
			newPlacement_OmniScriptPage.selectStartDate();	
			newPlacement_OmniScriptPage.enterRadius("10");
			newPlacement_OmniScriptPage.clickSearchButton();
			placementSearchResults_OmniScriptPage.verifyLabels();
			placementSearchResults_OmniScriptPage.selectFirstRecord();
			placementSearchResults_OmniScriptPage.clickSubmitButton();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:770 Case Management - Auto-create Placement Resource-Foster Child Relationship- Foster Care Case Person mapped with placement");
		}
	}
	

	@Test(description = "US:770 Case Management - Auto-create Placement Resource-Foster Child Relationship- Verify End/Start Dates", groups = {
			"High", "acisRegression", "Priyanka" }, priority = 4)
	public void fosterCareCaseVerifyEndDate() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickPlacementTab();
			newPlacement_OmniScriptPage.editEndDateManually();
			String placementstartDate=newPlacement_OmniScriptPage.getPlacementStartDate();
			String placementEndDate=newPlacement_OmniScriptPage.editEndDateManuallyAndGetEndDate();	
			
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
		
			fosterCareCase_Page.clickOnCaseHeadValue();
			caseHeadPage.clickRelatedTab("Second Related tab");
			caseHeadPage.clickHouseholdRelationshipsLink();
			caseHeadPage.clickHouseholdRelationshipsId(childSecondFirstName);
			householdRelationshipPage.VerifyEndDates();
			householdRelationshipPage.VerifyStartDates();
			householdRelationshipPage.VerifyEndDateIsReadOnly();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:770 Case Management - Auto-create Placement Resource-Foster Child Relationship- Verify End Dates");
		}
	}
	
}