package swag_labs_steps;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features ="Features\\Swag_Labs.feature",
	glue = "swag_labs_steps",
	plugin = {"pretty" , "html:Report/SwagLab/cucumber.html",
			             "json:Report/SwagLab/cucumber.json",
	},
	monochrome = true )

public class Swag_Lab_Runner extends AbstractTestNGCucumberTests { // AbstractTestNGCucumberTests this is inbuilt Cucumber Test > Runs each cucumber scenario found in the features as separated test.

//	//to enable parallel execution add below
//	 @Override
//	    @DataProvider(parallel = true) // 🔥 Enables parallel execution
//	    public Object[][] scenarios() {
//	        return super.scenarios();
//	    }

}
