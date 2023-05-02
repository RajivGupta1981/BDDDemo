package api.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features =  "src/test/java/api/cucumber/features/post.feature",
        glue = {"steps"},
plugin = {"json:target/cucumber.json"})
public class PostRunner {
}
