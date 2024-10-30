package pruebas.pract.tasks;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static pruebas.pract.ui.IniciarSesionUI.*;
import static pruebas.pract.utils.Constants.TIME_SHORT;

@Slf4j
@AllArgsConstructor
public class IniciarSesion implements Task {

    private static EnvironmentVariables environmentVariables;
    private String user;
    private String pwd;

    @Override
    @Step("{0} se autentica y acepta la alert del mensaje")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(MODAL_LOGIN, isVisible())
                        .forNoMoreThan(TIME_SHORT).seconds(),
                Click.on(MODAL_LOGIN),
                Enter.theValue(user).into(INPUT_USER_NAME),
                Enter.theValue(pwd).into(INPUT_PASSWORD),
                Click.on(BUTTON_LOGIN)
        );


    }

    public static IniciarSesion authentication(String user, String pwd) {
        return Tasks.instrumented(IniciarSesion.class, user, pwd);
    }
}