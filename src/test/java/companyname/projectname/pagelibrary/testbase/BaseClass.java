package companyname.projectname.pagelibrary.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	WebDriver driver;

	@BeforeMethod
	public void StartBrowser() {
		
		Reporter.log("=========Firefox brwser started=========");
		
		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	@AfterMethod
	public void teardown(){
		Reporter.log("=========Browser closed=========");
		driver.quit();
	}
	
	
	
}