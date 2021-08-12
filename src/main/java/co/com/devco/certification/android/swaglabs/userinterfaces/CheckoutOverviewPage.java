package co.com.devco.certification.android.swaglabs.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

/**
 * Clase PageObject que contiene los target de la
 * pagina del checkout overview
 *
 * @author manco.5@hotmail.com
 */
public class CheckoutOverviewPage extends PageObject {
    public static final Target SHIPPING_INFORMATION_LABEL = Target.the("shipping information label").located(By.xpath("//android.widget.ScrollView[@content-desc='test-CHECKOUT: OVERVIEW']/android.view.ViewGroup/android.widget.TextView[3]"));
    public static final Target FINISH_BUTTON = Target.the("finish button").located(By.xpath("//android.view.ViewGroup[@content-desc='test-FINISH']"));
}
