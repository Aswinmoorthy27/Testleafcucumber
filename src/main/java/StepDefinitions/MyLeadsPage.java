package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class MyLeadsPage extends Base {

	
	@And("Click Leads Button")
	public Createlead Clickleads() {
		getDriver().findElement(By.linkText("Leads")).click();
		return new Createlead();
	}

}
