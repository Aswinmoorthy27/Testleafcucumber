package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;

import Base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends Base {

	
	@Given("Enter the username as {string}")
	public LoginPage EnterUsername(String Username) {
		getDriver().findElement(By.id("username")).sendKeys(Username);
		return this;
	}

	@And("Enter the password as {string}")
	public LoginPage EnterPwd(String Pwd) {
		getDriver().findElement(By.id("password")).sendKeys(Pwd);
		return this;
	}

	@When("Click on the Login button")
	public WelcomePage ClickButton() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
	}
}
