package co.com.devco.certification.android.swaglabs.questions;

import co.com.devco.certification.android.swaglabs.exeptions.UnableToLogin;
import co.com.devco.certification.android.swaglabs.userinterfaces.ProductsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

/**
 * Clase Question para verificar el login correcto en la app
 * @author manco.5@hotmail.com
 */

public class SwagLabsLoginResult implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) throws UnableToLogin {
        try {
            return Text.of(ProductsPage.PRODUCTS_LABEL).viewedBy(actor).asString().equalsIgnoreCase("products");
        } catch(Exception e) {
            UnableToLogin.getUnableToLoginMessage();
            return false;
        }
    }

    public static SwagLabsLoginResult containsTheProductsWord() {
        return new SwagLabsLoginResult();
    }
}
