package com.acis.automation.pages.caseplan;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

/**
 * @author akash.a.gaurav
 *
 */
public class FamilyPlacebookPage extends PageBase {

	public FamilyPlacebookPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(FamilyPlacebookPage.class);

	@FindBy(xpath = "(//a[contains(text(),'CP-')])[1]")
	WebElement caseIdLink;

	@FindBy(xpath = "//button[contains(normalize-space(),'New Case Plan')]")
	WebElement newCasePlan;

	@FindBy(xpath = "(//div[@class='slds-media__body']//p)[2]")
	WebElement error;

	@FindBy(xpath = "//a[text()='Case Plan Review']")
	WebElement casePlanReview;

	@FindBy(xpath = "(//span[text()='Permanency Plan']//..//..//..//..//button)[1]")
	WebElement editButtonPermannecyPlan;

	@FindBy(xpath = "//button[@title='Save']//span[contains(@class,'label bBody')][contains(normalize-space(),'Save')]")
	WebElement saveButtonAgency;

	@FindBy(xpath = "(//*[text()='Type of Service']/../../..//li//*[text()='Substance Abuse Treatment'])[last()]")
	WebElement substanceAbuseTreatment;

	@FindBy(xpath = "(//span[text()='Case Plans'])[last()]")
	WebElement casePlan3;

	@FindBy(xpath = "//*[text()='Please complete the Case Plan Review by entering Agency & Parent Progress on all sections.']")
	WebElement caseIncompleteerro;

	@FindBy(xpath = "(//span[text()='Permanency Plan'])[3]//..//..//a")
	WebElement permanencyPlan1;

	@FindBy(xpath = "(//*[@title='Meets'])[last()]")
	WebElement meetPermanencyplan;

	@FindBy(xpath = "(//a[@title='--None--'])[last()]")
	WebElement blank;

	@FindBy(xpath = "(//span[text()='Permanency Plan'])[4]//..//..//a")
	WebElement permanencyPlan2;

	@FindBy(xpath = "(//span[text()='Permanency Plan'])[3]/../..//*[text()='Meets'][last()]")
	WebElement meetPermanencyplan2;

	@FindBy(xpath = "(//span[text()='Placement'])[4]//..//..//a")
	WebElement placement1;

	@FindBy(xpath = "(//span[text()='Placement'])[3]//..//..//a")
	WebElement placement2;

	@FindBy(xpath = "(//span[text()='Placement'])[3]/../..//*[text()='Meets'][last()]")
	WebElement meetplacement1;

	@FindBy(xpath = "(//span[text()='Placement'])[4]/../..//*[text()='Meets'][last()]")
	WebElement meetplacement2;

	@FindBy(xpath = "(//span[text()='Education'])[4]//..//..//a")
	WebElement Education;

	@FindBy(xpath = "(//span[text()='Education'])[3]//..//..//a")
	WebElement Education1;

	@FindBy(xpath = "(//span[text()='Mental Health'])[4]//..//..//a")
	WebElement mentalHealth;

	@FindBy(xpath = "(//span[text()='Mental Health'])[3]//..//..//a")
	WebElement mentalHealth1;

	@FindBy(xpath = "(//span[text()='Other'])[4]//..//..//a")
	WebElement other;

	@FindBy(xpath = "(//span[text()='Other'])[3]//..//..//a")
	WebElement other1;

	@FindBy(xpath = "(//span[text()='Ready by 21'])[3]//..//..//a")
	WebElement readBy21first;

	@FindBy(xpath = "(//span[text()='Ready by 21'])[4]//..//..//a")
	WebElement readBy21second;

	@FindBy(xpath = "(//span[text()='Service Agreement with Parent(s)'])[3]//..//..//a")
	WebElement serviceAgreement;

	@FindBy(xpath = "(//span[text()='Service Agreement with Parent(s)'])[4]//..//..//a")
	WebElement serviceAgreement1;

	@FindBy(xpath = "(//span[text()='Parental Visitation Plan'])[3]//..//..//a")
	WebElement parentalVisitation;

	@FindBy(xpath = "(//span[text()='Parental Visitation Plan'])[4]//..//..//a")
	WebElement parentalVisitation1;

