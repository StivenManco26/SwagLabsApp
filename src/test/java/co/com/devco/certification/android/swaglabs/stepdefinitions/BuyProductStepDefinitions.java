package co.com.devco.certification.android.swaglabs.stepdefinitions;

import co.com.devco.certification.android.swaglabs.models.UserModel;
import co.com.devco.certification.android.swaglabs.questions.SwagLabsLoginResult;
import co.com.devco.certification.android.swaglabs.tasks.EnterThe;
import co.com.devco.certification.android.swaglabs.tasks.OpenThe;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class BuyProductStepDefinitions {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^That (.*) open Swag Labs app$")
    public void thatTheActorOpenSwagLabsApp(String actorName) {
        theActorCalled(actorName).wasAbleTo(OpenThe.swagLabsApp());
    }

    @When("^he submit username and password$")
    public void heSubmitUsernameAndPassword(List<UserModel> credentials) {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterThe.credentials(credentials.get(0)));
    }

    @Then("^he should be logged in$")
    public void heShouldBeLoggedIn() {
        OnStage.theActorInTheSpotlight().should(seeThat(SwagLabsLoginResult.containsTheProductsWord()));
    }

    @Given("^that (.*) wants to buy a product in the Swag Labs app$")
    public void thatTheActorWantsToBuyAProductInTheSwagLabsApp() {

    }

    @When("^he adds the first item to the cart$")
    public void heAddsTheFirstItemToTheCart() {

    }

    @When("^he goes to the cart$")
    public void heGoesToTheCart() {

    }

    @When("^he performs the checkout$")
    public void hePerformsTheCheckout() {

    }

    @When("^he enters his information$")
    public void heEntersHisInformation(DataTable arg1) {

    }

    @Then("^he should see the summary of his purchase$")
    public void heShouldSeeTheSummaryOfHisPurchase() {

    }

    @Then("^he should see the complete checkout message$")
    public void heShouldSeeTheCompleteCheckoutMessage() {

    }
}
