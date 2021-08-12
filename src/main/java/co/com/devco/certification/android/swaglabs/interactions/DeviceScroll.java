package co.com.devco.certification.android.swaglabs.interactions;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Dimension;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class DeviceScroll implements Interaction {
    @Override
    @Step("{0} scroll into application")
    public <T extends Actor> void performAs(T actor) {
        MobileDriver webDriver = getProxiedDriver();
        Dimension dimension = webDriver.manage().window().getSize();

        Double inicio  = dimension.getHeight()*0.5;
        int scrollInicio = inicio.intValue();

        Double fin  = dimension.getHeight()*0.2;
        int scrollFin = fin.intValue();

        new TouchAction(webDriver).press(PointOption.point(0,scrollInicio))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(PointOption.point(0,scrollFin))
                .release().perform();
    }

    public static DeviceScroll element(){
        return instrumented(DeviceScroll.class);
    }
}
