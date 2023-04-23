package utils;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;
public class TestContextSetup {
	public WebDriver driver;
	public String text;
	public PageObjectManager POM;
	public TestBase driverpass;
	
	public TestContextSetup() throws IOException
	{
		driverpass = new TestBase();
		POM = new PageObjectManager(driverpass.WebDriverManager());
	}
}
