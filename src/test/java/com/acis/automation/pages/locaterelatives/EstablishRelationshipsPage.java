package com.acis.automation.pages.locaterelatives;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.pages.investigation.EstablishRelationships_IP_OmniScriptPage;
import com.acis.automation.utilities.AcisException;

public class EstablishRelationshipsPage extends PageBase {

	public EstablishRelationshipsPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(EstablishRelationships_IP_OmniScriptPage.class);

	// Dharmesh

	@FindBy(xpath = "(//button[text()='Create/Add'])[1]")
	WebElement createAddButton;

	@FindBy(xpath = "(//*[text()='Person']/../../..//input)[last()]")
	WebElement personTextbox;

	@FindBy(xpath = "(// label[text()='Relationship']/../../..//input[@required])[last()]")
	WebElement relationshipTextBox;

	@FindBy(xpath = "(//*[text()='Related To']/../../..//input[@required])[last()]")
	WebElement relatedToTextBox;

	@FindBy(xpath = "(//label[text()='Start Date']/../../..//input)[last()]")
	WebElement startDatePicker;

	@FindBy(xpath = "(//label[text()='End Date']/../../..//input)[last()]")
	WebElement endDatePicker;

	@FindBy(xpath = "//span[text()='20']")
	WebElement startDate;

	@FindBy(xpath = "(//span[text()='25'])[last()]")
	WebElement endDate;

	@FindBy(xpath = "(//button[text()='Save'])[last()]")
	WebElement save;

	@FindBy(xpath = "//span[text()='Next']")
	WebElement nextButton;

	@FindBy(xpath = "//h1[text()='Create Placement Resource']")
	WebElement createPlacementVerify;

	@FindBy(xpath = "(//button[text()='Create/Add'])[2]")
	WebElement createAddButtonPlacementRealtiosnhip;

	@FindBy(xpath = "(//*[text()='Placement Resource']/../../..//input)[last()]")
	WebElement placementResourceTextbox;

	@FindBy(xpath = "(// label[text()='Relationship']/../../..//input[@required])[last()]")
	WebElement placementRelationshipTextBox;

	@FindBy(xpath = "(//span[text()='Related To']/../../..//input)[last()]")
	WebElement placementrelatedToTextBox;

	@FindBy(xpath = "(//label[text()='Start Date']/../../..//input)[last()]")
	WebElement placementStartDatePicker;

	@FindBy(xpath = "(//label[text()='End Date']/../../..//input)[last()]")
	WebElement placementEndDatePicker;

	@FindBy(xpath = "//span[text()='20']")
	WebElement placementStartDate;

	@FindBy(xpath = "(//span[text()='25'])[last()]")
	WebElement placementEndDate;

	@FindBy(xpath = "(//*[text()='Save'])[last()]")
	WebElement placementSaveButton;

	@FindBy(xpath = "(//button[text()='Cancel'])[1]")
	WebElement cancelButton;

	@FindBy(xpath = "//span[text()='down icon']")
	WebElement downIcon;

	@FindBy(xpath = "//span[text()='Edit']")
	WebElement downIconEdit;

	@FindBy(xpath = "(//label[text()='End Date']/../../..//input)[2]")
	WebElement endDateField;

	@FindBy(xpath = "(//label[text()='Other Relationship Details']/../..//textarea)[1]")
	WebElement otherRelationship;

	@FindBy(xpath = "(// label[text()='Relationship']/../../..//input[@required])[1]")
	WebElement establishedRelationshipTextBox;

	// public By endDateField = By.xpath("(//label[text()='End
	// Date']/../../..//input)[2]");

	// public By otherRelationship = By.xpath("(//label[text()='Other Relationship
	// Details']/../..//textarea)[1]");
	public By otherOther = By.xpath("(//*[contains(text(),'Other-Other')])[2]");

