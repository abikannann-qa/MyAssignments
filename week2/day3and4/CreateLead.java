package week2.day3and4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");		
		 ChromeDriver driver = new ChromeDriver(options);
		 
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/."); 
			
			WebElement name = driver.findElement(By.id("username"));
			name.sendKeys("demosalesmanager");
			
			WebElement pass = driver.findElement(By.id("password"));
			pass.sendKeys("crmsfa");
			
			driver.findElement(By.className("decorativeSubmit")).click(); 
			 driver.findElement(By.partialLinkText("CRM/SFA")).click();
			 Thread.sleep(2000);
			 
			 String titleOfTheLeaftaps = driver.getTitle();
				System.out.println(titleOfTheLeaftaps);
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				
				WebElement cname = driver.findElement(By.id("createLeadForm_companyName"));
				cname.sendKeys("test leaf");
				WebElement fname = driver.findElement(By.id("createLeadForm_firstName"));
				fname.sendKeys("Test");
				WebElement lname = driver.findElement(By.id("createLeadForm_lastName"));
				lname.sendKeys("tester");
				
	
		WebElement dropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select option = new Select(dropdown);
		
		option.selectByIndex(4);
				 
		 WebElement dropdown1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
			Select option1 = new Select(dropdown1);
			
			option1.selectByVisibleText("Automobile");
			Thread.sleep(2000);
			
			WebElement dropdown2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
			Select option2 = new Select(dropdown2);
			
			option2.selectByValue("OWN_CCORP");
			Thread.sleep(2000);
			
			driver.findElement(By.className("smallSubmit")).click();
			String title = driver.getTitle();
			System.out.println(title);
			
			String check ="View Lead | opentaps CRM";
			if (title.equals(check)) {
				System.out.println("title matched");
				driver.close();
			}
			
			
			
			
			
		 
		
		
			 
			
			
	}

}
