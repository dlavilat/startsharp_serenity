package startsharp.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue 	 = "startsharp.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class BusinessUnitRunner {

}
