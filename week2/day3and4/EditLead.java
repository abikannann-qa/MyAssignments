package week2.day3and4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		 
		 //Click on the Leads Button then create lead
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 
		// Enter the CompanyName Field Using Xpath.
		 driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("test leaf");
		 
		// Enter the FirstName Field Using Xpath.
		 driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Test12");
		 
		// - Enter the LastName Field Using Xpath.
		 driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Testing345");
		 
		//- Enter the FirstName (Local) Field Using Xpath.
		 driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("ran");
		 
		// - Enter the Department Field Using any Locator of Your Choice.
		 driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("QA");
		 
		// - Enter the Description Field Using any Locator of your choice
		 driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Automation tester");
		 
		// - Enter your email in the E-mail address Field using the locator of your choice.
		 driver.findElement(By.xpath("(//input[@name='primaryEmail'])[4]")).sendKeys("random@gmail.com");
		 
		// - Select State/Province as NewYork Using Visible Text.
		 WebElement province = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		 Select option =new Select(province);
		 option.selectByVisibleText("New York");
		 
		// - Click on the Create Button.
		 driver.findElement(By.className("smallSubmit")).click();
		 Thread.sleep(2000);
		 
		// - Click on the edit button.
		 driver.findElement(By.linkText("Edit")).click();
		 
		// - Clear the Description Field.
		 driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		 Thread.sleep(1000);
		 
		// - Fill the Important Note Field with Any text.
		 driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("updation");
		 
		// - Click on the update button.
		 driver.findElement(By.xpath("//input[@value='Update']")).click();
		 Thread.sleep(2000);
		 
		// - Get the Title of the Resulting Page
		 String title = driver.getTitle();
		 System.out.println(title);
		 
driver.close();
	}

}
