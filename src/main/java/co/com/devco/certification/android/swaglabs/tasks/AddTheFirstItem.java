package co.com.devco.certification.android.swaglabs.tasks;

import co.com.devco.certification.android.swaglabs.userinterfaces.ProductsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Clase Task (tarea) para adicionar el primer item de la
 * lista de productos al carrito de compras
 *
 * @author manco.5@hotmail.com
 */
public class AddTheFirstItem implements Task {
    @Override
    @Step("{0} Enter the first item of the product list in the cart")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProductsPage.FIRST_ITEM_BUTTON)
        );
    }

    public static AddTheFirstItem toTheCart() {
        return instrumented(AddTheFirstItem.class);
    }
}
