package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class maxlife {
	
	public WebDriver driver;
	
	private By name = By.xpath("//input[@id='fullName']");
	private By dob = By.xpath("//input[@id='dob']");
	private By gender = By.xpath("//span[normalize-space()='Male']");
	private By smoke = By.xpath("//label[@for='tobacco-0']");
	private By income = By.xpath("//span[normalize-space()='5 - 7']");
	private By number = By.xpath("//input[@id='mobile']");
	private By check = By.xpath("//button[normalize-space()='Check Premium']");
	
	
	public maxlife (WebDriver Driver1) {
		 
		 this.driver = Driver1;
		
	 }
	
	public WebElement name() {
		
		return driver.findElement(name);
	}
	
	public WebElement dob() {
		
		return driver.findElement(dob);
	}
	
	public WebElement gender() {
		
		return driver.findElement(gender);
	}
	
	public WebElement smoke() {
		
		return driver.findElement(smoke);
	}
	public WebElement income() {
		
		return driver.findElement(income);
	}
	
	public WebElement number() {
		
		return driver.findElement(number);
	}
	
	public WebElement check() {
		
		return driver.findElement(check);
	}
	
	
}
