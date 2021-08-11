package co.com.devco.certification.android.swaglabs.exeptions;
/**
 * Clase Exeption con Assert de inicio de sesion
 *
 * @author manco.5@hotmail.com
 */
public class UnableToLogin extends AssertionError{
    private static final String UNABLE_TO_LOGIN = "wrong credentials to login";
    public static String getUnableToLoginMessage() {
        return UNABLE_TO_LOGIN;
    }

    public UnableToLogin(String message, Throwable cause) {
        super(message, cause);
    }

}
