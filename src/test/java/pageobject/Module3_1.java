package pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utilities.ExcelUtils;

public class Module3_1 extends BasePage{

	public Module3_1(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//-------------------------Module 3----------------------------------
	//In Home page, go to "For Enterprise"; Look into Courses for Campus under Product; Fill the  "Ready to transform" form with any one input invalid (example: email); Capture the error message & display
	
	String[] data = ExcelUtils.read();
	JavascriptExecutor js=(JavascriptExecutor) driver;
	 
	@FindBy(xpath="//div[text()='International Information Technology University (IITU) ']")
	WebElement ScrollForm;
	 
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement FirstName;
	 
	@FindBy(xpath="//h2[text()='Get in touch with our sales team']")
	WebElement ScrollFormdown;
	 
	@FindBy(id="LastName")
	WebElement LastName;
	 
	@FindBy(id="Email")
	WebElement Email;
	 
	@FindBy(id="Phone")
	WebElement Phone;
	 
	@FindBy(id="Institution_Type__c")
	WebElement Institution;
	 
	@FindBy(id="Company")
	WebElement Company;
	 
	@FindBy(xpath="//h2[@class='cds-119 css-1cqrdzk cds-121']")
	WebElement StudentScroll;
	 
	@FindBy(id="Title")
	WebElement Title;
	 
	@FindBy(id="Department")
	WebElement Department;
	 
	@FindBy(id="What_the_lead_asked_for_on_the_website__c")
	WebElement Website;
	 
	@FindBy(id="Country")
	WebElement Country;
	 
	@FindBy(id="State")
	WebElement State;
	 
	@FindBy(xpath="//div[text()='Lameck O.']")
	WebElement ScrollSubmit;
	 
	@FindBy(xpath="//button[text()='Submit']")
	WebElement Submit;
	
	@FindBy(xpath="//div[@id='ValidMsgEmail']")
	WebElement errorMsg;
	 
	 
	public void scrollform() {
		System.out.println("\nModule 3 : In Home page, go to \"For Enterprise\"; Look into Courses for Campus under Product; Fill the  \"Ready to transform\" form with any one input invalid (example: email); Capture the error message & display");
		js.executeScript("arguments[0].scrollIntoView", ScrollForm);
	}
	 
	public void firstname() {
		
		js.executeScript("arguments[0].scrollIntoView();",FirstName);
		FirstName.sendKeys(data[2]);
	}
	 
	public void scrolldown() {
		js.executeScript("arguments[0].scrollIntoView();", ScrollFormdown);
	}
	 
	public void lastname() {
		LastName.sendKeys(data[3]);
	}
	 
	public void email() {
		Email.sendKeys(data[4]);
	}
	 
	public void phone() {
		Phone.sendKeys(data[5]);
	}
	 
	public void institutiontype() {
		Select s=new Select(Institution);
		s.selectByIndex(1);
	}
	 
	public void company() {
		Company.sendKeys(data[6]);
	}
	 
	 
	public void student() {
		js.executeScript("arguments[0].scrollIntoView();",StudentScroll);
	}
	 
	public void title() {
		Select s1=new Select(Title);
		s1.selectByValue("Student");
	}
	 
	public void department() {
		Select s2=new Select(Department);
		s2.selectByValue("Other");
	}
	 
	public void website() {
		Select s3=new Select(Website);
		s3.selectByValue("Learner Support");
	}
	 
	public void country() {
		Select ss3=new Select(Country);
		ss3.selectByValue("India");
	}
	 
	public void state() {
		Select ss4=new Select(State);
		ss4.selectByValue("Tamil Nadu");
	}
	 
	public void scrollsubmit() {
		js.executeScript("arguments[0].scrollIntoView();", ScrollSubmit);
	}
	 
	public void  submit() {
		js.executeScript("arguments[0].click();", Submit);
	}
	 
	 
	public void scrollup() {
		js.executeScript("arguments[0].scrollIntoView();", ScrollFormdown);
	}
	
	public void errorMsg() {
		js.executeScript("arguments[0].scrollIntoView();",errorMsg);
		System.out.println("\nError Message : "+errorMsg.getText());
	}

}
