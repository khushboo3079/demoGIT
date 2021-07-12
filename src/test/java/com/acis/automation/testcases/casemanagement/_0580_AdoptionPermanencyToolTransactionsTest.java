package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _0580_AdoptionPermanencyToolTransactionsTest extends TestBase {

	public _0580_AdoptionPermanencyToolTransactionsTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(_0580_AdoptionPermanencyToolTransactionsTest.class);
	public static String allegationID;
	String childFirstName = faker.name().firstName();
	String childMiddleName =faker.name().firstName();
	String childLastName = faker.name().lastName();

	String secondChildFirstName = faker.name().firstName();
	String secondChildMiddleName = faker.name().firstName();
	String secondChildLastName = faker.name().lastName();

	@Test(description = "S-0580 Adoption Permanency Tool Transactions", groups = { "Medium", "ACIS_Regression",
			"Khushboo" })

	public void adoptionPermanencyToolTransactions() throws AcisException, InterruptedException, IOException {
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
				testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowCaseHead();
		caseHeadPage.createNewCaseHead(excel.generateRandomTestData("Demo", 4));
		caseHeadPage.newFosterCaseWithoutHousholdMember();
		caseHeadPage.clickRelatedTab("Second Related tab");
		caseHeadPage.clickOnNewPerson();
		personsInvovled_CP_OmniscriptPage.searchPersonUsingvalidData("firstName",
				excel.generateRandomTestData(excel.generateRandomTestData("", 6), 4));
		personsInvovled_CP_OmniscriptPage.linkToCreateNewPerson();
		personsInvovled_CP_OmniscriptPage.setAllNames("first", childFirstName, childMiddleName, childLastName);
		personsInvovled_CP_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("first", "age", "15");
		personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
		personsInvovled_CP_OmniscriptPage.searchPersonUsingvalidData("firstName",
				excel.generateRandomTestData(excel.generateRandomTestData("", 6), 4));
		personsInvovled_CP_OmniscriptPage.linkToCreateNewPerson();
		personsInvovled_CP_OmniscriptPage.setAllNames("first", secondChildFirstName, secondChildMiddleName, secondChildLastName);
		personsInvovled_CP_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("first", "age", "15");
		personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
		personsInvovled_CP_OmniscriptPage.clickAddButton();
		personsInvovled_CP_OmniscriptPage.selectExistingPlacementResources("FirstN");
		personsInvovled_CP_OmniscriptPage.clickOnSave();
		personsInvovled_CP_OmniscriptPage.clickNextButton();
		establishRelationships_CP_OmniScriptPage.clickCreateAddButtonPlacementResourceRelationships();

		establishRelationships_CP_OmniScriptPage.searchTextPlacementResourceRelationships("FirstNameAxq",
				"Placement Resource");
		establishRelationships_CP_OmniScriptPage
				.setRelationShipPlacementResourceRelationships("Prospective Provider-Prospective Adoptive Child");
		establishRelationships_CP_OmniScriptPage.searchTextPlacementResourceRelationships(childFirstName + "",
				"Related");
		establishRelationships_CP_OmniScriptPage.clickSaveButtonPlacementResourceRelationships();
		establishRelationships_CP_OmniScriptPage.clickSubmit();
		// first child case plan
		// casePlanPage.clickInsightsTab();
		fosterCareCase_Page.clickCasePlanTab();
		casePlanPage.clickNewCasePlan();
		permanencyPlan_OmniScriptPage.setPermanencyGoalsFor(childFirstName + "");
		permanencyPlan_OmniScriptPage.primaryFirst("adoption");
		permanencyPlan_OmniScriptPage.setPermanencyNarrative("Demo testing");
		permanencyPlan_OmniScriptPage.clickNextButton();
		servicesToTheChildren_OmniScriptPage.clickNextButton();
		serviceAgreementWithParents_OmniScriptPage.clickNextButton();
		visitationPlan_OmniScriptPage.addParentalVisitationPlan("No");
		visitationPlan_OmniScriptPage.addSiblingVisitations("No");
		visitationPlan_OmniScriptPage.clickNext();
		serviceToProviderPage.clickSubmit();
		casePlanPage.closeNewCasePlanWindow();
		casePlanPage.closeCasePlanTab();
		// Second child case plan
		fosterCareCase_Page.clickCasePlanTab();
		casePlanPage.clickNewCasePlan();
		permanencyPlan_OmniScriptPage.setPermanencyGoalsFor(secondChildFirstName + "");
		permanencyPlan_OmniScriptPage.primaryFirst("adoption");
		permanencyPlan_OmniScriptPage.setPermanencyNarrative("Demo testing");
		permanencyPlan_OmniScriptPage.clickNextButton();
		servicesToTheChildren_OmniScriptPage.clickNextButton();
		serviceAgreementWithParents_OmniScriptPage.clickNextButton();
		visitationPlan_OmniScriptPage.addParentalVisitationPlan("No");
		visitationPlan_OmniScriptPage.addSiblingVisitations("No");
		visitationPlan_OmniScriptPage.clickNext();
		serviceToProviderPage.clickSubmit();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowHome();
		permanencyHomePage.clickGo(childFirstName + " " + childMiddleName + " " + childLastName);
		permanencyHomePage.checkStatus(childFirstName + " " + childMiddleName + " " + childLastName, "File TPR");
		permanencyHomePage.clickGo(childFirstName + " " + childMiddleName + " " + childLastName);
		permanencyHomePage.checkStatus(childFirstName + " " + childMiddleName + " " + childLastName,
				"Prepare for Court");
		permanencyHomePage.clickGo(childFirstName + " " + childMiddleName + " " + childLastName);
		newLegalAction_OmniScriptPage.switchToWindow();
		// prepare for court Action
		newLegalAction_OmniScriptPage.courtCaseNumber("123245");
		newLegalAction_OmniScriptPage.dateTime("courtCaseActionDateTime");
		newLegalAction_OmniScriptPage.courtActionType("PermanencyGoal");
		newLegalAction_OmniScriptPage
				.addCourtActionParticipant(childFirstName + " " + childMiddleName + " " + childLastName);
		newLegalAction_OmniScriptPage.saveButton();
		newLegalAction_OmniScriptPage.closeWindowsExceptParent();
		homePage_SFDCPage.clickDownArrowHome();
		permanencyHomePage.clickGo(secondChildFirstName + " " + secondChildMiddleName + " " + secondChildLastName);
		newLegalAction_OmniScriptPage.switchToWindow();
		newLegalAction_OmniScriptPage.courtCaseNumber("123245");
		newLegalAction_OmniScriptPage.dateTime("courtCaseActionDateTime");
		newLegalAction_OmniScriptPage.courtActionType("PermanencyGoal");
		newLegalAction_OmniScriptPage
				.addCourtActionParticipant(secondChildFirstName + " " + secondChildMiddleName + " " + childLastName);
		newLegalAction_OmniScriptPage.saveButton();
		newLegalAction_OmniScriptPage.closeWindowsExceptParent();
		permanencyHomePage.clickGo(secondChildFirstName + " " + secondChildMiddleName + " " + secondChildLastName);
		permanencyHomePage.clickGo(secondChildFirstName + " " + secondChildMiddleName + " " + secondChildLastName);
		permanencyHomePage.clickGo(secondChildFirstName + " " + secondChildMiddleName + " " + secondChildLastName);
		permanencyHomePage.selectIntentToAdopt("No");
		permanencyHomePage.clickonOK();
		permanencyHomePage.clickGo(secondChildFirstName + " " + secondChildMiddleName + " " + secondChildLastName);
		permanencyHomePage.selectIntentToAdopt("Yes");
		// added second child
		newLegalAction_OmniScriptPage.switchToWindow();
		personsInvovled_CP_OmniscriptPage.clickNextButton();
		establishRelationships_CP_OmniScriptPage.clickCreateAddButtonPlacementResourceRelationships();

		establishRelationships_CP_OmniScriptPage.searchTextPlacementResourceRelationships("FirstNameAxq",
				"Placement Resource");
		establishRelationships_CP_OmniScriptPage
				.setRelationShipPlacementResourceRelationships("Prospective Provider-Prospective Adoptive Child");
		establishRelationships_CP_OmniScriptPage.searchTextPlacementResourceRelationships(secondChildFirstName + "",
				"Related");
		establishRelationships_CP_OmniScriptPage.clickSaveButtonPlacementResourceRelationships();
		establishRelationships_CP_OmniScriptPage.clickSubmit();
		newLegalAction_OmniScriptPage.closeWindowsExceptParent();

	}
}
