package testRunner;

import cucumber.api.CucumberOptions;


@CucumberOptions(
		features= {"src/test/features/login.feature/"},
		dryRun=true
		)
public class Runner  {
                
}
