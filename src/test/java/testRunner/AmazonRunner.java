package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles/Amazon.feature",
					glue="stepdef",
					//tags="@Mobiles",
					//tags="@HomePage or @Mobiles",
					//tags="not @Mobiles", exclude
					tags="not @Mobiles and not @HomePage",//two exclude
					publish=true)
public class AmazonRunner {

}
