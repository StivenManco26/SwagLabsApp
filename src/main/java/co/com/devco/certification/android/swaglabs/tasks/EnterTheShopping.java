package co.com.devco.certification.android.swaglabs.tasks;

import co.com.devco.certification.android.swaglabs.userinterfaces.ProductsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Clase Task (tarea) para ingresar al carrito de compras
 * @author manco.5@hotmail.com
 */
public class EnterTheShopping implements Task {
    @Override
    @Step("{0} Enter into shopping cart")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProductsPage.CART_BUTTON)
        );
    }

    public static EnterTheShopping cart() {
        return instrumented(EnterTheShopping.class);
    }
}
