package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class policy {
	
	public WebDriver driver;
	

	private By name = By.xpath("//input[@id='termName']");
	
	private By birth = By.xpath("(//input[@id='dob'])[1]");
	
	private By number = By.xpath("(//input[@id='termMobile'])[1]");
	
	private By login = By.xpath("(//a[normalize-space()='View plans'])[1]");
	
	private By click = By.xpath("//button[@value='Go']");
	
	private By smok = By.xpath("(//h3[normalize-space()='Do you Smoke or Chew tobacco?'])[1]");
	
	
	public policy (WebDriver driver01) {
		
		this.driver=driver01;
	}
	
	public WebElement vip()  {
		
		return driver.findElement(name);
		
		
		
	}
	
	public WebElement bir() {
		
		return driver.findElement(birth);
	}
	
	public WebElement num() {
		
		return driver.findElement(number);
		
	}
	
	public WebElement log() {
		
		return driver .findElement(login);
	}
	
	public WebElement click() {
		
		return driver.findElement(click);
		
	}
	
	public WebElement smo() {
		
		return driver .findElement(smok);
	}
	
	
}
