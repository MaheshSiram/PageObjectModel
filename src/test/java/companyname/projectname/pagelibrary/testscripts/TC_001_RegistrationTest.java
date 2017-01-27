package companyname.projectname.pagelibrary.testscripts;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

	import companyname.projectname.pagelibrary.CreateAnAccount;
    import companyname.projectname.pagelibrary.testbase.BaseClass;
	 
	public class TC_001_RegistrationTest{
		CreateAnAccount createAnAccount;
		
		WebDriver driver;
		
		@BeforeClass
		public void setUp(){
			
			createAnAccount = new CreateAnAccount(driver);
		}


		@Test
		public void simpletest() throws InterruptedException{
			
			CreateAnAccount create = new CreateAnAccount(driver);
			
			create.SignINButton().click();
			
			create.EmailAddress().sendKeys("maheshsiramshetty028@gmail.com");
			
			create.CreateAnAccountButton().click();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			create.verifyTitle().isDisplayed();
			
			create.DesigTitle().isSelected();
			
			create.DesigTitle().click();
			
			create.c_firstname().sendKeys("Mahesh");
			
			create.c_lastanme().sendKeys("selenium");
			
			create.c_password().sendKeys("automation");
			
			create.Checkournewsletter().isSelected();
			
			create.Checkournewsletter().click();
			
			create.FirstName().sendKeys("Mahesh");
			
			create.LastName().sendKeys("mahesh");
			
			create.YourAddress().sendKeys("39510 San Jose xyz");
			
			create.YourCity().sendKeys("San Jose");
			
			Thread.sleep(3000);
			
		    Select State = new Select(create.YourState());
		    
		    State.selectByValue("5");
		    
			create.ZipCode().sendKeys("95101");
			
			Thread.sleep(2000);
			
			Select country_dd = new Select(create.Country());
			
			country_dd.selectByValue("21");
			
			create.MobilePhone().sendKeys("12345678901234");
			
			create.AddressFutureReference().clear();
			
			Thread.sleep(1000);
			
			create.AddressFutureReference().sendKeys("USA");
			
			create.RegisterButton().click();
		
		}

	}