	@FindBy(xpath = "(//span[text()='Sibling Visitation Plan'])[3]//..//..//a")
	WebElement sibingVisitation;

	@FindBy(xpath = "(//span[text()='Sibling Visitation Plan'])[4]//..//..//a")
	WebElement sibingVisitation1;

	@FindBy(xpath = "(//span[text()='Services to Provider(s)'])[3]//..//..//a")
	WebElement serviceProvider;

	@FindBy(xpath = "(//span[text()='Services to Provider(s)'])[4]//..//..//a")
	WebElement serviceProvider1;

	@FindBy(xpath = "(//span[text()='Health'])[4]//..//..//a")
	WebElement Health;

	@FindBy(xpath = "(//span[text()='Health'])[3]//..//..//a")
	WebElement Health1;
	
	
	@FindBy(xpath="(//span[text()='Save'])[3]")
	WebElement saveeditAgency;
	
	@FindBy(xpath="(//span[text()='Save'])[2]")
	WebElement saveafterEdit;

	
	@FindBy(xpath = "//button[text()='Next']")
	WebElement nextButton;
	
	
	@FindBy(xpath="(//span[@class='slds-radio_faux'])[2]")
	WebElement noCheckBox;
	
	
	
	@FindBy(xpath="(//span[@class='slds-radio_faux'])[1]")
	WebElement yesCheckBox;
	
	@FindBy(xpath="//span[contains(normalize-space(),'Name:')]")
	WebElement name;
	
	
	
	@FindBy(xpath="//span[contains(text(),'Are there any ch')]")
	WebElement permanencyPlanQuestion;
	
	
	@FindBy(xpath = "(//label[text()='Child']//..//..//input)[1]")
	WebElement ChildTextAreaParental;
	
	
	@FindBy(xpath = "(//label[text()='Child']//..//..//input)[2]")
	WebElement ChildTextAreaSibling;
	
	
	@FindBy(xpath = "(//label[text()='Parent']//..//..//input)[1]")
	WebElement ParenTextArea;
	
	

	@FindBy(xpath = "(//label[text()='Sibling']//..//..//input)")
	WebElement siblingTextArea;
	
	
	@FindBy(xpath="//span[text()='OK']")
	WebElement okButton;
	
	@FindBy(xpath="(//span[text()='Save'])[2]")
WebElement afterDropdown;
	
	public By OkVerify = By.xpath("//span[text()='OK']");
	
	
	
	
	
	

	/***
	 * Clicking on case plan review
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */

	public void clickcasePlanReview() throws AcisException {
		logger.info("Clicking on case plan review");

		waitForPageLoadTill(9);
		Actions actions = new Actions(driver);
		waitForPageLoadTill(9);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		waitForPageLoadTill(9);
		jse.executeScript("window.scrollBy(0,650)");
		waitForPageLoadTill(19);
		waitForElementClickable(casePlan3);
		actions.moveToElement(casePlan3).doubleClick().build().perform();

		waitForPageLoadTill(15);
		logger.info("Clicking on caseId link");
		clickWebElement(caseIdLink);
		waitForPageLoad();
		waitForPageLoadTill(9);
		waitForElement(casePlanReview);
		clickWebElement(casePlanReview);
		waitForPageLoadTill(9);
		clickWebElement(casePlanReview);
		logger.info("Clicked on case plan review");
	}

	/***
	 * VErifying the error
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */

	public void verifycasePlanIncompetent() throws AcisException {

		waitForPageLoadTill(5);
		logger.info("Verifying incompetent eror");
		verifyElementNotPresent(caseIncompleteerro);
		logger.info("Verifyied incompetent eror");

	}

	/***
	 * answer "No" to the question "Are there any changes to this section of the
	 * Case Plan?" for any section/step
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */

