package co.com.devco.certification.android.swaglabs.tasks;

import co.com.devco.certification.android.swaglabs.utils.WaitApp;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

/**
 * Clase Task (tarea) para esperar que la aplicacion cargue
 * correctamente
 *
 * @author manco.5@hotmail.com
 */

public class OpenThe implements Task {

    @Override
    @Step("{0} wait for the app to run correctly")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitApp.initialized()
        );
    }

    public static OpenThe swagLabsApp() {
        return Tasks.instrumented(OpenThe.class);
    }
}
