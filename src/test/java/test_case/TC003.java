package test_case;

import org.testng.annotations.Test;

import pageobject.Module3;
import pageobject.Module3_1;
import test_base.BaseClass;

public class TC003  extends BaseClass{
	
	@Test(priority=1)
		public void clickenterprises() {
			Module3 m3 = new Module3(driver) ;
			m3.scrollcourse();
			m3.clickenterprises();
			logger.info("**** For Enterprises is Clicked ****");
		}
	
	@Test(priority=2)
	public void clickoffer() {
		Module3 m3 = new Module3(driver) ;
		m3.scrollwatch();
		m3.clickoffer();
		logger.info("**** Click Offer is Clicked ****");
	}
	
	@Test(priority=3)
	public void clickcourse() {
		Module3 m3 = new Module3(driver) ;
		m3.scrollcourse1();
		m3.clickcourse();
		logger.info("**** Course is Clicked ****");
	}
	
	@Test(priority=4)
	public void fillForm() {
		Module3_1 m3 = new Module3_1(driver) ;
		m3.scrollform();
		m3.firstname();
		m3.scrolldown();
		m3.lastname();
		m3.email();
		m3.phone();
		m3.institutiontype();
		m3.company();
		m3.student();
		m3.title();
		m3.department();
		m3.website();
		m3.country();
		m3.state();
		m3.scrollsubmit();
		m3.submit();
		logger.info("**** Form is Submitted Successfully ****");
		m3.errorMsg();
		logger.info("**** Error Message is Printed ****");
	}
	
	
	
	
	
}


