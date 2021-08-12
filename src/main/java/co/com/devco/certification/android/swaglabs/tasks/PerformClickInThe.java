package co.com.devco.certification.android.swaglabs.tasks;

import co.com.devco.certification.android.swaglabs.userinterfaces.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Clase Task (tarea) para confirmar los items adicionados
 * al carrito de compras
 *
 * @author manco.5@hotmail.com
 */
public class PerformClickInThe implements Task {
    @Override
    @Step("{0} checkout the items added to the shopping cart")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CartPage.CHECKOUT_BUTTON)
        );
    }
    public static PerformClickInThe checkoutButton() {
        return instrumented(PerformClickInThe.class);
    }
}