	public void fillingFamilyAgencyform(String subtypeOption) throws AcisException {

		switch (subtypeOption) {
		case "PermanencyPlan":
			logger.info("Selecting Primary 1 as :" + subtypeOption);
			clickWebElemntUsingJavascriptExecutor(permanencyPlan1);
			waitForPageLoadTill(6);
			clickWebElement(meetPermanencyplan);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 1 as :" + subtypeOption);
			break;

		case "PermanencyPlan1":
			logger.info("Selecting Primary 1 as :" + subtypeOption);
			clickWebElemntUsingJavascriptExecutor(permanencyPlan2);
			waitForPageLoadTill(6);
			clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 1 as :" + subtypeOption);
			break;

		case "Placement":
			logger.info("Selecting Primary 1 as :" + subtypeOption);
			clickWebElemntUsingJavascriptExecutor(placement1);
			waitForPageLoadTill(6);
			clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 1 as :" + subtypeOption);
			break;

		case "Placement1":
			logger.info("Selecting Primary 1 as :" + subtypeOption);
			clickWebElemntUsingJavascriptExecutor(placement2);
			waitForPageLoadTill(6);
			clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 1 as :" + subtypeOption);
			break;

			

		case "Health":
			logger.info("Selecting Primary 1 as :" + subtypeOption);
			clickWebElemntUsingJavascriptExecutor(Health);
			waitForPageLoadTill(6);
			clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 1 as :" + subtypeOption);
			break;		
		
			
			
		case "Health1":
			logger.info("Selecting Primary 1 as :" + subtypeOption);
			clickWebElemntUsingJavascriptExecutor(Health1);
			waitForPageLoadTill(6);
			clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
			waitForPageLoadTill(2);
			logger.info("Selected Primary 1 as :" + subtypeOption);
			break;		
			
		  case "Education": 
			  logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(Education); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
		  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +
		  subtypeOption); 
		  break;
		  
		  case "Education1": 
			 logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(Education1); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
		  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +
		  subtypeOption); 
		  break; 
		  
		  
		  case "MentalHealth": 
				logger.info("Selecting Primary 1 as :" + subtypeOption);
			  clickWebElemntUsingJavascriptExecutor(mentalHealth); 
			  waitForPageLoadTill(6);
			  clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
			  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +
			  subtypeOption); 
			  break; 
			  
			  
		  case "MentalHealth1": 
				logger.info("Selecting Primary 1 as :" + subtypeOption);
			  clickWebElemntUsingJavascriptExecutor(mentalHealth1); 
			  waitForPageLoadTill(6);
			  clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
			  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +
			  subtypeOption); 
			  break; 
		  
		  
		  case "Other":
		  logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(other); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
		  waitForPageLoadTill(2); 
		  logger.info("Selected Primary 1 as :" +
		  subtypeOption); break;
		  
		  
		  case "other1": 
		logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(other1); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
		  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +subtypeOption); 
		  break;
		  
		  case "read": 
			 logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(readBy21first); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
		  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +
		  subtypeOption); 
		  break;
		  
		  
		  case "read1": 
			 logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(readBy21second); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
		  waitForPageLoadTill(2); 
		  logger.info("Selected Primary 1 as :" +subtypeOption); 
		  break;
		  
		  
		  case "serviceAgreement": 
			  logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(serviceAgreement); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
		  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +
		  subtypeOption); break;
		  
		  
		  case "serviceAgreement1": 
			logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(serviceAgreement1); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
		  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +subtypeOption); 
		  break;
		  
		  
		  
		  
		  
		  case "parentalVisitation": 
		logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(parentalVisitation); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
		  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +
		  subtypeOption); break;
		  
		  
		  case "parentalVisitation1": 
			logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(parentalVisitation1); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
		  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +subtypeOption); 
		  break;
		  
		  
		  case "sibling": 
				logger.info("Selecting Primary 1 as :" + subtypeOption);
			  clickWebElemntUsingJavascriptExecutor(sibingVisitation); 
			  waitForPageLoadTill(6);
			  clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
			  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +subtypeOption); 
			  break;
		  
			  

		  case "sibling1": 
			logger.info("Selecting Primary 1 as :" + subtypeOption);
			  clickWebElemntUsingJavascriptExecutor(sibingVisitation1); 
			  waitForPageLoadTill(6);
			  clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
			  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +subtypeOption); 
			  break;
		  
		  case "serviceProvider": 
			  logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(serviceProvider); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
		  waitForPageLoadTill(2); logger.info("Selected Primary 1 as :" +subtypeOption); 
		  break;
		  
		  
		  case "serviceProvider1": 
			logger.info("Selecting Primary 1 as :" + subtypeOption);
		  clickWebElemntUsingJavascriptExecutor(serviceProvider1); 
		  waitForPageLoadTill(6);
		  clickWebElemntUsingJavascriptExecutor(meetPermanencyplan);
		  waitForPageLoadTill(2); 
		  
		  logger.info("Selected Primary 1 as :" +subtypeOption); 
		  break;
		  
		 
			case "blank":
				logger.info("Selecting Primary 1 as :" + subtypeOption);
				clickWebElemntUsingJavascriptExecutor(permanencyPlan1);
				waitForPageLoadTill(6);
				clickWebElement(blank);
				waitForPageLoadTill(2);
				logger.info("Selected Primary 1 as :" + subtypeOption);
				break;
	  

		default:
			logger.info("No seleted Primary 1");
			break;
		}

	}

	/***
	 * Clicking in click review plan and editing
	 * 
	 * @throws AcisException
	 */

	public void editingAgenyPlan() throws AcisException {
		logger.info("Clicking case plan and editing review");
		waitForPageLoad();
		waitForPageLoadTill(9);
		clickWebElement(casePlanReview);
		waitForPageLoadTill(9);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		waitForPageLoadTill(9);
		jse.executeScript("window.scrollBy(0,140)");
		waitForPageLoadTill(9);
		try {
			clickWebElement(editButtonPermannecyPlan);
		} catch (Exception e) {

			clickWebElemntUsingJavascriptExecutor(editButtonPermannecyPlan);
			waitForPageLoadTill(9);
		}

		logger.info("Clicking case plan and editing review");
	}
