package Test_cases;

import org.testng.annotations.Test;

import Pageobject.LOgin;


import Resources.baseclass;

public class login_Test extends baseclass {
	
	@Test
	
      
	public void clicked() throws InterruptedException {
		
		LOgin click = new LOgin (driver);
		Thread.sleep(2000);
		
		click.Logo().click();
		Thread.sleep(2000);
		click.Loginl().sendKeys("shindevipul");
		click.Pass().sendKeys("123456");
		click.login().click();
		Thread.sleep(2000);
		System.out.println(click.error().getText());
	}
	
	
	

}

