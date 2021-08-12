package co.com.devco.certification.android.swaglabs.tasks;

import co.com.devco.certification.android.swaglabs.models.InformationModel;
import co.com.devco.certification.android.swaglabs.userinterfaces.CheckoutInformationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Clase Task (tarea) para ingresar la informacion del pago
 * @author manco.5@hotmail.com
 */
public class EnterTheInformation implements Task {

    private InformationModel informationModel;

    public EnterTheInformation(InformationModel informationModel) {
        this.informationModel = informationModel;
    }

    @Override
    @Step("{0} Enter the checkout information in the fields")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(informationModel.getFirstName()).into(CheckoutInformationPage.FIRST_NAME_TEXTBOX),
                Enter.theValue(informationModel.getLastName()).into(CheckoutInformationPage.LAST_NAME_TEXTBOX),
                Enter.theValue(informationModel.getPostalCode()).into(CheckoutInformationPage.POSTAL_CODE_TEXTBOX),
                Click.on(CheckoutInformationPage.CONTINUE_BUTTON)
        );
    }

    public static EnterTheInformation checkout(InformationModel informationModel) {
        return instrumented(EnterTheInformation.class, informationModel);
    }
}
