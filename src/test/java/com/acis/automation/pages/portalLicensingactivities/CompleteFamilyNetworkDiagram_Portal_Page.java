package com.acis.automation.pages.portalLicensingactivities;

import java.awt.AWTException;

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

public class CompleteFamilyNetworkDiagram_Portal_Page extends PageBase{

	public CompleteFamilyNetworkDiagram_Portal_Page() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	public static Logger logger = LoggerFactory.getLogger(CompleteFamilyNetworkDiagram_Portal_Page.class);
	
	
	
	@FindBy (xpath = "//*[text()='Complete Family Network Diagram']")
	WebElement completeFamilyNetworkDiagram;
	
	@FindBy (xpath = "//h1//*[text()='Complete Family Network Diagram']")
	WebElement completeFamilyNetworkDiagramVerify;
	
	
	
	
	@FindBy(xpath = "(//*[text()='Upload Files'])[1]")
    WebElement 	uploadFilesButton;

	
	
	
	@FindBy(xpath = "//*[text()='Standards']")
    WebElement 	standards;
	
	@FindBy(xpath = "//*[contains(text(),'The prospective foster parents provide a family network diagram for the household')]")
    WebElement 	standards_Messgae;
	
	@FindBy(xpath = "//*[text()='Standards']/..//*[text()='Help']/../../button")
    WebElement 	standardsHelpButton;
	
	@FindBy(xpath = "//*[contains(text(),'Reason: To provide DCS a clear understanding of the household members and their relationships with any other individuals who may have contact with the foster child(ren)')]")
    WebElement 	standards_HelpMessgae;
	
	@FindBy(xpath = "(//*[text()='Task Owner'])[1]")
    WebElement taskOwner;	
	
	
	
	
	@FindBy(xpath = "//*[text()='Instructions']/..//*[text()='Click for more information']/../../button")
    WebElement 	instructionsHelpButton;
	
	@FindBy(xpath = "//button[@title='Cancel']")
	WebElement instructionsCancelButton;
	
	@FindBy(xpath = "//*[contains(text(),'Please complete and upload a copy of the Family Network Diagram')]")
    WebElement 	instructions_Messgae;
	
	@FindBy (xpath = "//*[contains(text(),'The Family Network Diagram (FND) is a pictorial representation of a family?s connections to') and contains(text(),'their extended family, persons, and/or systems in their environment')]")
	WebElement instructions_HelpMessage;
	
	
	

	@FindBy(xpath = "(//*[@rel='noreferrer'])[2]")
    WebElement 	taskOwner_Value;
	
	@FindBy(xpath = "(//*[text()='Task']/../..//span)[3]")
	WebElement task_Value;

	
	
	
	/**
	 *  Click on Complete Family Network Diagram
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	Actions act = new Actions(driver);
	
	public void completeFamilyNetworkDiagramTab() throws AcisException {
		logger.info("Clicking on Agree to Complete Family Network Diagram Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(completeFamilyNetworkDiagram);
		clickWebElement(completeFamilyNetworkDiagram);
		waitForPageLoad();
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(completeFamilyNetworkDiagramVerify);
		logger.info("Clicked on Agree to Complete Family Network Diagram Tab");
	}
	
	
	
	/**
	 * Click  on upload file button and upload file
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 * @throws AWTException 
	 * @throws InterruptedException 
	 * 
	 */
	public void clickAddFilesAndUpload(String filepath) throws AcisException, InterruptedException, AWTException {
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicking on Page Down");
		waitForElement(uploadFilesButton);
		waitForPageLoadTill(5);
		clickWebElement(uploadFilesButton);
		logger.info("Clicked on Upload Button");
		waitForPageLoadTill(5);
		uploadFileUsingRobot(filepath);
		waitForPageLoadTill(5);
	//	clickWebElement(doneButton);
		waitForPageLoadTill(5);
		waitForPageLoad();
		driver.navigate().refresh();
		logger.info("file uploaded successfully");
		waitForPageLoadTill(5);
		waitForPageLoad();
		refreshPage();
		waitForPageLoadTill(10);
		waitForPageLoad();
	}
	
	
	
	/**
	 * Verifying standards
	 * @author prateeksha.mahesh
	 */
	public void verifyStandardsMessage() throws AcisException {
		logger.info("Checking Standards Message");
		Assert.assertTrue(standards_Messgae.isDisplayed(), "Error: Mismatch in standards Messages");
//		clickWebElement(taskOwner);
//		act.sendKeys(Keys.ARROW_DOWN).build().perform();
//		act.sendKeys(Keys.ARROW_DOWN).build().perform();
//		act.sendKeys(Keys.ARROW_DOWN).build().perform();
//		waitForPageLoadTill(5);
//		clickWebElement(standardsHelpButton);
//		//hoverOverElement(standardsHelpButton);
//		Assert.assertTrue(standards_HelpMessgae.isDisplayed(), "Error: Mismatch in standards help Messages");
		logger.info("Checked Standards Message");
}

	
	
	/**  Verifying Instructions 
	 *  @author prateeksha.mahesh
	 *  @throws AcisException
	 */

	public void verifyInstructionsMessage() throws AcisException {
		logger.info("Checking Instructions Message");
		Assert.assertTrue(instructions_Messgae.isDisplayed(), "Error: Mismatch in Instructions Messages");
		scrollingToElementofAPage(instructionsHelpButton);
		clickWebElement(instructionsHelpButton);
		Assert.assertTrue(instructions_HelpMessage.isDisplayed(), "Error: Mismatch in Instructions help Messages");
		clickWebElement(instructionsCancelButton);
		logger.info("Checked Instructions Message");
	}
	
	
	
	/**
	 * Check Task Owner Value
	 * @author prateeksha.mahesh
	 */
	public void checkTaskOwnerValue(String taskOwnerValue) {
		logger.info("Check Task Owner Value: " + taskOwnerValue);
		Assert.assertTrue((taskOwner_Value.getText()).contains(taskOwnerValue), "Error: Task OwnerValue does not match. Actual Value is :"+ taskOwner_Value.getText() 
									+ "Expected Value: " + taskOwnerValue);
		logger.info("Checked Task Owner Value: " + taskOwnerValue);
	}
	
	
	
	/**
	 * Check Task Value
	 * @author prateeksha.mahesh
	 */
	public void checkTaskValue(String taskValue) {
		logger.info("Check Task Value: " + taskValue);
		Assert.assertTrue((task_Value.getText()).contains(taskValue), "Error: Task OwnerValue does not match. Actual Value is :"+ task_Value.getText() 
									+ "Expected Value: " + taskValue);
		logger.info("Checked Task Value: " + taskValue);
	}
	
	
	/**
	 * Delete File with from file name
	 * @author prateeksha.mahesh
	 */
	public void deleteFile(String fileName) throws AcisException {
		logger.info("Delete File with from file name: "+ fileName);
		clickWebElement(driver.findElement(By.xpath("//*[text()='" + fileName +"']/../../..//button[@title='Delete file']")));
		waitForPageLoadTill(5);
		logger.info("Deleted File with from file name: "+ fileName);
	}
}



