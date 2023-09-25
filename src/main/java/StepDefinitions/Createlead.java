package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;

import Base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Createlead extends Base {

	@When("Click CreateLead link")
	public Createlead Createlead() {
		getDriver().findElement(By.linkText("Create Lead")).click();
		return this;

	}

	@Given("Enter the companyname as TestLeaf")
	public Createlead Companyname(String Companyname) {
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(Companyname);
		return this;
	}

	@Given("Enter the firstname as Aswin")
	public Createlead Firstname(String Firstname) {
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(Firstname);
		return this;

	}

	@And("Enter the lastname as Moorthy")
	public Createlead Lastname(String Lastname) {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(Lastname);
		return this;

	}

	@And("Enter the Phonenumber as (.*)$")
	public Createlead Phonenumber(String Phn) {
		getDriver().findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(Phn);
		return this;

	}

	@When("Click on createLead button")
	public Createlead Submit() {
		getDriver().findElement(By.name("submitButton")).click();
		return this;

	}

	public ViewLeadsPage Verfiy() {
		String text = getDriver().findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		} else {
			System.out.println("Lead is not created");
		}
		return new ViewLeadsPage();

	}
}
