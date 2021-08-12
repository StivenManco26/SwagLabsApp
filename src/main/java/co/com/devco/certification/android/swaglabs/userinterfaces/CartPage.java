package co.com.devco.certification.android.swaglabs.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

/**
 * Clase PageObject que contiene los target de la
 * pagina del carrito de compras
 *
 * @author manco.5@hotmail.com
 */
public class CartPage extends PageObject {
    public static final Target CHECKOUT_BUTTON = Target.the("checkout button").located(By.xpath("//android.view.ViewGroup[@content-desc='test-CHECKOUT']"));
}
