/*package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CreateLeadScenarioOutline {

	public static RemoteWebDriver driver;
	
	@Given("Open TestLeaf Application")
	public void openLeafTap() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	//Enter the username:
	@And("Enter the username as (.*)")
	public void enteruserName(String uName) {
		driver.findElementById("username").sendKeys(uName);
	}
	//enter the password:
	@And("Enter the password as (.*)")
	public void enterpassword(String pwd) {
	driver.findElementById("password").sendKeys(pwd);
	}
		//Login
	@And("Click login button")
	public void login() {
	driver.findElementByClassName("decorativeSubmit").click();
	}
	//Crm sfa link
	@And("Click crm/sfa link")
	public void crmSFA() {
	driver.findElementByLinkText("CRM/SFA").click();
	}
	//create lead link:
	@And("Click on CreateLead link")
	public void createLead() {
		driver.findElementByXPath("//a[contains(text(),'Create Lead')]").click();
	}
	
	//company name:
	@And("Enter the Company Name as (.*)")
	public void enterCompany(String cName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	}
	//first name:
	@And("Enter the First Name as (.*)")
	public void enterFName(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	}
	@And("Enter the Last Name as (.*)")
	public void enterLName(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	}
	
	@And("click on Create Lead button")
	public void createLeadButton() {
		driver.findElementByClassName("smallSubmit").click();
	}
	
	@Then("Verify lead is created successfully")
	public void leadSuccess() {
		System.out.println("Lead is successfully created");
		
	}
	
	
	
}



*/