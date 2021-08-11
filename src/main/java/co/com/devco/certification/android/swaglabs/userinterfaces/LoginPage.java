package co.com.devco.certification.android.swaglabs.userinterfaces;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

/**
 * Clase PageObject que contiene los target de la pagina login en Swag Labs
 *
 * @author manco.5@hotmail.com
 */

public class LoginPage extends PageObject {
    public static final Target USERNAME_TEXTBOX = Target.the("username textbox").located(By.xpath("//android.widget.EditText[@text='Username']"));
    public static final Target PASSWORD_TEXTBOX = Target.the("password textbox").located(By.xpath("//android.widget.EditText[@content-desc='test-Password']"));
    public static final Target LOGIN_BUTTON = Target.the("login button").located(By.xpath("//android.view.ViewGroup[@content-desc='test-LOGIN']"));
    public static final Target WRONG_LOGIN_LABEL = Target.the("wrong login label").located(By.xpath("//android.view.ViewGroup[@content-desc='test-Error message']/android.widget.TextView"));

}
