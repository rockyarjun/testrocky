package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public LandingPageStepDefinationFilePO ld;
	public ProtoCommercePO pc;
	public WebDriver driver;
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
	public LandingPageStepDefinationFilePO getLandingPage()
	{
	 ld = new LandingPageStepDefinationFilePO();
	 return ld;
			
	}

	
	public ProtoCommercePO GetProto()
	{
		pc = new ProtoCommercePO(driver);
		return pc;
	}
	
}
