package pageobject;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelUtils;

public class Module1 extends BasePage{

		public Module1(WebDriver driver) {
			super(driver);
			// TODO Auto-generated constructor stub
		}
		
//-------------------------Module 1----------------------------------
//Module 1 : Search for web development courses for Beginners level & English Language and extract the course names, total learning hours & rating for first 2 courses
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		String[] data = ExcelUtils.read();
		
		@FindBy(xpath="//*[@placeholder='What do you want to learn?']")
		WebElement search;


		public void clicksearch(){
			System.out.println("Module 1 : Search for web development courses for Beginners level & English Language and extract the course names, total learning hours & rating for first 2 courses");
			search.click();
			search.sendKeys(data[0]);
			search.sendKeys(Keys.ENTER);

		}
		
		@FindBy(xpath="//*[text()='English']//span")
		WebElement english;

		public void clickEng() {
			js.executeScript("arguments[0].click();",english);
//			english.click();
		}

		@FindBy(xpath="//*[text()='Beginner']//span")
		WebElement beginner;

		public void clickBeg() {
			js.executeScript("arguments[0].click();",beginner);
//			beginner.click();
		}

		@FindBy(xpath="(//h3[@class='cds-CommonCard-title css-6ecy9b'])[1]")
		WebElement course1;

		public void clickCourse1() {
			js.executeScript("arguments[0].click();", course1);
//			course1.click();
		}

		@FindBy(xpath="//h1[@class='cds-119 cds-Typography-base css-1xy8ceb cds-121']")
		WebElement title1;
		@FindBy(xpath="(//div[@class='css-lt1dx1']//div[@class='css-guxf6x'])[2]")
		WebElement rating1;
		@FindBy(xpath="(//div//div[@class='cds-119 cds-Typography-base css-h1jogs cds-121'])[8]")
		WebElement duration1;


		public void getCourse1() throws IOException {
		System.out.println("\n------1st Course------");
		String parentWindow = driver.getWindowHandle();
		Set<String> handles =  driver.getWindowHandles();
		   for(String windowHandle  : handles)
		       {
		       if(!windowHandle.equals(parentWindow))
		          {
		          driver.switchTo().window(windowHandle);
		          
		         
		          System.out.println("Course Name : "+title1.getText());
		          ExcelUtils.write("Sheet1",0,0,title1.getText());
		          System.out.println("Rating : "+rating1.getText());
		          ExcelUtils.write("Sheet1",1,0,rating1.getText());
		          System.out.println("Total Learning Hours : "+duration1.getText());
		          ExcelUtils.write("Sheet1",2,0,duration1.getText());
		          
		          
		         
		         driver.close(); //closing child window
		         driver.switchTo().window(parentWindow); //cntrl to parent window
		          }

			}
		}


		@FindBy(xpath="(//h3[@class='cds-CommonCard-title css-6ecy9b'])[2]")
		WebElement course2;

		public void clickCourse2() {
			js.executeScript("arguments[0].click();", course2);
//			course2.click();
		}

		@FindBy(xpath="//h1[@class='cds-119 cds-Typography-base css-1xy8ceb cds-121']")
		WebElement title2;
		@FindBy(xpath="(//div[@class='css-lt1dx1']//div[@class='css-guxf6x'])[2]")
		WebElement rating2;
		@FindBy(xpath="(//div//div[@class='cds-119 cds-Typography-base css-h1jogs cds-121'])[8]")
		WebElement duration2;


		public void getCourse2() throws IOException {
		System.out.println("------2nd Course------");
		String parentWindow = driver.getWindowHandle();
		Set<String> handles =  driver.getWindowHandles();
		   for(String windowHandle  : handles)
		       {
		       if(!windowHandle.equals(parentWindow))
		          {
		          driver.switchTo().window(windowHandle);
		          
		         
		          System.out.println("Course Name : "+title2.getText());
		          ExcelUtils.write("Sheet1",0,1,title2.getText());
		          
		          System.out.println("Rating : "+rating2.getText());
		          ExcelUtils.write("Sheet1",1,1,rating2.getText());
		          
		          System.out.println("Total Learning Hours : "+duration2.getText());
		          ExcelUtils.write("Sheet1",2,1,duration2.getText());
		          
		          
		          
		         driver.close(); //closing child window
		         driver.switchTo().window(parentWindow); //cntrl to parent window
		          }

			}
		}

	 
	 
	 
	 
	 
	 
	}



