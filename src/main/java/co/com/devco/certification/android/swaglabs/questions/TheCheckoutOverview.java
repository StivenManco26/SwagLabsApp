package co.com.devco.certification.android.swaglabs.questions;

import co.com.devco.certification.android.swaglabs.interactions.DeviceScroll;
import co.com.devco.certification.android.swaglabs.userinterfaces.CheckoutOverviewPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

/**
 * Clase Question para verificar el checkout overview
 *
 * @author manco.5@hotmail.com
 */
public class TheCheckoutOverview implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(DeviceScroll.element());
        return Text.of(CheckoutOverviewPage.SHIPPING_INFORMATION_LABEL).viewedBy(actor).asString().equalsIgnoreCase("Shipping Information:");
    }

    public static TheCheckoutOverview isDisplayed() {
        return new TheCheckoutOverview();
    }
}
