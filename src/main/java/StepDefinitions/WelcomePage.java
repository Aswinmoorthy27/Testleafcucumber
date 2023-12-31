package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import Base.Base;
import io.cucumber.java.en.When;

public class WelcomePage extends Base {

	/*
	 * public WelcomePage verifyTitle() { String verify = getDriver().getTitle();
	 * System.out.println(verify);
	 * 
	 * if (verify.contentEquals(verify)) { System.out.println("TITLE VERIFIED"); }
	 * 
	 * return this; }
	 */

	@When("Click on crmsfaLink")
	public MyHomePage crmclick() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();

	}
}
