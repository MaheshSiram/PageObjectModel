package companyname.projectname.pagelibrary;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn{
	
	WebDriver driver;
	
	static Logger log = Logger.getLogger(SignIn.class.getName());
	
	public SignIn(WebDriver driver){
		this.driver = driver;
		
	}

	By signinEmail = By.xpath("//input[@id='email']");
	By signinPassword = By.id("passwd");
	By signinLogin = By.name("SubmitLogin");
	
	
	public WebElement loginEmail(){
		log.info("Entering registered emailID");
		return driver.findElement(signinEmail);
	}
	public WebElement loginPassword(){
		log.info("Entering registered password");
		return driver.findElement(signinPassword);
	}
	public WebElement SigninButton(){
		log.info("Click on signin button");
		return driver.findElement(signinLogin);
	}
}