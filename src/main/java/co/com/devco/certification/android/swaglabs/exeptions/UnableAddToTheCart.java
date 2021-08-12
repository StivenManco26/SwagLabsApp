package co.com.devco.certification.android.swaglabs.exeptions;
/**
 * Clase Exeption con Assert al adicionar producto al carrito
 *
 * @author manco.5@hotmail.com
 */
public class UnableAddToTheCart extends AssertionError{
    private static final String UNABLE_ADD_TO_THE_CART = "Error when adding product to shopping cart";
    public static String getUnableAddToTheCartMessage() {
        return UNABLE_ADD_TO_THE_CART;
    }

    public UnableAddToTheCart(String message, Throwable cause) {
        super(message, cause);
    }

}
