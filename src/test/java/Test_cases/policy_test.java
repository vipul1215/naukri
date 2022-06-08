package Test_cases;

import java.time.Duration;

import org.testng.annotations.Test;

import Pageobject.policy;
import Resources.baseclass;

public class policy_test  extends baseclass {
	
	@Test
	
	
	
	public void  action () {
		
		policy check = new policy(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		check.vip().sendKeys("MR Shinde");
		check.bir().sendKeys("06091998");
		check.num().sendKeys("9552617874");
		check.log().click();
		System.out.println(check.smo().getText());
		
		
		
	}

}