	/**
	 * Click on Create/Add button
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void clickCreateAddButton() throws AcisException, InterruptedException {
		logger.info("Clicking on Create/Add button");
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(createAddButton);
		clickWebElement(createAddButton);
		logger.info("Clicked on Create/Add button");
		waitForPageLoadTill(5);
	}

	/**
	 * Set Person and Related To TextBox on Establish Relationship Page
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void searchText(String str, String Option) throws AcisException {
		waitForPageLoadTill(5);
		switch (Option) {
		case "Person":
			logger.info(" Case Person Setting as: " + str);
			clickWebElement(personTextbox);
			waitForPageLoadTill(5);
			waitForElement(driver.findElement(
					By.xpath("(//*[text()='Person']/../../..//span[contains(text(),'" + str + "')])[last()]")));
			clickWebElement(driver.findElement(
					By.xpath("(//*[text()='Person']/../../..//span[contains(text(),'" + str + "')])[last()]")));
			logger.info(" Case Person Selected as: " + str);
			break;
		case "Related":
			logger.info(" Related to Setting as: " + str);
			clickWebElement(relatedToTextBox);
			waitForPageLoadTill(5);
			waitForElement(driver.findElement(
					By.xpath("(//*[text()='Related To']/../../..//span[contains(text(),'" + str + "')])[last()]")));
			clickWebElement(driver.findElement(
					By.xpath("(//*[text()='Related To']/../../..//span[contains(text(),'" + str + "')])[last()]")));
			logger.info(" Related to Selected as: " + str);
			break;

		}
		waitForPageLoadTill(5);
	}

	/**
	 * Set Start Date and End Date on Establish Relationships Page
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void setDate(String option) throws AcisException {
		switch (option) {
		case "Start":
			logger.info("Setting Start Date");
			waitForElementClickable(startDatePicker);
			clickWebElement(startDatePicker);
			waitForElementClickable(startDate);
			clickWebElement(startDate);

			logger.info("Successfully set Start Date");
			break;
		case "End":
			logger.info("Setting End Date");
			waitForElementClickable(endDatePicker);
			clickWebElement(endDatePicker);
			waitForElementClickable(endDate);
			clickWebElement(endDate);
			logger.info("Successfully set End Date");
			break;
		default:
			logger.info(option + " Date not found");
			break;
		}

	}

	/**
	 * set Relationship on Establish RelationShips Page
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void setRelationShip(String option) throws AcisException, InterruptedException {
		logger.info(" Relationship Setting as: " + option);
		enterText(relationshipTextBox, option);
		waitForPageLoadTill(5);
		waitForElement(driver.findElement(By.xpath("//span[text()='" + option + "']")));
		clickWebElement(driver.findElement(By.xpath("//span[text()='" + option + "']")));
		logger.info(" Relationship Selected as: " + option);

	}

	/**
	 * Click on save button
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void clickSaveButton(String option) throws AcisException, InterruptedException {
		logger.info("Clicking on save button");
		waitForPageLoadTill(5);
		clickWebElement(save);
		logger.info("Clicked on save button");
		waitForPageLoadTill(5);

	}

	/***
	 * clicking Next button
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 */

	public void clickNext() throws AcisException {

		Actions actions = new Actions(driver);
		waitForPageLoadTill(9);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		waitForPageLoadTill(9);
		clickWebElement(nextButton);
		waitForPageLoadTill(9);
		waitForElement(createPlacementVerify);
	}

	/**
	 * Click on Create/Add button of Placement Resource Relationships
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void clickCreateAddButtonPlacementResourceRelationships() throws AcisException, InterruptedException {
		logger.info("Clicking on Create/Add button of Placement Resource Relationships");
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(createAddButtonPlacementRealtiosnhip);
		clickWebElemntUsingJavascriptExecutor(createAddButtonPlacementRealtiosnhip);
		logger.info("Clicked on Create/Add button of Placement Resource Relationships");
		waitForPageLoadTill(5);
	}

	/**
	 * Set Person and Related To TextBox on Establish Relationship Page for
	 * Placement Resource Relationships
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void searchTextPlacementResourceRelationships(String str, String Option) throws AcisException {
		switch (Option) {
		case "Placement Resource":
			logger.info(" Placement Resource  Setting as: " + str);
			clickWebElemntUsingJavascriptExecutor(placementResourceTextbox);
			waitForPageLoadTill(5);
			waitForElement(driver.findElement(By.xpath(
					"(//span[text()='Placement Resource']/../../..//span[contains(text(),'" + str + "')])[last()]")));
			clickWebElement(driver.findElement(By.xpath(
					"(//span[text()='Placement Resource']/../../..//span[contains(text(),'" + str + "')])[last()]")));
			logger.info(" Case Person Selected as: " + str);
			break;
		case "Related":
			logger.info(" Related to Setting as: " + str);
			clickWebElemntUsingJavascriptExecutor(relatedToTextBox);
			waitForPageLoadTill(5);
			waitForElement(driver.findElement(
					By.xpath("(//span[text()='Related To']/../../..//span[contains(text(),'" + str + "')])")));
			clickWebElement(driver.findElement(
					By.xpath("(//span[text()='Related To']/../../..//span[contains(text(),'" + str + "')])")));
			logger.info(" Related to Selected as: " + str);
			break;

		}
		waitForPageLoadTill(5);
	}

	/**
	 * Set Start Date and End Date on Establish Relationships Page of Placement
	 * Resource Relationships
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 */
	public void setDatePlacementResourceRelationships(String option) throws AcisException {
		switch (option) {
		case "Start":
			logger.info("Setting Start Date");
			waitForElementClickable(placementStartDatePicker);
			clickWebElement(placementStartDatePicker);
			waitForElementClickable(placementStartDate);
			clickWebElement(placementStartDate);

			logger.info("Successfully set Start Date");
			break;
		case "End":
			logger.info("Setting End Date");
			waitForElementClickable(placementEndDatePicker);
			clickWebElement(placementEndDatePicker);
			waitForElementClickable(placementEndDate);
			clickWebElement(placementEndDate);
			logger.info("Successfully set End Date");
			break;
		default:
			logger.info(option + " Date not found");
			break;
		}

	}

