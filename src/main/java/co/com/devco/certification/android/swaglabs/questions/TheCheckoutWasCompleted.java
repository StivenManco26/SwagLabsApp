package co.com.devco.certification.android.swaglabs.questions;

import co.com.devco.certification.android.swaglabs.userinterfaces.CheckoutCompletePage;
import co.com.devco.certification.android.swaglabs.userinterfaces.CheckoutOverviewPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

/**
 * Clase Question para verificar la finalizacion de la compra
 *
 * @author manco.5@hotmail.com
 */
public class TheCheckoutWasCompleted implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor){
        actor.attemptsTo(Click.on(CheckoutOverviewPage.FINISH_BUTTON));
        return Text.of(CheckoutCompletePage.THANK_YOU_LABEL).viewedBy(actor).asString().equalsIgnoreCase("THANK YOU FOR YOU ORDER");
    }
    public static TheCheckoutWasCompleted correctly() {
        return new TheCheckoutWasCompleted();
    }
}
