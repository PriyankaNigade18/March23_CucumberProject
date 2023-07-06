package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles/Hrm.feature",
					glue={"stepdef","hooks"},
					publish=true)
public class HrmRunner {

}
