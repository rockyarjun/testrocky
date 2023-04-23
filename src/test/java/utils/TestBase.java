package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.*;
import java.io.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public WebDriver driver;
	public WebDriver WebDriverManager() throws IOException
	{
		/*FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\Newlook\\src\\test\\resources\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("QAurl");*/
		
		
		 
				
		WebDriverManager.edgedriver().setup();
		   driver = new EdgeDriver();
		  // driver.get(url);
		   driver.get("https://rahulshettyacademy.com/angularpractice/");
		   return driver;
	}
}



















