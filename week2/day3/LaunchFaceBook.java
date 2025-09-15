package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    
    WebElement mail = driver.findElement(By.id("email"));
    mail.sendKeys("testleaf.2023@gmail.com");
    
    WebElement element = driver.findElement(By.name("pass"));
    element.sendKeys("Tuna@321");
    
    driver.findElement(By.name("login")).click();
    
    driver.findElement(By.linkText("Find your account and log in.")).click();   
    String title = driver.getTitle();
    System.out.println(title);
    
    String expected= "Forgotten Password | Can't Log In | Facebook";
    if (title.equals(expected)) {
    	System.out.println("Verified the title of the current web page.");
    }
    driver.close();
   
	}

}
