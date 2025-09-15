package week2.day3and4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");		
		 ChromeDriver driver = new ChromeDriver(options);
		 driver.manage().window().maximize();
		 driver.get("http://leaftaps.com/opentaps/.");
		//Enter a username and password then click on submit.
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 Thread.sleep(1000);
		 
		 //Click on the "CRM/SFA" link
		 driver.findElement(By.partialLinkText("CRM/SFA")).click();
		 
		 //Click on the "Accounts" tab
		 driver.findElement(By.linkText("Accounts")).click();
		 
		 //Click on the "Create Account" button
		 driver.findElement(By.linkText("Create Account")).click();
		 
		 //Enter an account name
		 driver.findElement(By.id("accountName")).sendKeys("Testing random");
		 
		 // Select "ComputerSoftware" as the industry from drop down					 		 
		 WebElement industry = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		 Select option=new Select(industry);
		 option.selectByVisibleText("Computer Software");
		 
		 //Select "S-Corporation" as ownership using SelectByVisibleTex from drop down
		 WebElement owner = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		 Select option1 = new Select(owner);
		 option1.selectByVisibleText("S-Corporation");
		 
		// Select "Employee" as the source using SelectByValue
		 WebElement source = driver.findElement(By.id("dataSourceId"));
		 Select option2 = new Select(source);
		 option2.selectByValue("LEAD_EMPLOYEE");
		 
		 //Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex
		 WebElement campaign = driver.findElement(By.id("marketingCampaignId"));
		 Select option3= new Select(campaign);
		 option3.selectByIndex(5);
		 
		// Enter a description as "Selenium Automation Tester."
		 WebElement des = driver.findElement(By.xpath("//textarea[@name='description']"));
		 des.sendKeys("Selenium Automation Tester");
		 Thread.sleep(1000);
		 
		 //Select "Texas" as the state/province using SelectByValue
		 WebElement state = driver.findElement(By.xpath("//select[@name ='generalStateProvinceGeoId']"));
		 Select option4=new Select(state);
		 option4.selectByValue("TX");
			 
		 //Click the "Create Account" button
		 driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		 
		// String title = driver.getTitle();
		// System.out.println(title);
		 
		 //Verify that the account name is displayed correctly
		 String accountname = driver.findElement(By.xpath("(//span[@class = 'tabletext'])[3]")).getText();
		 System.out.println(accountname);
		 
		 if (accountname.contains("Testing random")) {
			 System.out.println("Account name matched");
		
			 
		 }
		 
		driver.close(); 
		

	}

}
