package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/java/features/deals.feature"},//used for write feature file path
		glue= {"stepDefinations"},//used for write stepDefination file path
		//format= {"pretty","html:test_output","json:json_output//cucumber.json"},//used to get output in different format like html,json,xml
        //dryRun= true ,//gives you a way to quickly scan your features without actually running them. Invokes formatters without executing the steps.
        //strict= true  ,// if Strict option is set to true then at execution time if cucumber encounters any undefined/pending steps then cucumber does fails the execution and undefined steps are marked as fail and BUILD is FAILURE. 
        monochrome= true //used to get proper readable console output
		
		)
public class TestRunner {

}
 