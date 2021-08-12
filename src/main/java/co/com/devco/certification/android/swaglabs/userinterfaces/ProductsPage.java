package co.com.devco.certification.android.swaglabs.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

/**
 * Clase PageObject que contiene los target de la pagina de productos en Swag Labs
 *
 * @author manco.5@hotmail.com
 */
public class ProductsPage extends PageObject {
    public static final Target PRODUCTS_LABEL = Target.the("products label").located(By.xpath("//android.view.ViewGroup[@content-desc='test-Cart drop zone']/android.view.ViewGroup/android.widget.TextView"));
    public static final Target FIRST_ITEM_BUTTON = Target.the("first item button").located(By.xpath("(//android.view.ViewGroup[@content-desc='test-ADD TO CART'])[1]"));
    public static final Target FIRST_ITEM_LABEL = Target.the("first item label").located(By.xpath("//android.view.ViewGroup[@content-desc='test-REMOVE']/android.widget.TextView"));
    public static final Target CART_BUTTON = Target.the("cart button").located(By.xpath("//android.view.ViewGroup[@content-desc='test-Cart']/android.view.ViewGroup/android.widget.ImageView"));
}
