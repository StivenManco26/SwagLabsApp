package co.com.devco.certification.android.swaglabs.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

/**
 * Clase PageObject que contiene los target de la
 * pagina de informacion de pago
 *
 * @author manco.5@hotmail.com
 */
public class CheckoutInformationPage extends PageObject {
    public static final Target FIRST_NAME_TEXTBOX = Target.the("first name textbox").located(By.xpath("//android.widget.EditText[@content-desc='test-First Name']"));
    public static final Target LAST_NAME_TEXTBOX = Target.the("last name textbox").located(By.xpath("//android.widget.EditText[@content-desc='test-Last Name']"));
    public static final Target POSTAL_CODE_TEXTBOX = Target.the("postal code textbox").located(By.xpath("//android.widget.EditText[@content-desc='test-Zip/Postal Code']"));
    public static final Target CONTINUE_BUTTON = Target.the("continue button").located(By.xpath("//android.view.ViewGroup[@content-desc='test-CONTINUE']"));
}
