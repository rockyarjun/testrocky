package StepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import com.github.dockerjava.api.model.Driver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {
	TestContextSetup testcontextsetup;

	public Hooks(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup = testcontextsetup;
	}
	
	@After
	public void AfterScenario() throws IOException
	{
		testcontextsetup.driverpass.WebDriverManager().close();
	}
	
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws WebDriverException, IOException
	{
		if(scenario.isFailed())
		{
			File sourcepath =((TakesScreenshot)testcontextsetup.driverpass.WebDriverManager()).getScreenshotAs(OutputType.FILE);
			byte[] filecontent = FileUtils.readFileToByteArray(sourcepath);
			scenario.attach(filecontent, "image/png", "image");
		}
		System.out.println("i am here in the scenario");
	}
}
