package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LOgin {
	
 public WebDriver driver;
 
 private By logo = By.xpath("(//div[normalize-space()='Login'])[1]");
 private By emailfirm = By.xpath("(//input[@placeholder='Enter your active Email ID / Username'])[1]");
 private By passfirm = By.xpath("//input[@placeholder='Enter your password']");
 private By loginfirm = By.xpath("//button[@type='submit']");
 private By errorfirm = By.xpath("(//div[@class='server-err'])[1]");
 
 
 public LOgin (WebDriver Driver1) {
	 
	 this.driver = Driver1;
	 
	
 }
 
 public WebElement Logo() {
	 
	 return driver.findElement(logo);
 }
 
 public WebElement Loginl() {
	 
	 return driver.findElement(emailfirm);
 }
 
 public  WebElement Pass() {
	 
	 return driver .findElement(passfirm);
 }
 
 public WebElement login() {
	 
	 return driver .findElement(loginfirm);
	 
	 
 }
 
 public WebElement error() {
	 
	 return driver.findElement(errorfirm);
 }
 
 

}
