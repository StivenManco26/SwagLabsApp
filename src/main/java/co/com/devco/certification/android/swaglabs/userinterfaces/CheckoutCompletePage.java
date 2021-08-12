package co.com.devco.certification.android.swaglabs.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

/**
 * Clase PageObject que contiene los target de la
 * pagina de finalizacion de la orden
 *
 * @author manco.5@hotmail.com
 */
public class CheckoutCompletePage extends PageObject {
    public static final Target THANK_YOU_LABEL = Target.the("thank you label").located(By.xpath("//android.widget.ScrollView[@content-desc='test-CHECKOUT: COMPLETE!']/android.view.ViewGroup/android.widget.TextView[1]"));

}
