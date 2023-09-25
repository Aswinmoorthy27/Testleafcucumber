package Runner;

import org.testng.annotations.BeforeTest;

import Base.Base;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/Feature/TC01.feature",glue="StepDefinitions",monochrome = true, publish = true,dryRun = true)

public class CucumberRunner extends Base{

	@BeforeTest
	public void setValues() {
		excelFileName ="Createlead";
		sheetName="Sheet1";


	}
}


