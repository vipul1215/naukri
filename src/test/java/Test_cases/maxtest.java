package Test_cases;

import java.time.Duration;

import org.testng.annotations.Test;

import Pageobject.maxlife;
import Resources.baseclass;

public class maxtest   extends baseclass{
	@Test
	
	public void action() {
		
		maxlife tick = new maxlife(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		tick.name().sendKeys("vipul mikhayal");
		tick.dob().sendKeys("06/09/1998");
		tick.gender().click();
		tick.smoke().click();
		tick.income().click();
		tick.number().sendKeys("9881012700");
		tick.check().click();
		
	}

}
