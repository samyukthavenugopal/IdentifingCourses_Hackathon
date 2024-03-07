package Cucumber.Steps;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import Factory.CucumberBaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
 
public class Hooks {
	 static WebDriver driver;
	 Properties p;
	 public static TakesScreenshot ts;
	@Before
    public void setup() throws IOException
    {
    	driver = CucumberBaseClass.initializeBrowser();
    	p = CucumberBaseClass.getProperties();
    	driver.get(p.getProperty("appURL"));
    	driver.manage().window().maximize();
	}

    @After
    public void tearDown() {
       driver.quit();
    }

 
    @AfterStep
    public void addScreenshot(Scenario scenario) {
    	//cucumber junit report
        if(scenario.isFailed()) {
        	ts = (TakesScreenshot) driver;
        	byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
        	scenario.attach(screenshot, "image/png",scenario.getName());
        }
        else {
        	ts = (TakesScreenshot) driver;
        	byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
        	scenario.attach(screenshot, "image/png",scenario.getName());
        }
    }
}
