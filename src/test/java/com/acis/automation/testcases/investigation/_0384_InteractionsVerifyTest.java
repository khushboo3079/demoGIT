package com.acis.automation.testcases.investigation;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.testcases.LoginTest;
import com.acis.automation.utilities.AcisException;

public class _0384_InteractionsVerifyTest extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(_0384_InteractionsVerifyTest.class);

	public _0384_InteractionsVerifyTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String allegationID, maltreator, victim, victimSecond;
	int count = 0;

	@Test(priority = 0, description = "S-0384:Rename Case Contacts and Contacts Persons Intake creation", groups = {
			"High", "ACIS_Regression", "Dharmesh" })
	public void intakeCreation() throws AcisException, InterruptedException, IOException {
		try {
			LoginTest loginTest = new LoginTest();
			
			loginTest.login("intakeUserName");

			maltreator = testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName").concat(" ")
					.concat(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"));
			victim = testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName").concat(" ")
					.concat(testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.clickNewButton();
			investigationTest.intakeCreationTwoPerson();
			/*
			reportDetailsOmniscriptPage.setDate("Intake");
			reportDetailsOmniscriptPage.selectIntakeMethod();
			reportDetailsOmniscriptPage.reporterAnonymousNo(testData.get(Constants.REPORTDETAILSPAGE).get("firstName"),
					testData.get(Constants.REPORTDETAILSPAGE).get("lastName"),
					testData.get(Constants.REPORTDETAILSPAGE).get("middleName"),
					"",
					"",
					testData.get(Constants.REPORTDETAILSPAGE).get("role"));
			//testData.get(Constants.REPORTDETAILSPAGE).get("phone")
			//testData.get(Constants.REPORTDETAILSPAGE).get("email")
			reportDetailsOmniscriptPage
					.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
			reportDetailsOmniscriptPage.setDate("Incident");
			reportDetailsOmniscriptPage.clickNextBtn();
			searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
			searchPerson_OmniscriptPage.linkToCreateNewPerson();
			
			
			createIntakePerson_OmniscriptPage.setAllNames(
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"),
					testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"),
					testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"));
			createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
			createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
//			createIntakePerson_OmniscriptPage.provideContactInformation(
//					testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
//					testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
					testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
					testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
//			createIntakePerson_OmniscriptPage
//					.provideState(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstState"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstZipCode"));
			createIntakePerson_OmniscriptPage.clickPrimaryAddress();
			createIntakePerson_OmniscriptPage
					.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
			createIntakePerson_OmniscriptPage
					.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));

			createIntakePerson_OmniscriptPage.clickSaveButton();
			createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
			searchPerson_OmniscriptPage.linkToCreateNewPerson();
			
			createIntakePerson_OmniscriptPage.setAllNames(
					testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName"),
					testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"),
					testData.get(Constants.PersonInvovledAllData).get("secondPersonLastName"));
			createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
//			createIntakePerson_OmniscriptPage.provideContactInformation(
//					testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
//					testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
					testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet1"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
					testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet2"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
					testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstCity"));
//			createIntakePerson_OmniscriptPage
//					.provideState(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstState"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
					testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstZipCode"));
			createIntakePerson_OmniscriptPage.clickPrimaryAddress();
			createIntakePerson_OmniscriptPage
					.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstBirthYear"));
			createIntakePerson_OmniscriptPage
					.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstGender"));

			createIntakePerson_OmniscriptPage.clickSaveButton();
			createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
			personsInvovled_OmniscriptPage.clickRefresPersonButton();
			*/
			personsInvovled_OmniscriptPage.clickNextButton();
			agencyHistory_OmniscriptPage.clickNextButton();
			structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent();
			structuredDecisionMakingOmniscriptPage.clickNextButton();
			// Options : screenOut||familyServices||investigation
			// screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
			// Options : workerComments||supervisoryComments||narrative
			screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
			screeningDecision_OmniscriptPage.selectAssociateExistingInvestigation("No");
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
			// Options : newCase||existingCase
			screeningDecision_OmniscriptPage.newAllegations("Abuse",maltreator, victim);
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			allegationReportPage.verifyingAllegationReportStatusSubmitted();
			allegationID = allegationReportPage.getAllegationID();
			count++;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed S-0384:Rename Case Contacts and Contacts Persons Intake creation");

		}

	}

	@Test(priority=1,description = "S-0384:Rename Case Contacts and Contacts Persons Allegation Approval", groups = { "Medium",
			"acisRegression", "Dharmesh" })
	public void submitIntake() throws AcisException, InterruptedException, IOException {

		try {
			if (count == 1) {
				LoginTest loginTest = new LoginTest();
				
				loginTest.login("supervisorUserName");

				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(allegationID);
				investigationTest.intakeApproval();
				/*
				allegationReportPage.clickIntakeBtn();
				reportDetailsOmniscriptPage.clickNextBtn();
				personsInvovled_OmniscriptPage.clickNextButton();
				agencyHistory_OmniscriptPage.clickNextButton();
				structuredDecisionMakingOmniscriptPage.clickNextButton();
				screeningDecision_OmniscriptPage.selectAcceptAssign();
				screeningDecision_OmniscriptPage.clickSubmitbtn();
				allegationReportPage.verifyingAllegationReportStatus();*/
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed S-0384:Rename Case Contacts and Contacts Persons Allegation Approval");

		}
	}

	@Test(priority = 2, description = "S-0384:Rename Case Contacts and Contacts Persons Verify Workflow", groups = {
			"Medium", "ACIS_Regression", "Dharmesh" })
	public void investigationFlow() throws AcisException {
		try {
			if (count == 2) {
				LoginTest loginTest = new LoginTest();
				
				loginTest.login("investigatorUserName");

				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(allegationID);
				allegationReportPage.clickRelatedTab();
				allegationReportPage.clickonAlligationRecord();
				investigationCasePage.clickInvestigationWorkflow();
				reviewAllegationReport_OmniScriptPage.clickNextButton();
				personsInvovled_Workflow_OmniscriptPage.clickNextButton();
				establishRelationships__OmniScriptPage.clickNextButton();
				interview_OmniScriptPage.clickCreateInterviewLink();
				interview_OmniScriptPage.iframeSwitch();
				interview_OmniScriptPage.provideDate();
				interview_OmniScriptPage.prvoideType("Visit");
				interview_OmniScriptPage.prvoideLocation("Biological Home");
				interview_OmniScriptPage.prvoideSubType("Child");
				interview_OmniScriptPage.prvoideMethod("Phone");
				interview_OmniScriptPage.enterTextFieldValueOnInterview("narrative", "Interviw narrative Demo");
				interview_OmniScriptPage.enterTextFieldValueOnInterview("profesionalopinion",
						"Interviw profesionalopinion Demo");
				interview_OmniScriptPage.clickParticipantCheckbox(maltreator);
				interview_OmniScriptPage.clickSavebutton();
				interview_OmniScriptPage.closeCaregiverTab();
				interview_OmniScriptPage.clickNextButton();
				// Collateral
				collaterals_OmniScriptPage.clickNextButton();
				// Record
				//recordReview_OmniScriptPage.clickRefresh();
				recordReview_OmniScriptPage.nextPage();
				findings_OmniScriptPage.verifyInterationsLabel();
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed S-0384:Rename Case Contacts and Contacts Persons Verify Workflow");

		}
	}

	@Test(priority = 3, description = "S-0384:Rename Case Contacts and Contacts Persons Verify Workflow", groups = {
			"Medium", "ACIS_Regression", "Dharmesh" })
	public void investigationRelatedList() throws AcisException {
		try {
			if (count == 3) {
				LoginTest loginTest = new LoginTest();
				
				loginTest.login("investigatorUserName");

				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(allegationID);
				allegationReportPage.clickRelatedTab();
				allegationReportPage.clickonAlligationRecord();
				investigationCasePage.clickRelatedTab();
				investigationCasePage.clickInteractionsTab();
				investigationCasePage.verifyInteraction();
				investigationCasePage.clickFirstRecord();
				investigationCasePage.verifyInteractionsParticipants();
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed S-0384:Rename Case Contacts and Contacts Persons Verify Workflow");

		}
	}
}