/***
 * Saving and creating new case plan
 * @throws AcisException 
 */
	
	
	public void savingClickingNewCasePlan() throws AcisException
		{
			logger.info("Clicking on save button");
		
			waitForPageLoadTill(9);
			clickWebElemntUsingJavascriptExecutor(saveeditAgency);
			waitForPageLoadTill(12);
			
			if (isElementPresent(OkVerify)) {
				logger.info("Clicking on Close Button");
				waitForElementClickable(okButton);
				clickWebElement(okButton);
				logger.info("Clicked on Close Button");
			}

			
			
			
			logger.info("Clicked on saved Button");
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			waitForPageLoadTill(9);
			jse.executeScript("window.scrollBy(0,-940)");
			waitForPageLoadTill(9);
			try {
				clickWebElement(saveafterEdit);
			} catch (Exception e) {
				clickWebElement(saveeditAgency);
			}
			waitForPageLoadTill(9);
			clickWebElemntUsingJavascriptExecutor(newCasePlan);
			logger.info("Clicked on new case plan link");
			waitForPageLoadTill(22);
			
		}

	
	
	/***
	 * Clicking on Next and navigate
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */
	public void clickNext() throws AcisException {
		waitForPageLoad();
		waitForPageLoadTill(19);
		logger.info("Verifying question in permanency plan question");
		
		verifyElementNotPresent(permanencyPlanQuestion);
		logger.info("Verified question in permanency plan question");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		waitForPageLoadTill(9);
	logger.info("Verifying question in permanency plan question");
		
		verifyElementNotPresent(permanencyPlanQuestion);
		logger.info("Verified question in permanency plan question");
		jse.executeScript("window.scrollBy(0,940)");
		waitForPageLoadTill(9);
		logger.info("Clicking on next Button");
		clickWebElement(nextButton);
		jse.executeScript("window.scrollBy(0,940)");
		waitForPageLoadTill(9);
		clickWebElement(nextButton);
		logger.info("Clicked on next bUTTON");
		jse.executeScript("window.scrollBy(0,940)");
		waitForPageLoadTill(9);
		clickWebElement(nextButton);
		jse.executeScript("window.scrollBy(0,940)");
		waitForPageLoadTill(9);
		clickWebElement(nextButton);
		logger.info("User is on the service to the provider");

	}
	
	/**
	 * Click Next for yes checkbox
	 * @author akash.a.gaurav
	 * @throws AcisException 
	 */
	
	public void nextForYesStatus() throws AcisException {
		waitForPageLoadTill(19);
		logger.info("Verifying question in permanency plan question");
		clickWebElemntUsingJavascriptExecutor(yesCheckBox);
		verifyElementNotPresent(permanencyPlanQuestion);
		logger.info("Verified question in permanency plan question");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		waitForPageLoadTill(9);
		jse.executeScript("window.scrollBy(0,940)");
		waitForPageLoadTill(9);
		clickWebElement(nextButton);
		waitForPageLoadTill(9);
		jse.executeScript("window.scrollBy(0,-940)");
	logger.info("Verifying question in permanency plan question");
		
		verifyElementNotPresent(permanencyPlanQuestion);
		logger.info("Verified question in permanency plan question");
		clickWebElemntUsingJavascriptExecutor(yesCheckBox);
		waitForPageLoadTill(9);
		jse.executeScript("window.scrollBy(0,940)");
		waitForPageLoadTill(9);
		logger.info("Clicking on next Button");
		clickWebElement(nextButton);
		waitForPageLoadTill(9);
		verifyElementNotPresent(permanencyPlanQuestion);
		clickWebElemntUsingJavascriptExecutor(yesCheckBox);
		waitForPageLoadTill(9);
		jse.executeScript("window.scrollBy(0,940)");
		waitForPageLoadTill(9);
		clickWebElement(nextButton);
		waitForPageLoadTill(9);
		clickWebElemntUsingJavascriptExecutor(yesCheckBox);
		waitForPageLoadTill(9);
		
		waitForPageLoadTill(9);
		clickWebElement(nextButton);
		waitForPageLoadTill(9);
		logger.info("Clicked on next bUTTON");
	}
	
	/***
	 * Clicking on case plan review after completing submitting the new case plan
	 *@author akash.a.gaurav
	 * @throws AcisException 
	 *
	 */
	
	public void newCaseLinK() throws AcisException {
		waitForPageLoadTill(9);
		logger.info("Clicking on case plan link after creating new case plan");
		waitForElement(caseIdLink);
		logger.debug("Clicking on new case plan link");
		clickWebElemntUsingJavascriptExecutor(caseIdLink);
		waitForPageLoadTill(9);
		logger.debug("Clicked on case plan link");
	}
	
	/****
	 * Clicking on case plan link after closing
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException 
	 */
	
	public void casePlanTab() throws AcisException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		waitForPageLoadTill(9);
		jse.executeScript("window.scrollBy(0,450)");
		
		waitForPageLoadTill(9);
		Actions actions = new Actions(driver);
		waitForPageLoadTill(9);
		logger.info("Clicking  on  case plan tab");
		actions.moveToElement(casePlan3).doubleClick().build().perform();
		
		logger.info("Clicked  on  case plan tab");
		
	}
	

	/***
	 * 
	 * This methods are used in TC 172 Clicking on case plan link
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 * @throws InterruptedException
	 */

	public void casePlan() throws AcisException, InterruptedException {
		Thread.sleep(2000);
		waitForPageLoadTill(9);
		Actions actions = new Actions(driver);
		waitForPageLoadTill(9);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		waitForPageLoadTill(9);
		jse.executeScript("window.scrollBy(0,450)");
		waitForPageLoadTill(9);
		waitForElementClickable(casePlan3);
		actions.moveToElement(casePlan3).doubleClick().build().perform();
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(caseIdLink);
		logger.info("Clicked on case Id link");
		waitForPageLoadTill(9);
	}
	
	/***
	 * Save after filling all the details
	 * @author akash.a.gaurav
	 * @throws AcisException 
	 * 
	 */
	
	public void newCasePlanAfterFillingAllDropdowns() throws AcisException {
		
		
		logger.info("Filling all the details and clicking on new case plan");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		waitForPageLoadTill(9);
		jse.executeScript("window.scrollBy(0,-940)");
		waitForPageLoadTill(9);
		clickWebElemntUsingJavascriptExecutor(newCasePlan);
		logger.info("Clicked on new case plan link");
		waitForPageLoadTill(22);
	}
}
