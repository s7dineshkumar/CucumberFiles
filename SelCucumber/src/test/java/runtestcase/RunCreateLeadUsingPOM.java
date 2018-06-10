package runtestcase;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features="src/test/java/features/CreateLeadSceanarioOutline.feature", glue= {"steps",""}, 
monochrome=true /*tags= {"@createLead" "and" "@Fillthevalues"}*/)

@RunWith(Cucumber.class)

public class RunCreateLeadUsingPOM {

}
