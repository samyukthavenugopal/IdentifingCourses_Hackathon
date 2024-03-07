package pageobject;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelUtils;

public class Module2 extends BasePage {

	public Module2(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

//-------------------------Module 2----------------------------------
//Module 2 : Look for Language Learning; Extract all the languages and different levels with its total count & display them
String[] data = ExcelUtils.read();
@FindBy(xpath="//*[@class='rc-CourseraLogo']")
WebElement switchMain;

public void switchMain() {
	switchMain.click();
}


@FindBy(xpath="//input[@placeholder='What do you want to learn?']")
WebElement clicksearch;

public void clickSearch() {
	System.out.println("\nModule 2 : Look for Language Learning; Extract all the languages and different levels with its total count & display them");
	clicksearch.click();
}


@FindBy(xpath="//*[@placeholder='What do you want to learn?']")
WebElement searchlng;


public void searchlng(){

	searchlng.click();
	searchlng.sendKeys(data[1]);
	searchlng.sendKeys(Keys.ENTER);

}


@FindBy(xpath="//*[@aria-label='Show more Language options']")
WebElement seeMore;

public void clickSeeMore() {
	seeMore.click();
}


//@FindBy(xpath="//div[@class='css-1vfysn6']")
@FindBy(xpath="//div[@class='css-zweepb']")
List<WebElement> lang;

public void listOfLangs() throws InterruptedException, IOException {
	
	int cntLan=0;
	System.out.println("\nList of Languages");
	int row=0;
		for(WebElement lan:lang) {
//		Thread.sleep(500);
		ExcelUtils.write("Sheet1",row,2,lan.getText());
		System.out.println(lan.getText());
		cntLan++;
		row++;
		}
	System.out.println("Total Count of Languages : "+cntLan);

}


@FindBy(xpath="//div[@class='css-jyd7rb']/button")
WebElement close;

public void close() {
	close.click();
}


@FindBy(xpath="//label[text()='Level']/following-sibling::div/div/label/div/span/span")
List<WebElement> level;

public void listOfLvls() throws IOException {
	int cntLvl=0;
	System.out.println("\nList of Levels");
	int row=0;
	for(WebElement l:level) {
		System.out.println(l.getText());
		ExcelUtils.write("Sheet1",row,3,l.getText());
		cntLvl++;
		row++;
	}
	System.out.println("Total Count of Levels : "+cntLvl);
}
}




