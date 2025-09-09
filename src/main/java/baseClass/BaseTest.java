package baseClass;
# This is BaseTest

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import baseClass.DriverFactory;
import reports.ExtentReportManager;

public class BaseTest {
	
	protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = DriverFactory.getDriver();  // create new WebDriver instance
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();  // properly quit after each scenario
        }
        ExtentReportManager.flushReports();
    }
}


