package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"C:\\workspace\\selenium-practice\\ExdpAutomationTesting\\src\\test\\java\\Features\\Exdp.feature"},//used for write feature file path
		glue= {"StepDefinitions"},//used for write stepDefination file path
		//format= {"pretty","html:test_output","json:json_output//cucumber.json"},//used to get output in different format like html,json,xml
        //
		//dryRun= true ,//gives you a way to quickly scan your features without actually running them. Invokes formatters without executing the steps.
        //strict= true  ,// if Strict option is set to true then at execution time if cucumber encounters any undefined/pending steps then cucumber does fails the execution and undefined steps are marked as fail and BUILD is FAILURE. 
        monochrome= true //used to get proper readable console output
		
		)
public class TestRunner {

}

/*

| 0   | 12    | 33         | hggkjvvv   |
| 1000| 5447.5| 2333.78    | sdfwfgwjkf |
*/