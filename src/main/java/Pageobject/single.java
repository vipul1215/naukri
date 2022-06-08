package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class single {
	
	
	public WebDriver driver;
	
	
	private By renew = By.xpath("//a[normalize-space()='Renew Your Policy']");
	private By twowheel = By.xpath("//i[@class='menu-ico icon-bg renew-two-wheeler-insurance']");
	private By bikeno = By.xpath("//input[@id='rto']");
	private By price= By.xpath("//button[@value='Go']");
	private By remembers = By.cssSelector("div[id='app'] li:nth-child(4)");
	private By print = By.xpath("//span[normalize-space()='ROYAL ENFIELD CLASSIC']");
	
	public single (WebDriver driver02) {
		
		this.driver=driver02;
	}
	
	public WebElement renews () {
		
		return driver.findElement(renew);
	}
	
	public WebElement twowheels() {
		
		return driver.findElement(twowheel);
	}
	
	public WebElement bikenos () {
		
		return driver.findElement(bikeno);
		
		
	}
	
	public WebElement viewprices() {
		
		return driver.findElement(price);
				
				
	}
	
	public WebElement remember() {
		
		return driver.findElement(remembers);
	}
	
	public WebElement text() {
		
		return driver.findElement(print);
	}

}
