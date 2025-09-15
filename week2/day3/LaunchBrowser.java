package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main"); 
	
	WebElement name = driver.findElement(By.id("username"));
	name.sendKeys("demosalesmanager");
	
	WebElement pass = driver.findElement(By.id("password"));
	pass.sendKeys("crmsfa");
	
	driver.findElement(By.className("decorativeSubmit")).click(); 
	
	driver.get("https://platform.testleaf.com/#/");
	

	
	
		
		
	
	}

}
