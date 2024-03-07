package Cucumber.Steps;

import java.io.IOException;

import Factory.CucumberBaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.Module1;
import pageobject.Module2;
import pageobject.Module3;
import pageobject.Module3_1;

public class StepDefinitions {
	
	Module1 m1;
	Module2 m2;
	Module3 m3;
	Module3_1 m4;
	
	@Given("User is on the Coursera Website")
	public void user_is_on_the_coursera_website() {
		
		m1 = new Module1(CucumberBaseClass.getDriver());    
	}

	@When("User Searches for Web Development Courses")
	public void user_searches_for_web_development_courses() {
		
		m1.clicksearch();
		CucumberBaseClass.getLogger().info("**** Search button is clicked and Web Development is Searched ***");
	}

	@When("English Language and Beginner Level is Selected From the Search Results Page")
	public void english_language_and_beginner_level_is_selected_from_the_search_results_page() {
		
		m1.clickEng();
		CucumberBaseClass.getLogger().info("*** English Checkbox is Selected ***");
		m1.clickBeg();
		CucumberBaseClass.getLogger().info("*** Beginner Checkbox is Selected ***");
	}

	@Then("First and Second Displayed Course is Selected and Details of the Course are Printed")
	public void first_and_second_displayed_course_is_selected_and_details_of_the_course_are_printed() throws IOException {
		
		m1.clickCourse1();
		CucumberBaseClass.getLogger().info("*** 1st Course Card is Clicked ***");
		m1.getCourse1();
		CucumberBaseClass.getLogger().info("*** Title, Rating and Duration of 1st Course is Printed ***");
		m1.clickCourse2();
		CucumberBaseClass.getLogger().info("*** 2nd Course Card is Clicked ***");
		m1.getCourse2();
		CucumberBaseClass.getLogger().info("*** Title, Rating and Duration of 2nd Course is Printed ***");
	    
	}

	@When("User searches for Language learning")
	public void user_searches_for_language_learning() {
		
		m2 = new Module2(CucumberBaseClass.getDriver());
		m2.clickSearch();
		CucumberBaseClass.getLogger().info("*** Search Bar is Clicked ***");
		m2.searchlng();
		CucumberBaseClass.getLogger().info("*** Language Learning is Searched ***");
	}

	@When("Click on See more")
	public void click_on_see_more() {
		
		m2.clickSeeMore();
		CucumberBaseClass.getLogger().info("**** SeeMore is Clicked ****");
	}

	@Then("Get lists of languages, levels and their count")
	public void get_lists_of_languages_levels_and_their_count() throws InterruptedException, IOException {
		
		m2.listOfLangs();
		CucumberBaseClass.getLogger().info("**** List of Languages and their Count is Printed ****");
		m2.close();
		CucumberBaseClass.getLogger().info("**** Language box is Closed ****");
		m2.listOfLvls();
		CucumberBaseClass.getLogger().info("**** List of Levels and their Count is Printed ****");
	}

	@When("User clicks on For Enterprise")
	public void user_clicks_on_for_enterprise() {
		
		m3 = new Module3(CucumberBaseClass.getDriver());
		m3.scrollcourse();
		m3.clickenterprises();
		CucumberBaseClass.getLogger().info("**** For Enterprises is Clicked ****");
	}

	@When("User clicks on Offer and navigates to click course")
	public void user_clicks_on_offer_and_navigates_to_click_course() {
		
		m3.scrollwatch();
		m3.clickoffer();
		CucumberBaseClass.getLogger().info("**** Click Offer is Clicked ****");
		m3.scrollcourse1();
		m3.clickcourse();
		CucumberBaseClass.getLogger().info("**** Course is Clicked ****");
	}

	@Then("User Fills and submits the form, Error message is displayed.")
	public void user_fills_and_submits_the_form_error_message_is_displayed() {
		
		m4 = new Module3_1(CucumberBaseClass.getDriver());
		m4.scrollform();
		m4.firstname();
		m4.scrolldown();
		m4.lastname();
		m4.email();
		m4.phone();
		m4.institutiontype();
		m4.company();
		m4.student();
		m4.title();
		m4.department();
		m4.website();
		m4.country();
		m4.state();
		m4.scrollsubmit();
		m4.submit();
		CucumberBaseClass.getLogger().info("**** Form is Submitted Successfully ****");
		m4.errorMsg();
		CucumberBaseClass.getLogger().info("**** Error Message is Printed ****");
	    
	}

}
