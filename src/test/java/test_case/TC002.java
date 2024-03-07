package test_case;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobject.Module2;
import test_base.BaseClass;

public class TC002  extends BaseClass{
	
	@Test(priority=1)
	public void searching() {
		Module2 m2 = new Module2(driver) ;
		m2.switchMain();
		logger.info("**** Navigated to Main Page ****");
		m2.clickSearch();
		logger.info("**** Search Bar is Clicked  ****");
		m2.searchlng();
		logger.info("**** Language Learning is Searched ****");
	}
	
	@Test(priority=2)
	public void getLangLvl() throws InterruptedException, IOException {
		Module2 m2 = new Module2(driver) ;
		m2.clickSeeMore();
		logger.info("**** SeeMore is Clicked ****");
		m2.listOfLangs();
		logger.info("**** List of Languages and their Count is Printed ****");
		m2.close();
		logger.info("**** Language box is Closed ****");
		m2.listOfLvls();
		logger.info("**** List of Levels and their Count is Printed ****");
		
	}
	
}


