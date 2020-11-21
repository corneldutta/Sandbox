package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",
                glue = {"stepDefs"},
                plugin = {"pretty","html:target/cucumber-reports/cucumber-pretty.html",
                        "json:target/cucumber-reports/cucumber-report.json",
                        "rerun:target/cucumber-reports/rerun.txt"})
public class TestRunner {

}

/*import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


@CucumberOptions(features = "src/test/java/features",
            glue = {"stepDefs"},
            plugin = {"pretty",
                    "html:target/cucumber-reports/cucumber-pretty",
                    "json:target/cucumber-reports/CucumberTestReport.json",
                    "rerun:target/cucumber-reports/rerun.txt"},
            monochrome = true)

    public class TestRunner {
    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setUpClass() {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(groups = "cucumber",description = "Runs Cucumber Feature",dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature){
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }

    @DataProvider
    public Object[][] features(){
        return testNGCucumberRunner.provideFeatures();
    }

    @AfterClass
    public void tearDownClass(){
        testNGCucumberRunner.finish();
    }

}*/

