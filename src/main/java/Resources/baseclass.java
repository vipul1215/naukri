package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class baseclass {
	
	
	
	
	public WebDriver driver;
	public Properties prop;
	 public WebDriver intializeDriver() throws IOException {
	
		//To read the properties file
		  FileInputStream fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\NAUKRI\\src\\main\\java\\Resources\\Data.Properties");
		  
		   prop=new Properties();
		  prop.load(fis);
		  String browserName=prop.getProperty("browser");  
		  

		  if(browserName.equals("chrome")) {
			  
				System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\selium Jars\\chromedriver_win32\\chromedriver.exe");

			    driver = new ChromeDriver();
			    
		  }
		  
			    
			    else if(browserName.equals("firefox")) {
			        //Firefox code
			       
			      }
			      
			      else if(browserName.equals("IE")) {
			        //IE code
			      }
			      
			      else {
			       
			       System.out.println("you should choose any one of above browser");
			      }
			      
			      return  driver;
			      
			     }
			     

			  @BeforeMethod
			     public void launchBrowser() throws IOException {
			     driver=intializeDriver();
			   driver.get(prop.getProperty("url4"));

			
			    
		  }
		   
	
}

	

