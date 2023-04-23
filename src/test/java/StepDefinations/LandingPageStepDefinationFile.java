	package StepDefinations;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	
	import io.cucumber.java.en.Given;
	import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.ProtoCommercePO;
import utils.TestContextSetup;
	
	public class LandingPageStepDefinationFile {
		public WebDriver driver;
		TestContextSetup testcontextsetup;
		
		public LandingPageStepDefinationFile(TestContextSetup testcontextsetup)
		{
			this.testcontextsetup = testcontextsetup;
		}
		@Given("User is on Protocommerce page")
		public void user_is_on_protocommerce_page() 
		{
		  System.out.println("test");
		 
		}
	}
