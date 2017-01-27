package companyname.projectname.pagelibrary;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAnAccount {
	
	 WebDriver driver;
	 
	 static Logger log = Logger.getLogger(CreateAnAccount.class.getName());
	 
	 By clickonlogin = By.xpath("//a[@class='login']");
	 By create_email = By.id("email_create");
	 By submit_create = By.name("SubmitCreate");
	 By createanaccounttitle = By.xpath("//h3[@class='page-subheading'][contains(text(),'Create')]");
	 By title = By.xpath("//input[@id='id_gender1']");
	 By firstname = By.id("customer_firstname");
	 By lastname = By.id("customer_lastname");
	 By password = By.name("passwd");
//	 By days = By.id("days");
//	 By months = By.id("months");
//	 By years = By.name("years");
	 By newsletter = By.name("newsletter");
//   By specialoffer = By.xpath(".//*[@id='optin']");
	 By yourfirstname = By.id("firstname");
	 By yourlastname = By.name("lastname");
	 By youraddress = By.xpath("//input[@id='address1']");
	 By yourcity = By.id("city");
	 By yourstate = By.xpath(".//*[@id='id_state']");
	 By yourzipcode = By.xpath(".//*[@id='postcode']");
	 By yourcountry = By.id("id_country");
	 By yourmobile = By.xpath(".//*[@id='phone_mobile']");
	 By yourfutureaddress = By.name("alias");
	 By registerbutton = By.xpath("//button[@id='submitAccount']");
	 
	 
	 public CreateAnAccount(WebDriver driver){
		 this.driver = driver;
	 }	
	
	 /*
	  * click on signin button on homepage
	  */
	 public WebElement SignINButton(){
		 return driver.findElement(clickonlogin);
	 }
	 
	 /*
	  * Entering email id for registration
	  */
	 
	 public WebElement EmailAddress(){
		  log.info("Enter new emailid to register");
		 return driver.findElement(create_email);
	 }
	 /*
	  * click on submit button to register an account
	  */
	 public WebElement CreateAnAccountButton(){
		 log.info("click on sumit button to continue");
		 return driver.findElement(submit_create);
	 }
	 public WebElement verifyTitle(){
		 return driver.findElement(createanaccounttitle);
	 }
	 
	 public WebElement DesigTitle(){
		 log.info("Enter you title");
		 return driver.findElement(title);
	 }
	 
	 public WebElement c_firstname(){
		 log.info("Enter your firstName");
		 return driver.findElement(firstname);
	 }

     public WebElement c_lastanme(){
    	 log.info("Enter your lastname");
    	 return driver.findElement(lastname);
	 }
     public WebElement c_password(){
    	 log.info("Enter your password");
    	 return driver.findElement(password);
	 }
     
     public WebElement Checkournewsletter(){
    	 log.info("Please subscribe to our newletter");
    	 return driver.findElement(newsletter);
	 }
     
     public WebElement FirstName(){
    	 log.info("Enter your firstname");
    	 return driver.findElement(yourfirstname);
     }
     public WebElement LastName(){
    	 log.info("Enter your lastname");
    	 return driver.findElement(yourlastname);
     }
     public WebElement YourAddress(){
    	 log.info("Enter your address");
    	 return driver.findElement(youraddress);
     }
     public WebElement YourCity(){
    	 log.info("Enter your state");
    	 return driver.findElement(yourcity);
     }
     public WebElement YourState(){
    	 log.info("Enter your state");
    	 return driver.findElement(yourstate);
     }
     public WebElement ZipCode(){
    	 log.info("Enter your zip/postal code");
    	 return driver.findElement(yourzipcode);
     }
     public WebElement Country(){
    	 log.info("Enter you countryname");
    	 return driver.findElement(yourcountry);
     }
     public WebElement MobilePhone(){
    	 log.info("Enter your Phonenumber");
    	 return driver.findElement(yourmobile);
     }
     public WebElement AddressFutureReference(){
     log.info("Enter your future reference");
    	 return driver.findElement(yourfutureaddress);
     }
     public WebElement RegisterButton(){
         log.info("clikc on register button");
    	 return driver.findElement(registerbutton);
     }

}
