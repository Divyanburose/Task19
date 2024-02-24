package task19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Launch browser
	WebDriver driver = new ChromeDriver();
	//load URL
	driver.navigate().to("https://www.guvi.in/register");
	//maximize window
	driver.manage().window().maximize();
	//implicit waits
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	//Inspect full name
	driver.findElement(By.id("name")).sendKeys("Divya");  //By id
	//driver.findElement(By.xpath("//input[@class=\"form-control\"][1]")).sendKeys("Divya"); //by xpath with index value
	
	//Inspect email
	driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("divyaganeshwathi@gmail.com"); //by xpath 
	//driver.findElement(By.cssSelector(" border-box")).sendKeys("divyanburose@gmail.com"); //by css selector
	
	//Inspect password
	//driver.findElement(By.className("form-control password-err")).sendKeys("dhan@sekar1"); //by classname
	//driver.findElement(By.tagName("input")).sendKeys("dhan@sekar"); //by tagname
	driver.findElement(By.id("password")).sendKeys("dhan@sekar1");//by id
	
	//Inspect mobile number
	driver.findElement(By.xpath("//input[@id=\"mobileNumber\"]")).sendKeys("7200965967");
	//driver.findElement(By.id("mobileNumber")).sendKeys("7200965967");
	
	//Inspect sign up
	driver.findElement(By.xpath("//a[@id=\"signup-btn\"]")).click();//by xpath
	//driver.findElement(By.className("btn signup-btn")).click();//by classname
	
	//close window
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
