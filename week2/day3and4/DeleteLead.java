package week2.day3and4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

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
		 
		 //Click on the Leads Button 
		 driver.findElement(By.linkText("Leads")).click();
		 
		 //Click "Find leads."
		 driver.findElement(By.linkText("Find Leads")).click();
		 
		 //Click on the "Phone" tab and enter phone number
		 driver.findElement(By.linkText("Phone")).click();
		 driver.findElement(By.name("phoneNumber")).sendKeys("6789765434");
		 
		// Click the "Find leads" button
		 driver.findElement(By.linkText("Find Leads")).click();
		 Thread.sleep(2000);
		 
		 //Capture the lead ID of the first resulting lead and click
		 String leadid = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		 System.out.println(leadid);
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		 Thread.sleep(3000);
		 
		 //Click the "Delete" button
		 driver.findElement(By.linkText("Delete")).click();
		 Thread.sleep(2000);
		 
		 //Click "Find leads" again.
		 driver.findElement(By.linkText("Find Leads")).click();
		 
		 // Enter the captured lead ID.
		 driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadid);
		 Thread.sleep(2000);
		 
		 // Click the "Find leads" button.
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 Thread.sleep(2000);
		 
		 //Verify the presence of the message "No records to display" on successful deletion.
		 String pageinfo = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		 
		 if (pageinfo.equals("No records to display")) {
			 System.out.println("Lead id successfully deleted");
		 }
			 else {
				 System.out.println("lead id deletion is not successfull");
			 } 
		 
		driver.close();	 
			
			
			 }
		 
		 

	}


