package StepDefinations;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.TestContextSetup;
import pageObjects.PageObjectManager;
import pageObjects.ProtoCommercePO;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.*;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ProtoCommerce {
	public WebDriver driver;
	TestContextSetup testcontextsetup;
	PageObjectManager pg;
	public ProtoCommerce(TestContextSetup testcontextsetup) {
		this.testcontextsetup = testcontextsetup;
	}
	@When("^User fills in details such as (.+) and (.+) and (.+)$")
	public void user_fills_in_details_such_as_mallu_malli_gmail_com_mallumalli(String user, String email, String pass) {
		ProtoCommercePO proto = testcontextsetup.POM.GetProto();
		proto.Usernamepass(user, email, pass);
		SelectDropdown();
		testcontextsetup.POM.pc.studentSelection();
		System.out.println("user is entering the details");
		System.out.println(pass + " " + email + " " + pass);
	}
	@When("User submits the application")
	public void user_submits_the_application() {
		System.out.println("User submits the application");
		testcontextsetup.POM.GetProto().Submitbtn();
	}
	public void SelectDropdown() {
		WebElement ele = testcontextsetup.POM.GetProto().getformctrl();
		Select sel = new Select(ele);
		sel.selectByIndex(0);
	}
	@Then("A success message pops up")
	public void a_success_message_pops_up() {
		System.out.println("success pop up comes up");
		String text = testcontextsetup.POM.GetProto().Successmessage();
		Assert.assertEquals(text, "Success!");
		System.out.print("true");
		System.out.println("false");
	}

}