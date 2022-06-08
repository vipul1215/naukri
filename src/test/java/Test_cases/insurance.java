package Test_cases;

import java.time.Duration;

import org.testng.annotations.Test;

import Pageobject.single;
import Resources.baseclass;

public class insurance extends baseclass{
	
	@Test
	
	public void check() {
		
		single check = new single(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		check.renews().click();
		check.twowheels().click();
		check.bikenos().sendKeys("MH-14-FW-1215");
	    check.viewprices().click();
	    check.remember().click();
	    System.out.println(check.text().getText());
		
		
	}

}
