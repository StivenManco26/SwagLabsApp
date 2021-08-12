package co.com.devco.certification.android.swaglabs.questions;

import co.com.devco.certification.android.swaglabs.exeptions.UnableAddToTheCart;
import co.com.devco.certification.android.swaglabs.userinterfaces.ProductsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

/**
 * Clase Question para verificar la adicion del producto al carrito
 *
 * @author manco.5@hotmail.com
 */
public class TheProductHasBeen implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) throws UnableAddToTheCart {
        try {
            return Text.of(ProductsPage.FIRST_ITEM_LABEL).viewedBy(actor).asString().equalsIgnoreCase("remove");
        } catch (Exception e) {
            UnableAddToTheCart.getUnableAddToTheCartMessage();
            return false;
        }
    }

    public static TheProductHasBeen addedToTheCart() {
        return new TheProductHasBeen();
    }
}
