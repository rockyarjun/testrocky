package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProtoCommercePO {
	public WebDriver driver;
	
	public ProtoCommercePO(WebDriver driver)
	{
		this.driver= driver;
	}
	
	By User = By.xpath("(//input[@name='name'])[1]");
	By email = By.xpath("(//input[@name='email'])[1]");
	By pass = By.xpath("(//input[@type='password'])[1]");
	By checkbox = By.xpath("(//input[@id='exampleCheck1'])[1]");
	By Employmentstatus = By.xpath("(//label[text()='Student'])");
	By Birthdate = By.xpath("//input[@name='bday']");
	By submitbtn = By.xpath("//input[@type=\'submit\']");
	By succ = By.xpath("//strong[text()='Success!']");
	By formctrl = By.xpath("(//select[@class='form-control'])");

//	public ProtoCommercePO()
							 


   public void Usernamepass(String name,String email1,String pass1)
   {
	  driver.findElement(User).sendKeys(name);
	  driver.findElement(email).sendKeys(email1);
	  driver.findElement(pass).sendKeys(pass1);
	   
	}
   
   public void studentSelection()
   {
	  driver.findElement(checkbox).click();
	  driver.findElement(Employmentstatus).click();
	  driver.findElement(Birthdate).sendKeys("24041999");
   }
   
   public void Submitbtn()
   {
	   driver.findElement(submitbtn).click();
   }
   public String Successmessage()
   {
	   return driver.findElement(succ).getText();
	   
   }
   public WebElement getformctrl()
   {
	   System.out.println("test");
	   System.out.println("testing");
	   return driver.findElement(formctrl);
   }

}