package pruebas.pract.stepdefinition.hook;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.hamcrest.Matchers;
import pruebas.pract.hook.IniciarSesion;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static pruebas.pract.utils.Constants.*;
import static pruebas.pract.utils.Time.waiting;

public class Hook {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Que el usuario está en la página de inicio de sesión de OrangeHRM")
    public void openBrowser() {
        OnStage.theActorCalled(ACTOR).attemptsTo(
                IniciarSesion.browserURL()
        );
        waiting(TIME_SHORT);
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        TheWebPage.title(),
                        Matchers.containsString(TITLE)
                )
        );
    }
}
