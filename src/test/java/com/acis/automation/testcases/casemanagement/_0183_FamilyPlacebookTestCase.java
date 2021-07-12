package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _0183_FamilyPlacebookTestCase extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(_0183_FamilyPlacebookTestCase.class);

	public _0183_FamilyPlacebookTestCase() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String allegationID, fosterCaseID;

	String narrativeData = testData.get(Constants.OOhservicesCasePage).get("narrative");

	String caseId = testData.get(Constants.FamilyPlaceBook).get("CaseNo");

	String permanency = testData.get(Constants.OOhservicesCasePage).get("permanencyStatus");

	String childFirstName = faker.name().firstName();
	String childMiddleName = faker.name().firstName();
	String childLastName = faker.name().lastName();

	String firstName = faker.name().firstName();
	String middleName = faker.name().firstName();
	String lastName = faker.name().lastName();

	int count = 0;

	

	@Test(enabled = true, description = "US:0183  Foster Id creation for case management pre requisite 1 intake creation", groups = {
			"High", "acisRegression", "Akash" }, priority = 0)

	public void OverrideScreeningDecission() throws AcisException, InterruptedException, IOException {
		try {

			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			home.verfiyHomePage();

			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.clickNewButton();
			reportDetailsOmniscriptPage.setDate("Intake");
			reportDetailsOmniscriptPage.selectIntakeMethod();
			reportDetailsOmniscriptPage.reporterAnonymousNo(testData.get(Constants.REPORTDETAILSPAGE).get("firstName"),
					testData.get(Constants.REPORTDETAILSPAGE).get("lastName"),
					testData.get(Constants.REPORTDETAILSPAGE).get("middleName"),
					"",
					"",
					testData.get(Constants.REPORTDETAILSPAGE).get("role"));
//			testData.get(Constants.REPORTDETAILSPAGE).get("phone")
//			testData.get(Constants.REPORTDETAILSPAGE).get("email")
			reportDetailsOmniscriptPage
					.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
			reportDetailsOmniscriptPage.setDate("Incident");
			reportDetailsOmniscriptPage.clickNextBtn();
			searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
			searchPerson_OmniscriptPage.linkToCreateNewPerson();

			createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
			createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
			createIntakePerson_OmniscriptPage
					.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
			createIntakePerson_OmniscriptPage
					.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));
			createIntakePerson_OmniscriptPage.clickSaveButton();
			createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
			personsInvovled_OmniscriptPage.clickNextButton();
			agencyHistory_OmniscriptPage.clickNextButton();
			structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent();
			structuredDecisionMakingOmniscriptPage.clickNextButton();
			screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
			screeningDecision_OmniscriptPage.selectCaseHead(firstName+" "+middleName);
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
			screeningDecision_OmniscriptPage.clickSubmitbtn();

			allegationID = allegationReportPage.getAllegationID();
		
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US:0173 Case Management - New Placement Search Criteria intake creation");
		}

	}

	@Test(enabled = true, description = "US:0183  Foster Id creation for case management pre requisite intake submisison", groups = { "High",
			"acisRegression", "Akash" }, priority = 1)
	public void OverrideSupervisor() throws AcisException, InterruptedException, IOException {
		try {
		
				String allegationReportIdNoAfterIsApprove = "";

				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();

				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();

				homePage_SFDCPage.searchGlobal(allegationID);
				allegationReportPage.clickIntakeBtn();
				reportDetailsOmniscriptPage.clickNextBtn();
				personsInvovled_OmniscriptPage.clickNextButton();
				agencyHistory_OmniscriptPage.clickNextButton();
				structuredDecisionMakingOmniscriptPage.clickNextButton();
				screeningDecision_OmniscriptPage.selectAcceptAssign();
				screeningDecision_OmniscriptPage.enterTextFieldValue("supervisoryComments", "Demo");
				screeningDecision_OmniscriptPage.clickSubmitbtn();
				screeningDecision_OmniscriptPage.cancelButton();
				allegationReportIdNoAfterIsApprove = allegationReportPage.verifyingAllegationReportStatus();
				allegationReportPage.verifyingAllegationStatusAfterOveride(allegationReportIdNoAfterIsApprove);
				count++;
		

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US:0173 Case Management - New Placement Search Criteria intake approval");
		}

	}
	
	
	
	
	
	
	
	
	@Test(enabled=true,description = "US:0183  Foster Id creation for case management pre requisite 3 child creation", groups = {
			"High", "acisRegression", "Akash" }, priority = 3)
	public void FosterCareCreatePerson() throws AcisException, InterruptedException, IOException {
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
			System.out.println(childFirstName + " " + childMiddleName + " " + childLastName);
			personsInvovled_CP_OmniscriptPage.searchNewPerson(childFirstName);
			personsInvovled_CP_OmniscriptPage.clickCreateAddButton();
			personsInvovled_CP_OmniscriptPage.setAllNames("first", childFirstName, childMiddleName, childLastName);
			personsInvovled_CP_OmniscriptPage.provideBirthdate("first", "2010");
			personsInvovled_CP_OmniscriptPage.clickSaveButton("next");
			personsInvovled_CP_OmniscriptPage.clickNextButton();
			establishRelationships_CP_OmniScriptPage.clickSubmit();
		

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S-0164 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}
	}

	@Test(enabled = true, description = "US:0183  Foster Id creation for case management pre requisite3 foster care creation", groups = {
			"High", "acisRegression", "Akash" }, priority = 2)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {

			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseHead();
			homePage_SFDCPage.selectAllCaseHeads();
		//	homePage_SFDCPage.clickFirstRecord();
			homePage_SFDCPage.searchRecordAndClick(firstName+" "+middleName+" "+lastName);
			fosterCaseID = caseHeadPage.newFosterCase();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US:0173 Case Management - New Placement Search Criteria Create Foster Care Case");
		}

	}

	@Test(enabled = true, description = "US-0183 Family Playbook - Create New Case Plan", groups = { "High",
			"acisRegression", "Akash" }, priority = 4)
	public void CreatePlacementAccount() throws AcisException, InterruptedException, IOException {
		String narrativeData = testData.get(Constants.OOhservicesCasePage).get("narrative");

		String caseId = testData.get(Constants.FamilyPlaceBook).get("CaseNo");

		String permanency = testData.get(Constants.OOhservicesCasePage).get("permanencyStatus");

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
				testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));

		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);

	
		visitationPlan_OmniScriptPage.casePlan();
		// visitationPlan_OmniScriptPage.addPermanencyPlan("First");
		permanencyPlan_OmniScriptPage.setPermanencyGoalsFor(childFirstName + " " + childLastName);
		permanencyPlan_OmniScriptPage.primaryFirst("reunification");
		permanencyPlan_OmniScriptPage.setPermanencyNarrative("demo");
		permanencyPlan_OmniScriptPage.clickNextButton();
		servicesToTheChildren_OmniScriptPage.clickNextButton();
		serviceAgreementWithParents_OmniScriptPage.clickNextButton();
		visitationPlan_OmniScriptPage.addParentalVisitationPlan("No");
		visitationPlan_OmniScriptPage.addSiblingVisitations("No");
		visitationPlan_OmniScriptPage.clickNext();
		serviceToProviderPage.clickNext();
		serviceToProviderPage.clickSubmit();
		visitationPlan_OmniScriptPage.closePlan();

		familyPlacebookPage.newCaseLinK();

		casePlanReviewPage.editingAgenyPlan();
		familyPlacebookPage.fillingFamilyAgencyform("PermanencyPlan");
		casePlanReviewPage.savingClickingNewCasePlan();
		familyPlacebookPage.verifycasePlanIncompetent();

		// personIncomePage.deleteAllData();

	}

	@Test(enabled = true, description = "US-0183 Family Playbook - Create New Case Plan selcting nO", groups = { "High",
			"acisRegression", "Akash" }, priority = 5)
	public void CreatePlacementAccountSelctingNo() throws AcisException, InterruptedException, IOException {

		String caseId = testData.get(Constants.FamilyPlaceBook).get("CaseId");

		String parental = testData.get(Constants.OOhservicesCasePage).get("parentalStatus");
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
				testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));

		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();

		homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);

		familyPlacebookPage.casePlan();

		casePlanReviewPage.editingAgenyPlan();

		familyPlacebookPage.fillingFamilyAgencyform("PermanencyPlan");
		familyPlacebookPage.fillingFamilyAgencyform("PermanencyPlan1");
		familyPlacebookPage.fillingFamilyAgencyform("Placement");
		familyPlacebookPage.fillingFamilyAgencyform("Placement1");

		familyPlacebookPage.fillingFamilyAgencyform("Health");
		familyPlacebookPage.fillingFamilyAgencyform("Health1");
		familyPlacebookPage.fillingFamilyAgencyform("Education");
		familyPlacebookPage.fillingFamilyAgencyform("Education1");
		familyPlacebookPage.fillingFamilyAgencyform("MentalHealth");
		familyPlacebookPage.fillingFamilyAgencyform("MentalHealth1");
		familyPlacebookPage.fillingFamilyAgencyform("Other");
		familyPlacebookPage.fillingFamilyAgencyform("other1");
		familyPlacebookPage.fillingFamilyAgencyform("read");
		familyPlacebookPage.fillingFamilyAgencyform("read1");
		familyPlacebookPage.fillingFamilyAgencyform("serviceAgreement");
		familyPlacebookPage.fillingFamilyAgencyform("serviceAgreement1");
		familyPlacebookPage.fillingFamilyAgencyform("parentalVisitation");
		familyPlacebookPage.fillingFamilyAgencyform("parentalVisitation1");
		familyPlacebookPage.fillingFamilyAgencyform("sibling");
		familyPlacebookPage.fillingFamilyAgencyform("sibling1");
		familyPlacebookPage.fillingFamilyAgencyform("serviceProvider");
		familyPlacebookPage.fillingFamilyAgencyform("serviceProvider1");
		casePlanReviewPage.savingClickingNewCasePlan();
		familyPlacebookPage.newCasePlanAfterFillingAllDropdowns();
		familyPlacebookPage.clickNext();
		serviceToProviderPage.clickSubmit();

		serviceToProviderPage.closeButton();
		visitationPlan_OmniScriptPage.verifyInterview(parental);

		// personIncomePage.deleteAllData();

	}
}
