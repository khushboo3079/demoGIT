package com.acis.automation.testcases.providermanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _0251_CreateProviderAgencyTest extends TestBase {

	public _0251_CreateProviderAgencyTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(_0251_CreateProviderAgencyTest.class);

	@Test(description = "US:0251 Create Provider Agency    ", groups = { "High", "acisRegression", "Khushboo" })

	public void createProviderAgency() throws AcisException, InterruptedException, IOException {
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAccount();
		fosterPlacementPage.clickOnNew();
		fosterPlacementPage.clickOnRadioButton("Provider Agency");
		providerAgencyAccountPage.setTextOnProvider("AccountName", excel.generateRandomTestData("Demo", 4));
		// providerAgencyAccountPage.clickOnSave();
		// ServiceContractPage.checkErrorMessage();
		providerAgencyAccountPage.setProviderAgencyType("ChildCare");
		providerAgencyAccountPage.clickOnSavebtn();
		providerAgencyAccountPage.clickRelatedTab();
		serviceContractPage.clickonNewServiceContract();
		serviceContractPage.textareaContractName("Test");
		serviceContractPage.selectPerformance("Target Performance Measure 1");
		serviceContractPage.selectPerformance("Target Performance Measure 2");
		serviceContractPage.selectPerformance("Target Performance Measure 3");
		serviceContractPage.selectPerformance("Actual Performance Measure 1");
		serviceContractPage.selectPerformance("Actual Performance Measure 2");
		serviceContractPage.selectPerformance("Actual Performance Measure 3");
		serviceContractPage.saveButton();

	}

}