	/**
	 * set Relationship on Establish RelationShips Page
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void setRelationShipPlacementResourceRelationships(String option)
			throws AcisException, InterruptedException {
		logger.info(" Relationship Setting as: " + option);
		enterText(placementRelationshipTextBox, option);
		waitForPageLoadTill(5);
		waitForElement(driver.findElement(By.xpath("(//*[contains(text(),'" + option + "')])[last()]")));
		clickWebElemntUsingJavascriptExecutor(
				driver.findElement(By.xpath("(//*[contains(text(),'" + option + "')])[last()]")));
		logger.info(" Relationship Selected as: " + option);

	}

	/**
	 * Click on save button of Placement Resource Relationships
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void clickSaveButtonPlacementResourceRelationships() throws AcisException, InterruptedException {
		logger.info("Clicking on save button");
		clickWebElemntUsingJavascriptExecutor(placementSaveButton);
		logger.info("Clicked on save button");
		waitForPageLoadTill(5);

	}

	/***
	 * relationship type Other-Other
	 * 
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException
	 */
	public void otherOtherRelationship() throws AcisException {
		logger.info(" Relationship Setting as Other-Other");
		if (isElementPresent(otherOther)) {
			waitForPageLoad();
			waitForElement(otherRelationship);
			logger.info(" Relationship Setting as Other-Other");
		} else {
			logger.info(" Relationship not Set as Other-Other");
		}
	}

	/***
	 * Click on Cancel Button
	 * 
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException
	 */
	public void cancelBtn() throws AcisException {
		logger.info("Clicking on Cancel button");
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(cancelButton);
		clickWebElemntUsingJavascriptExecutor(cancelButton);
		logger.info("Clicked on Cancel button");
	}

	/***
	 * Click on down Icon
	 * 
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException
	 */
	public void clickDownIconEdit() throws AcisException {
		logger.info("Clicking on Down Icon button");
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(downIcon);
		clickWebElemntUsingJavascriptExecutor(downIcon);
		waitForElement(downIconEdit);
		clickWebElemntUsingJavascriptExecutor(downIconEdit);
		logger.info("Clicked on Down Icon button");
	}

	/***
	 * Verifying start date with placement end date
	 * 
	 * @author Pallavi
	 * @throws AcisException
	 */

	public void VerifyEndDateIsReadOnly() {
		logger.info("Verifying End Date of  Foster Parent-Foster Child relationship is Read-only:  ");
		boolean endDateIsReadOnly = endDateField.isEnabled();
		Assert.assertTrue(endDateIsReadOnly, "End Date of  Foster Parent-Foster Child relationship is Read-only");
		logger.info("Verified End Date of  Foster Parent-Foster Child relationship is Read-only:  ");
	}

	/**
	 * set Relationship on Establish RelationShips Page
	 * 
	 * @author Pallavi
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void setEstablishedRelationShip(String option) throws AcisException, InterruptedException {
		logger.info(" Relationship Setting as: " + option);
		enterText(establishedRelationshipTextBox, option);
		waitForPageLoadTill(5);
		waitForElement(driver.findElement(By.xpath("//span[text()='" + option + "']")));
		clickWebElement(driver.findElement(By.xpath("//span[text()='" + option + "']")));
		logger.info(" Relationship Selected as: " + option);

	}

}
