package pruebas.pract.stepdefinition;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.hamcrest.Matchers;
import pruebas.pract.tasks.IniciarSesion;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static pruebas.pract.utils.Constants.*;

public class IniciarSesionStep {

    private static EnvironmentVariables environmentVariables;
    private String user;
    private String pwd;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("el usuario ingresa las credenciales")
    public void enterCredentials() {
        user = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(USER_NAME);
        pwd = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(PWD);
        theActorCalled(ACTOR).attemptsTo(
                IniciarSesion.authentication(user, pwd)
        );
    }

    @Then("el usuario debería ser redirigido a la página de inicio del dashboard")
    public void viewDashboard() {
        // Aquí se puede agregar lógica de verificación si es necesario
    }

    @When("ingresa las credenciales")
    public void enterTheCredentials() {
        // Lógica adicional si se requiere
    }

    @Then("visualizara el home y espera una validacion")
    public void itWillDisplayTheHomeAndWaitForAValidation() {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        TheWebPage.title(),
                        Matchers.containsString(TITLE_WEBSITE)
                )
        );
    }
}
