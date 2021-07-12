package com.acis.automation.pages.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class PlacementResourcePage extends PageBase {

	public PlacementResourcePage() throws AcisException {
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(PlacementResourcePage.class);

	@FindBy(xpath = "//h2[text()='New Account']/..//span[text()='Placement Resource']")
	WebElement placementResourceRadio;

	@FindBy(xpath = "//span[text()='Next']")
	WebElement nextButton;

	@FindBy(xpath = "//*[text()='Account Name']/../..//input[@type='text']")
	WebElement accountName;

	@FindBy(xpath = "//*[text()='Parent 1']/../..//input[@type='text']")
	WebElement parent1;

	@FindBy(xpath = "//*[text()='Parent 2']/../..//input[@type='text']")
	WebElement parent2;

	@FindBy(xpath = "//*[text()='Parent Account']/../..//input[@type='text']")
	WebElement parentAccount;

	@FindBy(xpath = "//*[text()='Account Number']/../..//input[@type='text']")
	WebElement accountNumber;

	@FindBy(xpath = "//*[text()='Placement Type']/../..//a")
	WebElement placementType;

	@FindBy(xpath = "//a[@title='Regular Foster']")
	WebElement regularFoster;
	
	@FindBy(xpath = "//a[@title='Treatment Foster']")
	WebElement treatmentFoster;
	
	@FindBy(xpath = "//a[@title='Kinship']")
	WebElement Kinship;
	
	@FindBy(xpath = "//a[@title='RTC']")
	WebElement rtc;
	
	@FindBy(xpath = "//a[@title='Hospital']")
	WebElement hospital;
	
	@FindBy(xpath = "//a[@title='Group Home']")
	WebElement groupHome;
	
	@FindBy(xpath = "//a[@title='Own Home']")
	WebElement ownHome;
	
	@FindBy(xpath = "//a[@title='Relative Foster']")
	WebElement relativeFoster;
	
	@FindBy(xpath = "//*[text()='Occupancy']/../..//input")
	WebElement occupancy;

	@FindBy(xpath = "//*[text()='Capacity']/../..//input")
	WebElement capacity;

	@FindBy(xpath = "//*[text()='Female Age Minimum']/../..//input")
	WebElement femaleAgeMinimum;

	@FindBy(xpath = "//*[text()='Male Age Minimum']/../..//input")
	WebElement maleAgeMinimum;

	@FindBy(xpath = "//*[text()='Female Age Maximum']/../..//input")
	WebElement femaleAgeMaximum;

	@FindBy(xpath = "//*[text()='Male Age Maximum']/../..//input")
	WebElement maleAgeMaximum;

	@FindBy(xpath = "//*[text()='Number of Beds']/../..//input")
	WebElement numberOfBeds;

	@FindBy(xpath = "//*[text()='Phone']/../..//input[@type='tel']")
	WebElement phone;

	@FindBy(xpath = "//*[text()='Email']/../..//input")
	WebElement email;

	@FindBy(xpath = "//*[text()='Provider Agency']/../..//input")
	WebElement providerAgency;

	@FindBy(xpath = "//*[text()='Number of Children in the Home']/../..//input")
	WebElement numberOfChildrenInTheHome;

	@FindBy(xpath = "//*[text()='Date of Certification']/../..//input")
	WebElement dateOfCertification;

	@FindBy(xpath = "//*[text()='Date of Recertification']/../..//input")
	WebElement dateOfRecertification;

	@FindBy(xpath = "//*[text()='Description']/../..//textarea")
	WebElement description;

	@FindBy(xpath = "//*[text()='Licensing Worker']/../..//input")
	WebElement licensingWorker;

	@FindBy(xpath = "//*[text()='Billing Street']/../..//textarea")
	WebElement billingStreet;

	@FindBy(xpath = "//*[text()='Billing City']/../..//input")
	WebElement billingCity;

	@FindBy(xpath = "//*[text()='Billing State/Province']/../..//input")
	WebElement billingStateProvince;

	@FindBy(xpath = "//*[text()='Billing Zip/Postal Code']/../..//input")
	WebElement billingZipPostalCode;

	@FindBy(xpath = "//*[text()='Billing Country']/../..//input")
	WebElement billingCountry;

	@FindBy(xpath = "//*[text()='Status']/../..//a")
	WebElement status;

	@FindBy(xpath = "//a[@title='Applicant']")
	WebElement applicant;
	
	@FindBy(xpath = "//a[@title='Approved']")
	WebElement approved;

	@FindBy(xpath = "//a[@title='In Progress']")
	WebElement inProgress;
	
	@FindBy(xpath = "//a[@title='Submitted']")
	WebElement submitted;

	@FindBy(xpath = "//a[@title='Licensed']")
	WebElement licensed;

	@FindBy(xpath = "//a[@title='On Hold']")
	WebElement onHold;

	@FindBy(xpath = "//a[@title='Closed']")
	WebElement closed;

	@FindBy(xpath = "//span[@title='Medically Complex']")
	WebElement medicallyComplex;
	
	@FindBy(xpath = "//span[@title='Teen Parent']")
	WebElement teenParent;
	
	@FindBy(xpath = "//span[@title='ESL']")
	WebElement esl;
	
	@FindBy(xpath = "//span[@title='Disabled']")
	WebElement disabled;
	
	@FindBy(xpath = "//span[@title='LGBTQ']")
	WebElement lgbtq;
	
	@FindBy(xpath = "//span[@title='SEN']")
	WebElement sen;
	
	@FindBy(xpath = "//*[text()='Special Needs Able to Accept']/..//button[@title='Move selection to Chosen']")
	WebElement specialNeedsAbleToAcceptSelect;

	@FindBy(xpath = "//button[@title='Save']")
	WebElement save;
	
	@FindBy(xpath = "//*[text()='Account ID']/../..//*[contains(text(),'A-00')]")
	WebElement accountVerify;
	
	@FindBy(xpath = "//*[text()='Related']")
	WebElement relatedTab;
	
	@FindBy(xpath = "//*[text()='Site Locations']")
	WebElement siteLocations;
	
	@FindBy(xpath = "//a[@title='New']")
	WebElement newSiteLocations;
	
	@FindBy(xpath = "//h2[text()='New Business Location']")
	WebElement siteLocationsVerify;
	
	@FindBy(xpath = "//*[text()='State']/../..//a[@class='select']")
	WebElement stateSelect;
	
	@FindBy(xpath = "//*[text()='Location Name']/../..//input[@type='text']")
	WebElement locationName;
	
	@FindBy(xpath = "//*[text()='Street 1']/../..//input[@type='text']")
	WebElement street;
	
	@FindBy(xpath = "//*[text()='City']/../..//input[@type='text']")
	WebElement city;
	
	@FindBy(xpath = "//*[text()='Latitude']/../..//input[@type='text']")
	WebElement latitude;
	
	@FindBy(xpath = "//*[text()='Longitude']/../..//input[@type='text']")
	WebElement longitude;
	
	@FindBy(xpath = "//*[text()='Zip/Postal Code']/../..//input[@type='text']")
	WebElement zipCode;
	
	@FindBy(xpath = "//*[text()='Primary Address']/../../input")
	WebElement primaryCheckBox;
	
	@FindBy(xpath = "//lightning-formatted-text[contains(.,'A-')]")
	WebElement accountID;
	
	@FindBy(xpath = "//*[@title='Details']//a")
	WebElement details;
	
	@FindBy(xpath = "//span[text()='Account']/../..//a")
	WebElement siteAccount;
	
	@FindBy(xpath = "//span[text()='Genogram']")
	WebElement genogramLabel;
	
	@FindBy(xpath = "//a[text()='Health']")
	WebElement healthTab;
	
	@FindBy(xpath = "//span[text()='Special Needs']")
	WebElement specialNeeds;
	
	@FindBy(xpath = "//span[text()='Special Needs']/../../../../../..//div[text()='New']")
	WebElement newSpecialNeeds;
	
	@FindBy(xpath = "//span[text()='Clinically diagnosed disability(ies)?']/../..//a")
	WebElement clinicallyDiagnosedDisabilities;
	
	@FindBy(xpath = "//label[text()='Clinically diagnosed disability(ies)?']/..//input")
	WebElement clinicallyDiagnosedDisabilitiesEdit;
	
	@FindBy(xpath ="//a[text()='Yes']")
	WebElement specialNeedsYes;
	
	@FindBy(xpath = "//*[text()='No']")
	WebElement specialNeedsNo;
	
	@FindBy(xpath = "//span[text()='Condition']/../..//a")
	WebElement condition;
	
	@FindBy(xpath = "//a[text()='Club Foot']")
	WebElement conditionclubFoot;
	
	@FindBy(xpath = "//span[text()='Type']/../..//a")
	WebElement type;
	
	@FindBy(xpath = "//a[text()='Physically Disabled']")
	WebElement typePhysicallyDisabled;
	
	@FindBy(xpath = "//button[@title='Save']")
	WebElement saveBtn;
	
	@FindBy(xpath = "(//button[text()='Edit'])[3]")
	WebElement editSpecialNeed;
	
	@FindBy(xpath = "//h1//*[text()='Business Location']")
	WebElement siteAccountVerify;
	
	public By approvedBy = By.xpath("//a[@title='Approved']");
	
	public By inprogressBy = By.xpath("//a[@title='In Progress']");
	
	public By closedBy = By.xpath("//a[@title='Closed']");
	
	public By onHoldBy = By.xpath("//a[@title='On Hold']");
	
	
	
	/**
	 * Get AccountID from an Placment Record
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public String getAccountID() throws AcisException {
		logger.info("Getting Account ID from Placement Account Record Page");
		refreshPage();
		waitForPageLoad();
		waitForPageLoadTill(5);
		clickWebElement(details);
		waitForElement(accountID);
		logger.info("Getting Account ID");
		System.out.println("Account ID : " +accountID.getText().trim());
		testLoggerInfo("Created Account ID " + accountID.getText().trim());
		logger.info("Returning Account ID from Placement Account Record Page");
		return(accountID.getText().trim());
		
	}
	
	
	/**
	 * Click on Account Name on Site Location Record
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void clickSiteAccount() throws AcisException {
		logger.info("Clicking on Account Name on Site Location");
		waitForPageLoad();
		waitForPageLoadTill(5);
		clickWebElement(siteAccount);
		logger.info("Clicked on Account Name on Site location");
	}
	
	/**
	 * Verify AccountID from an Placement Record
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void verifyAccountID(String accountID) throws AcisException {
		logger.info("Verifying Account ID from Placement Account Record Page");
		waitForPageLoad();
		waitForPageLoadTill(5);
		clickWebElement(details);
		waitForElementClickable(driver.findElement(By.xpath("//lightning-formatted-text[contains(.,'"+accountID+"')]")));
		logger.info("Verified Account ID from Placement Account Record Page");
		
	}
	
	/**
	 * Clicked on Related Tab on a Provider Agency Account Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void clickRelatedTab() throws AcisException {
		logger.info("Clicking on Related Tab");
		waitForElement(relatedTab);
		clickWebElemntUsingJavascriptExecutor(relatedTab);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked on Related Tab");

	}
	
	/**
	 * Clicked on Primary CheckBox on a Provider Agency Account Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void checkPrimaryCheckBox() throws AcisException {
		logger.info("Clicking on Primary CheckBox");
		waitForElement(primaryCheckBox);
		clickWebElement(primaryCheckBox);
		logger.info("Clicked on Primary CheckBox");

	}
	
	/**
	 * Clicked on Site Locations Tab on Provider Agency Record Created By
	 * Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void clickSiteLocationsTab() throws AcisException {
		logger.info("Clicking on New Person Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(siteLocations);
		clickWebElemntUsingJavascriptExecutor(siteLocations);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(newSiteLocations);
		logger.info("Clicked on New Person Tab");

	}
	
	/**
	 * Clicked on New SiteLocations on Case Person Tab Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void clickNewSiteLocations() throws AcisException {
		logger.info("Clicking on New Site Locations Button");
		clickWebElement(newSiteLocations);
		waitForElement(siteLocationsVerify);
		logger.info("Clicked on Site Locations Button");
	}
	
	/**
	 * Clicked on New SiteLocations on Case Person Tab Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void setState(String str) throws AcisException {
		logger.info("Selecting State");
		scrollingToElementofAPage(stateSelect);
		clickWebElement(stateSelect);
		waitForElement(stateSelect);
		waitForElementClickable(driver.findElement(By.xpath("//a[@title='"+str+"']")));
		clickWebElement(driver.findElement(By.xpath("//a[@title='"+str+"']")));
		waitForPageLoadTill(3);
		logger.info("Selected State");
	}
	
	/**
	 * Entering Text on New Provider Agency Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void setTextOnSite(String txtBox, String strText) throws AcisException {
		logger.info("Entering Text on " + txtBox + " TextBox as:" + strText);
		switch (txtBox) {
		case "LocationName":
			waitForElement(locationName);
			enterText(locationName, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "Street":
			waitForElement(street);
			enterText(street, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "City":
			waitForElement(city);
			enterText(city, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "ZipCode":
			waitForElement(zipCode);
			enterText(zipCode, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "Latitude":
			waitForElement(latitude);
			enterText(latitude, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "Longitude":
			waitForElement(longitude);
			enterText(longitude, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		default:
			logger.info(txtBox + " TextBox not found");
			break;
		}

	}

	/**
	 * Select Placement Resource Radio Button and Click Next Created by Dharmesh
	 * Krishna
	 * 
	 * @throws AcisException
	 */
	public void selectRadioButton() throws AcisException {
		logger.info("Selecting Provider Agency Radio Button");
		waitForElement(placementResourceRadio);
		clickWebElement(placementResourceRadio);
		clickWebElement(nextButton);
		logger.info("Selected Provider Agency Radio Button");
	}

	/**
	 * Entering Text on New Placement Resource Page Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void setTextOnPlacement(String txtBox, String strText) throws AcisException {
		logger.info("Entering Text on " + txtBox + " TextBox as:" + strText);
		switch (txtBox) {
		case "AccountName":
			waitForElement(accountName);
			enterText(accountName, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "Phone":
			waitForElement(phone);
			scrollingToElementofAPage(phone);
			enterText(phone, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "AccountNumber":
			waitForElement(accountNumber);
			enterText(accountNumber, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "Capacity":
			scrollingToElementofAPage(capacity);
			waitForElement(capacity);
			enterText(capacity, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "Occupancy":
			scrollingToElementofAPage(occupancy);
			waitForElement(occupancy);
			enterText(occupancy, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "MaleAgeMinimum":
			scrollingToElementofAPage(maleAgeMinimum);
			waitForElement(maleAgeMinimum);
			enterText(maleAgeMinimum, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "MaleAgeMaximum":
			scrollingToElementofAPage(maleAgeMaximum);
			waitForElement(maleAgeMaximum);
			enterText(maleAgeMaximum, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "FemaleAgeMinimum":
			scrollingToElementofAPage(femaleAgeMinimum);
			waitForElement(femaleAgeMinimum);
			enterText(femaleAgeMinimum, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "FemaleAgeMaximum":
			scrollingToElementofAPage(femaleAgeMaximum);
			waitForElement(femaleAgeMaximum);
			enterText(femaleAgeMaximum, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "NumberOfBeds":
			scrollingToElementofAPage(numberOfBeds);
			waitForElement(numberOfBeds);
			enterText(numberOfBeds, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "Email":
			waitForElement(email);
			enterText(email, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		case "NumberOfChildrenInTheHome":
			scrollingToElementofAPage(numberOfChildrenInTheHome);
			waitForElement(numberOfChildrenInTheHome);
			enterText(numberOfChildrenInTheHome, strText);
			logger.info("Entered Text on " + txtBox + " TextBox as:" + strText);
			break;
		default:
			logger.info(txtBox + " TextBox not found");
			break;
		}

	}

	/**
	 * Select Special Needs able to Foster Created by Dharmesh Krishna
	 * 
	 * @throws AcisException
	 */
	public void selectSpecialNeeds(String option) throws AcisException {
		logger.info("Selecting Special Needs able to Foster as :"+option);
		switch (option) {
		case "Medically Complex":
			scrollingToElementofAPage(medicallyComplex);
			waitForElementClickable(medicallyComplex);
			clickWebElement(medicallyComplex);
			clickWebElement(specialNeedsAbleToAcceptSelect);
			logger.info("Selected Special Needs able to Foster");
			break;
		case "Teen Parent":
			scrollingToElementofAPage(teenParent);
			waitForElementClickable(teenParent);
			clickWebElement(teenParent);
			clickWebElement(specialNeedsAbleToAcceptSelect);
			logger.info("Selected Special Needs able to Foster");
			break;
		case "ESL":
			scrollingToElementofAPage(esl);
			waitForElementClickable(esl);
			clickWebElement(esl);
			clickWebElement(specialNeedsAbleToAcceptSelect);
			logger.info("Selected Special Needs able to Foster");
			break;
		case "Disabled":
			scrollingToElementofAPage(disabled);
			waitForElementClickable(disabled);
			clickWebElement(disabled);
			clickWebElement(specialNeedsAbleToAcceptSelect);
			logger.info("Selected Special Needs able to Foster");
			break;
		case "LGBTQ":
			scrollingToElementofAPage(lgbtq);
			waitForElementClickable(lgbtq);
			clickWebElement(lgbtq);
			clickWebElement(specialNeedsAbleToAcceptSelect);
			logger.info("Selected Special Needs able to Foster");
			break;
		case "SEN":
			scrollingToElementofAPage(sen);
			waitForElementClickable(sen);
			clickWebElement(sen);
			clickWebElement(specialNeedsAbleToAcceptSelect);
			logger.info("Selected Special Needs able to Foster");
			break;
		default:
			break;
		}
		
	}

	
	/**
	 * Select Status Created by Dharmesh Krishna
	 * 
	 * @throws AcisException
	 */
	public void setStatus(String option) throws AcisException {
		logger.info("Selecting Placement Type");
		switch (option) {
		case "Applicant":
			scrollingToElementofAPage(status);
			clickWebElement(status);
			waitForElementClickable(applicant);
			clickWebElement(applicant);
			break;
		case "Submitted":
			scrollingToElementofAPage(status);
			clickWebElement(status);
			waitForElementClickable(submitted);
			clickWebElement(submitted);
			break;
		case "Licensed":
			scrollingToElementofAPage(status);
			clickWebElement(status);
			waitForElementClickable(licensed);
			clickWebElement(licensed);
			break;
		case "OnHold":
			scrollingToElementofAPage(status);
			clickWebElement(status);
			waitForElementClickable(onHold);
			clickWebElement(onHold);
			break;
		case "Closed":
			scrollingToElementofAPage(status);
			clickWebElement(status);
			waitForElementClickable(closed);
			clickWebElement(closed);
			break;

		default:
			break;
		}
		logger.info("Selected Placement Type as:" + option);
	}
	
	/**
	 * Select Placement Type Created by Dharmesh Krishna
	 * 
	 * @throws AcisException
	 */
	public void setPlacementType(String option) throws AcisException {
		logger.info("Selecting Placement Type");
		switch (option) {
		case "RelativeFoster":
			scrollingToElementofAPage(placementType);
			clickWebElement(placementType);
			waitForElementClickable(relativeFoster);
			clickWebElement(relativeFoster);
			break;
		case "RegularFoster":
			scrollingToElementofAPage(placementType);
			clickWebElement(placementType);
			waitForElementClickable(regularFoster);
			clickWebElement(regularFoster);
			break;
		case "TreatmentFoster":
			scrollingToElementofAPage(placementType);
			clickWebElement(placementType);
			waitForElementClickable(treatmentFoster);
			clickWebElement(treatmentFoster);
			break;
		case "Kinship":
			scrollingToElementofAPage(placementType);
			clickWebElement(placementType);
			waitForElementClickable(Kinship);
			clickWebElement(Kinship);
			break;
		case "RTC":
			scrollingToElementofAPage(placementType);
			clickWebElement(placementType);
			waitForElementClickable(rtc);
			clickWebElement(rtc);
			break;
		case "Hospital":
			scrollingToElementofAPage(placementType);
			clickWebElement(placementType);
			waitForElementClickable(hospital);
			clickWebElement(hospital);
			break;
		case "GroupHome":
			scrollingToElementofAPage(placementType);
			clickWebElement(placementType);
			waitForElementClickable(groupHome);
			clickWebElement(groupHome);
			break;
		case "OwnHome":
			scrollingToElementofAPage(placementType);
			clickWebElement(placementType);
			waitForElementClickable(ownHome);
			clickWebElement(ownHome);
			break;

		default:
			break;
		}
		logger.info("Selected Placement Type as:" + option);
	}
	
	
	/**
	 * Save Record Created by Dharmesh Krishna
	 * 
	 * @throws AcisException
	 */
	public void clickOnSave() throws AcisException {
		logger.info("Clicking on Save Button");
		clickWebElement(save);
		waitForElement(accountVerify);
		logger.info("Clicked on Save Button");
	}
	
	/**
	 * Save Site Record Created by Dharmesh Krishna
	 * 
	 * @throws AcisException
	 */
	public void clickOnSaveSite() throws AcisException {
		logger.info("Clicking on Save Button");
		clickWebElement(save);
		waitForElement(siteAccountVerify);
		logger.info("Clicked on Save Button");
	}
	
	
	/**
	 * Check Status  for Kinship Placement Type
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void checkStatus(String option) throws AcisException {
		logger.info("Checking status Type");
		switch (option) {
		case "Approved":
			scrollingToElementofAPage(status);
			clickWebElement(status);
			Assert.assertTrue(isElementPresent(approvedBy), "Error : No Approved Status for Kinship Placement Type");
			break;
		case "InProgress":
			scrollingToElementofAPage(status);
			clickWebElement(status);
			Assert.assertTrue(isElementPresent(inprogressBy), "Error : No InProgress Status for Kinship Placement Type");
			break;
		case "OnHold":
			scrollingToElementofAPage(status);
			clickWebElement(status);
			Assert.assertTrue(isElementPresent(onHoldBy), "Error : No OnHold Status for Kinship Placement Type");
			break;
		case "Closed":
			scrollingToElementofAPage(status);
			clickWebElement(status);
			Assert.assertTrue(isElementPresent(closedBy), "Error : No Closed Status for Kinship Placement Type");
			break;

		default:
			break;
		}
		logger.info("Checked status as:" + option);
	}
	
	/**Verify Genogram Label
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException
	 */
	public void verifyGenogramLabel() throws AcisException {
		logger.info("Verify Genogram Label");
		waitForPageLoad();
		waitForElement(genogramLabel);
		logger.info("Verified Genogram Label");
	}
	
	/*** Click Health Tab
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void clickHealthTab() throws AcisException {
		logger.info("Clicking on Health Tab");
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(healthTab);
		clickWebElemntUsingJavascriptExecutor(healthTab);
		waitForPageLoad();
		logger.info("Clicking on Health Tab");
	}
	/*** Click On Special Needs Tab
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void clickSpecialNeedsTab() throws AcisException {
		logger.info("Clicking On Special Needs Tab");
		waitForPageLoad();
		waitForElement(specialNeeds);
		clickWebElemntUsingJavascriptExecutor(specialNeeds);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicking On Special Needs Tab");
	}
	
	/*** Click On New Special Needs 
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void clickNewSpecialNeedsTab() throws AcisException {
		logger.info("Clicking On New Special Needs ");
		waitForPageLoad();
		waitForPageLoadTill(9);
		waitForElement(newSpecialNeeds);
		clickWebElemntUsingJavascriptExecutor(newSpecialNeeds);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicking On New Special Needs");
	}
	/***Select Yes and No for Clinically Diagnosed Disabilities
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 * 
	 */
	public void selectClinicallyDiagnosedDisabilities(String option) throws AcisException {
		waitForPageLoad();
		waitForPageLoadTill(5);
		switch (option) {
		case "Yes":
			logger.info("Selecting Yes for Clinically Diagnosed Disabilities");
			waitForElement(clinicallyDiagnosedDisabilities);
			clickWebElemntUsingJavascriptExecutor(clinicallyDiagnosedDisabilities);
			clickWebElemntUsingJavascriptExecutor(specialNeedsYes);
			waitForPageLoadTill(5);
			logger.info("Selected Yes for Clinically Diagnosed Disabilities");
			break;
			
		case "No":
			logger.info("Selecting No for Clinically Diagnosed Disabilities");
			waitForElement(clinicallyDiagnosedDisabilitiesEdit);
			clickWebElemntUsingJavascriptExecutor(clinicallyDiagnosedDisabilitiesEdit);
			clickWebElemntUsingJavascriptExecutor(specialNeedsNo);
			waitForPageLoadTill(5);
			logger.info("Selected No for Clinically Diagnosed Disabilities");
			break;
			
		}
	}
	
	/*** Select Condition ADD
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void selectConditionADD() throws AcisException {
		logger.info("Selecting ADD for Condition");
		waitForElement(condition);
		clickWebElemntUsingJavascriptExecutor(condition);
		clickWebElemntUsingJavascriptExecutor(conditionclubFoot);
		waitForPageLoadTill(5);
		logger.info("Selected ADD for Condition");
	}
	
	/*** Select Type Physical Disability
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void selectTypePhysicalDisability() throws AcisException {
		logger.info("Selecting ADD for Condition");
		waitForElement(type);
		clickWebElemntUsingJavascriptExecutor(type);
		clickWebElemntUsingJavascriptExecutor(typePhysicallyDisabled);
		waitForPageLoadTill(5);
		logger.info("Selected ADD for Condition");
		
	}
	
	/***Click on save Button
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void saveButton() throws AcisException {
		logger.info("Click on save Button");
		waitForElement(saveBtn);
		clickWebElemntUsingJavascriptExecutor(saveBtn);
		waitForPageLoadTill(5);
		logger.info("Clicked on save Button");
	}
	
	/***Click Edit Special Need
	 * 
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void editSpecialNeeds() throws AcisException {
		logger.info("Click Edit Special Need");
		waitForElement(editSpecialNeed);
		clickWebElemntUsingJavascriptExecutor(editSpecialNeed);
		waitForPageLoadTill(5);
		logger.info("Clicked on Edit Special Need");
	}
	
}
