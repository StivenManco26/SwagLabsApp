package co.com.devco.certification.android.swaglabs.tasks;

import co.com.devco.certification.android.swaglabs.models.UserModel;
import co.com.devco.certification.android.swaglabs.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Clase Task (tarea) para realizar el ingreso de las credenciales
 * necesarias en el login
 *
 * @author manco.5@hotmail.com
 */

public class EnterThe implements Task {
    private UserModel userModel;

    public EnterThe(UserModel userModel) {
        this.userModel = userModel;
    }

    @Override
    @Step("{0} Enter the credentials")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userModel.getUsername()).into(LoginPage.USERNAME_TEXTBOX),
                Enter.theValue(userModel.getPassword()).into(LoginPage.PASSWORD_TEXTBOX),
                Click.on(LoginPage.LOGIN_BUTTON));
    }

    public static EnterThe credentials(UserModel userModel) {
        return instrumented(EnterThe.class, userModel);
    }
}
