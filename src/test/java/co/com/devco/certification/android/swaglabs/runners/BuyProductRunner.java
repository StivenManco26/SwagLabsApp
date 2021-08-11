package co.com.devco.certification.android.swaglabs.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/buy_product.feature",
        glue = "co.com.devco.certification.android.swaglabs.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class BuyProductRunner {
}
