package co.com.devco.certification.android.swaglabs.utils;

import co.com.devco.certification.android.swaglabs.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Clase utilitaria para definir la espera del cargue de la aplicacion
 *
 * @author manco.5@hotmail.com
 */
public class WaitApp implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        boolean initialized = false;
        while (!initialized) {
            if (LoginPage.LOGIN_BUTTON.resolveFor(actor).isVisible()) {
                initialized = true;
            }
        }
    }

    public static WaitApp initialized() {
        return instrumented(WaitApp.class);
    }
}
